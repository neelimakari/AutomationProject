package com.company.InitialisationOfVariablesDemo;

class BlocksDemo1
{
    static
    {
        System.out.println("PC:SB1");
    }
    {
        System.out.println("PC:IB1");
    }
}
public class BlocksDemo extends BlocksDemo1
{
    static
    {
        System.out.println("CC:SB1");
    }
    {
        System.out.println("CC:IB1");
    }
    public BlocksDemo()
    {
        System.out.println("CC:DC");

    }

    public static void main(String[] args)
    {
        /*BlocksDemo1 demo=new BlocksDemo1();*/
        BlocksDemo demo=new BlocksDemo();
    }

}
