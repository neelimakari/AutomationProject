package com.automation.seleniumCorePrograms;

import java.util.HashSet;

public class HashSetTest
{
    public static void main(String[] args)
    {
        HashSet set=new HashSet();
        //LinkedHashSet set=new LinkedHashSet();
        System.out.println(set.add(456));
        System.out.println(set.add("Neelima"));
        System.out.println(set.add("Java"));
        set.add('N');
        set.add("TRUE");
        set.add(null);
        System.out.println(set);
    }
}
