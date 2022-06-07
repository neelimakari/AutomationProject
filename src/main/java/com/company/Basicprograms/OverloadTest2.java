package com.company.Basicprograms;

    class OverloadDemo2
    {
        public int addition(int num1, int num2)
        {
            int result= num1+num2;
            System.out.println("Result is:"+result);
            return result;
        }
        public float addition(float num1, float num2)
        {
            float result= num1+num2;
            System.out.println("Result is:"+result);
            return result;
        }
        public double addition(double num1, double num2)
        {
            double result= num1+num2;
            System.out.println("Result is:"+result);
            return result;
        }
    }

    public class OverloadTest2
    {
        public static void main(String[] args)
        {
            OverloadDemo2 demo=new OverloadDemo2();
            demo.addition(25,75);
            demo.addition(1250.75f,1750.25f);
            demo.addition(1250.00,1750.00);
        }
    }
