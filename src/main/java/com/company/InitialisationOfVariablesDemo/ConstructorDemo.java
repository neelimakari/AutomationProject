package com.company.InitialisationOfVariablesDemo;

class ConstructorDemo2
{
    int practHrs;
    String result;

    public ConstructorDemo2(int practHrs, String result)
    {
System.out.println(practHrs+"*******" + result);
        this.practHrs=practHrs;
        this.result=result;
    }
public void hello()
{
    System.out.println(practHrs+"*******" + result);
}
}
public class ConstructorDemo
{
public static void main(String[] args)
{
    ConstructorDemo2 demo=new ConstructorDemo2(9,"job" );
    demo.hello();
}
}
