package com.company.OopsConceptsDemo;

class PojoDemo1
{
 private int id;
 private String result;
 private double salary;
 public void setId(int id)
 {
   this.id=id;
 }
 public int getId()
 {
  return id;
 }
 public void setResult(String result)
 {
  this.result=result;
 }
 public String getResult()
 {
  return result;
 }
public void setSalary(double salary)
{
 this.salary=salary;
}
public double getSalary()
{
 return salary;
}
}
class PojoTest1
{
    public static void main(String[] args)
    {
PojoDemo1 demo1=new PojoDemo1();
demo1.setId(45);
System.out.println(demo1.getId());
demo1.setResult("JOB");
System.out.println(demo1.getResult());
demo1.setSalary(3000.25);
System.out.println(demo1.getSalary());
    }
}
