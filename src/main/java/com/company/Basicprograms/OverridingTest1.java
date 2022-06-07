package com.company.Basicprograms;

class OverOne1
{
    public void education()
    {
        System.out.println("PC:education");
    }
    public void enjoyment()
    {
        System.out.println("PC:enjoyment");

    }
    public void hardwork()
    {
        System.out.println("PC:hardwork");

    }
    public void job()
    {
        System.out.println("PC:job");

    }
}
class OverOne2 extends OverOne1
{
 @Override
 public void education()
 {
     System.out.println("CC:I donot want education");
 }
    @Override
    public void hardwork()
    {
        System.out.println("CC:I donot do hardwork");
    }
    public void marriage()
    {
        System.out.println("I donot want marriage");
    }
}
public class OverridingTest1
{
    public static void main(String[] args)
    {
        /*OverOne1 one1=new OverOne1();
        one1.education();
        one1.enjoyment();
        one1.hardwork();
        one1.job();*/
        OverOne2 one2=new OverOne2();
        one2.education();
        one2.enjoyment();
        one2.job();
        one2.marriage();
    }
}
