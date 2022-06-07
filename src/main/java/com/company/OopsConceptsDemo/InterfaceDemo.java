package com.company.OopsConceptsDemo;

interface Demo
{
    void m1();
    default void m2()
    {
        System.out.println("m2()");
    }
    public static void m3()
    {
        System.out.println("m3()");
    }
}
public class InterfaceDemo
{
    public static void main(String[] args)
    {
    }
}
