package com.filpkart;

class Fp_Men
{
    String name="JOB";
    public void login()
    {
        System.out.println("Login()");
    }
    public void clothes()
    {
        System.out.println("Clothes()");
    }
    public void logout()
    {
        System.out.println("Logout()");
    }
}
class Fp_Women extends Fp_Men
{
    public void goldAndDiamonds()
    {
        System.out.println("goldAndDiamonds()");
    }
}
class Fp_Kids extends Fp_Women
{
    public void toys()
    {
        System.out.println("toys()");
    }
}

public class Fp_Test
{
public static void main(String[] args)
{
    /*Fp_Men men=new Fp_Men();
    men.login();
    men.clothes();
    men.logout();
    Fp_Women women=new Fp_Women();
    women.login();
    women.clothes();
    women.logout();
    women.goldAndDiamonds();*/
    /*Fp_Men men=new Fp_Women();
    men.login();
    men.clothes();
    men.logout();
    */


}
}
