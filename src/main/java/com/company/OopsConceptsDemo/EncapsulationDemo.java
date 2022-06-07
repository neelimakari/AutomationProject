package com.company.OopsConceptsDemo;

class EncapsulationTest
{
    public int id = 456;
    public String name = "JAVA";
    public void hello()
    {
        System.out.println(id + "******" + name);
    }
    public int getId()
    {
        return id;
    }
public String getName()
{
    return name;
}
}
public class EncapsulationDemo {
    public static void main(String[] args)
    {
        EncapsulationTest test=new EncapsulationTest();
        test.hello();
        System.out.println(test.getId());
        System.out.println(test.getName());
        test.id = 91456;
        test.name="JAVA SELENIUM";
        test.hello();
    }
}
