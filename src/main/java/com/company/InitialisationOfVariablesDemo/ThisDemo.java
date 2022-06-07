package com.company.InitialisationOfVariablesDemo;

class ConstructorDemo3
{
    int practHrs=14;
    String result= "JOB";
    public void hello()
    {
        System.out.println(practHrs+"************"+result);
    }
}
class ConstructorDemo1 extends ConstructorDemo3
{
    int practHrs;
    String result;
    public ConstructorDemo1()
    {
        System.out.println("Default constructor");
    }
public ConstructorDemo1(int pHrs, String res)
{
    System.out.println(pHrs+"*********"+res);
    practHrs=pHrs;
    result=res;
    super.hello();
}
public void hello()
{
    System.out.println(practHrs+"*********"+result);
    System.out.println(this.practHrs+"*********"+this.result);
    System.out.println(super.practHrs+"*********"+super.result);
    super.hello();
}

}
public class ThisDemo {
    public static void main(String[] args) {
        ConstructorDemo1 demo = new ConstructorDemo1(9, "job");
        demo.hello();
        ConstructorDemo1 demo1 = new ConstructorDemo1('a', "job");
        demo1.hello();
    }
}
