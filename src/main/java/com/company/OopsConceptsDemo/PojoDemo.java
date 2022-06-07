package com.company.OopsConceptsDemo;

public class PojoDemo
{
    private int id=91456;
    private double salary=3000.25;
    private String result="JOB";
    public int getId()
    {
        return id;
    }
    public String getResult()
    {
        return result;
    }
   public double getSalary()
   {
       return salary;
   }
}
class PojoTest
{
    public static void main(String[] args)
    {
        PojoDemo demo=new PojoDemo();
        int idResp=demo.getId();
        System.out.println(idResp);
        double salaryResp=demo.getSalary();
        System.out.println(salaryResp);
        String resultResp=demo.getResult();
        System.out.println(resultResp);
    }
}