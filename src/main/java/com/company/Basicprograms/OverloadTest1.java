package com.company.Basicprograms;

class OverloadDemo1
{
    int num1=25, num2=65;
    public int addition(int num1, int num2)
    {
        int result= num1+num2;
        System.out.println("Result is:"+result);
        return result;
    }
}
public class OverloadTest1
{
    public static void main(String[] args)
    {
        OverloadDemo1 demo=new OverloadDemo1();
        demo.addition(25,75);
        demo.addition(1250,1750);
    }
}
