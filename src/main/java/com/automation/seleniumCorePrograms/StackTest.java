package com.automation.seleniumCorePrograms;

import java.util.Stack;

public class StackTest
{
    public static void main(String[] args)
    {
        Stack stack=new Stack<>();
        stack.add(456);
        stack.addElement(7394018955l);
        stack.push("IT JOB");
        stack.addElement("FAMILY");
        stack.push("HOUSE");
        stack.add(null);
        System.out.println(stack);

    }
}
