package com.company.OopsConceptsDemo;

abstract class AbDemo
{
    public void hello()
    {
        System.out.println("BAbu donnot sleep in class");
    }
    abstract public void ifYouDonotPractice();
    public abstract void job();
}

abstract class AbsDemo1 extends AbDemo{
    @Override
    public void ifYouDonotPractice()
    {
        System.out.println("Please do practice");
    }
    public void hike()
    {
        System.out.println("hike");
    }
}
    class AbsDemo2 extends AbsDemo1
    {
        @Override
        public void job()
        {
            System.out.println("Job");
        }
    public void proActive()
    {
        System.out.println("Proactive=hike");
    }
    }
public class AbsTest
{
    public static void main(String[] args)
    {
        AbsDemo2 demo=new AbsDemo2();
        demo.job();
        demo.proActive();
        demo.ifYouDonotPractice();
    }
}
