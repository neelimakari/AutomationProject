package com.company.OopsConceptsDemo;
class PojoDemo2
{
    private int id;
    private String result;
    private double salary;
    public void setId(int id1)
    {
        this.id=id1;
    }
    public void setResult(String res)
    {
        this.result=res;
    }
    public void setSalary(double sal)
    {
        this.salary=sal;
    }
    public String getResult()
    {
        return result;
    }
    public int getId()
    {
        return id;
    }
    public double getSalary()
    {
        return salary;
    }
}
public class PojoTest2
{
    public static void main(String[] args)
    {
    PojoDemo2 demo2=new PojoDemo2();
    demo2.setId(91456);
    demo2.setResult("JOB");
    demo2.setSalary(3000.25);
    System.out.println(demo2.getId());
    System.out.println(demo2.getResult());
    System.out.println(demo2.getSalary());
    }
}
