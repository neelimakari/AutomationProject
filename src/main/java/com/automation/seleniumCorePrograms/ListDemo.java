package com.automation.seleniumCorePrograms;

import java.util.ArrayList;

public class ListDemo
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList<>();
        al.add("neelima");
        al.add("itjob");
        al.add("family");
        al.add("house");
        al.add("hardwork");
        System.out.println(al);
        /*Enumeration enumeration = al.element() ;
        while(enumeration.hasMoreElements())
        {
           Object obj=enumeration.nextElement();
           String str=(String) obj;
           if(str.equalsIgnoreCase("java"))
           {
               System.out.println("I am doing practice"+str);
           }
           System.out.println(str);*/
    /*Iterator itr=al.iterator();
    while(itr.hasNext())
    {
        Object obj=itr.next();
        String str=(String) obj;
        if(str.equalsIgnoreCase("house"))
        {
            System.out.println("I am doing practice"+str);
        }
        System.out.println(str);*/
        for(Object obj:al)
        {
            String str= (String) obj;
            if(str.equalsIgnoreCase("house"))
            {
                System.out.println("I am doing practice"+str);
            }
            System.out.println(str);
            String[] strg={"neelima","itjob","family","house"};
            for(String str1 : strg)
            {
                System.out.println(str1);
            }

    }










    }
}
