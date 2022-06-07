package com.company.OopsConceptsDemo;

class AbsDemo {
    int practice = 9;
    String result = "JOB";

    public void hello() {
        System.out.println(practice + "*******" + result);
    }
}

public class AbstractDemo1
{
    public static void main(String[] args)
    {
        AbsDemo demo=new AbsDemo();
        demo.practice=0;
        demo.result="Budidha";
        demo.hello();
    }
}
