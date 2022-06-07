package com.company.InitialisationOfVariablesDemo;
class OuterOne
{
    public void hello1()
    {
        System.out.println("OC:hello1()");
    }
    static public void hello2()
    {
        System.out.println("OC:hello2()");
    }
    class Inner1
    {
        public void hello3()
        {
            System.out.println("NIC.hello3()");
        }
    }
    static class Inner2
    {
        public void hello4()
        {
            System.out.println("SIC:hello4()");
        }
        static public void hello5()
        {
            System.out.println("SIC:hello5()");
        }
    }
}

public class InnerTest
{
public static void main(String[] args)
{
    /*OuterOne one=new OuterOne();
    one.hello1();
    one.hello2();*/
    /*OuterOne.Inner2 inner2=new OuterOne.Inner2();
    inner2.hello4();
    inner2.hello5();
    OuterOne.Inner2.hello5();*/

}
}
