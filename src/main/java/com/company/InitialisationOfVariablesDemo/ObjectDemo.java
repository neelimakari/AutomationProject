package com.company.InitialisationOfVariablesDemo;
class ObjectDemo1
{
    int id;
    String result;
    public void hello()
    {
        System.out.println(id+"********"+result);
    }
}
public class ObjectDemo
{
    public static void main(String[] args)
    {
        ObjectDemo1 demo=new ObjectDemo1();
        demo.id=91456;
        demo.result="JOB";
        demo.hello();
        ObjectDemo1 demo1=new ObjectDemo1();
        demo1.id=914;
        demo1.result="IT JOB";
        demo1.hello();
    }
}
