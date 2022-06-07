package com.company.InitialisationOfVariablesDemo;


class ConstructorsDemo2
{
    public ConstructorsDemo2()
    {
        System.out.println("PC:DC");
    }

}
class ConstructorsDemo1 extends ConstructorsDemo2
{
    public ConstructorsDemo1()
    {
        this(9);
        System.out.println("DC:ConstructorsDemo1");
    }
    public ConstructorsDemo1(int id)
    {
        System.out.println("1 int:ConstructorsDemo1"+id);
    }
}
public class ConstructorsDemo
{
public static void main(String[] args)
{
    ConstructorsDemo1 demo=new ConstructorsDemo1();
}
}