package com.company.Basicprograms;

public class SwitchCase
{
    public static void main(String[] args)
    {
        String browser="ie";
        switch(browser)
        {
            case "ie" : System.out.println("IE BROWSER");
            break;
            case "chrome" : System.out.println("CHROME BROWSER");
                break;
            case "firefox" : System.out.println("FIREFOX BROWSER");
                break;
            case "edge" :    System.out.println("EDGE BROWSER");
                break;
            default: System.out.println("NO CASE IS MATCHED");
            break;
        }
    System.out.println("NS1");
        System.out.println("NS2");

    }

}
