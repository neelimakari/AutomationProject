package com.automation.seleniumCorePrograms;

public class ArraysDemoTest
{
    public static void main(String[] args)
    {
    /*int[] i=new int[9];
    i[0]=456;
    i[1]=12345;
    i[2]=45678;
    i[3]=12;
    i[4]=234;
    i[6]=4567;
    i[7]=89011;
    i[8]="Neelima";
    for(int j=0;j<i.length;j++)
    {
        System.out.println(i[j]);
    }*/
        String[][] str=new String[2][2];
        str[0][0]="java";
        str[0][1]="neelima";
        str[1][0]="job";
        str[1][1]="it job";
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str.length;j++)
            {
                System.out.println(str[i][j]);
            }
        }
    }
}
