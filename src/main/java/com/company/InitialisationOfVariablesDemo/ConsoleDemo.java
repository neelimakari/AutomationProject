package com.company.InitialisationOfVariablesDemo;

import java.util.Scanner;

class ConsoleDemo1
{
    int id;
    String result;
    public void hello()
    {
        System.out.println(id+"****"+ result);
    }
}
public class ConsoleDemo
{
  public static void main(String[] args)
  {
      ConsoleDemo1 demo2=new ConsoleDemo1();
      System.out.println("Enter id");
     Scanner scanner=new Scanner(System.in);
     //int id1=scanner.nextInt();
     //demo2.id=id1;
      demo2.id=scanner.nextInt();
     System.out.println("Enter the result:");
     String result1=scanner.next();
      demo2.result=result1;
      demo2.hello();
  }
}
