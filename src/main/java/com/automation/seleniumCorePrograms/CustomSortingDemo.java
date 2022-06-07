package com.automation.seleniumCorePrograms;

import java.util.Comparator;
import java.util.TreeSet;

class CustomSorting implements Comparator
{
    public int compare(Object arg0, Object arg1)
    {
        String str1=(String) arg0;
        String str2=(String) arg1;
        return str1.compareTo(str2);
}
}
public class CustomSortingDemo
{
    public static void main(String[] args)
    {

        CustomSorting sorting=new CustomSorting();
        TreeSet set=new TreeSet<>(sorting);
        set.add("hello");
        set.add("Neelima");
        set.add("IT JOB");
        System.out.println(set);
    }
}
