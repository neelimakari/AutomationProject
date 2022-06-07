package com.company.InitialisationOfVariablesDemo;
interface Demo1
{
    void hello1();
    void hello2();
    interface Demo2
    {
        void hello3();
        void hello4();
    }
}
class Demo1Impl implements Demo1
{
    @Override
    public void hello1()
    {
        System.out.println("hello1()");
    }
    @Override
    public void hello2()
    {
        System.out.println("hello2()");
    }
}
class Demo2Impl implements Demo1.Demo2
{

    @Override
    public void hello3()
    {
        System.out.println("hello3()");
    }

    @Override
    public void hello4()
    {
        System.out.println("hello4()");
    }
}
class Demo1Demo2Impl implements Demo1,Demo1.Demo2
{
    @Override
    public void hello1()
    {
        System.out.println("hello1()");
    }
    @Override
    public void hello2()
    {
        System.out.println("hello2()");
    }
    @Override
    public void hello3()
    {
        System.out.println("hello3()");
    }

    @Override
    public void hello4()
    {
        System.out.println("hello4()");
    }

}
public class InnerInterfacesTest
{
    public static void main(String[] args)
    {
     //Demo1 demo=new Demo1Impl();
     //demo.hello1();
     //demo.hello2();
        //Demo1Impl demo=new Demo1Impl();
        Demo1.Demo2 demo=new Demo2Impl();
        demo.hello4();
        demo.hello3();
    }
}
