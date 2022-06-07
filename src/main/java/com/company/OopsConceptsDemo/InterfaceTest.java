package com.company.OopsConceptsDemo;

abstract interface HumanLife
{
    String name="Human Life";
    void child();
    void education();
    public abstract void job();
    public void family();
    public static void marriage()
    {
        System.out.println("Marriage= GOD GIFT");
    }
}
abstract class HumanLifeImp1 implements HumanLife
{
    @Override
    public void child()
    {
        System.out.println("CHILD");
    }
    @Override
    public void education()
        {
            System.out.println("EDUCATION");
        }
@Override
    public void job()
{
    System.out.println("JOB");
}
public void hello()
{
    System.out.println("SOFTWARE=APPLYING COMMON SENSE");
}
}
class HumanLifeImp1One extends HumanLifeImp1
{
    @Override
    public void family()
    {
        System.out.println("FAMILY");
    }
public void entirment()
{
    System.out.println("IT IS MANDATORY");
}
}
public interface InterfaceTest {
    public static void main(String[] args) {
        HumanLifeImp1 humanLifeImp1 = new HumanLifeImp1One();
        humanLifeImp1.child();
        humanLifeImp1.education();
        humanLifeImp1.family();
        humanLifeImp1.hello();
        humanLifeImp1.job();
        System.out.println(HumanLife.name);
        HumanLife humanLife = new HumanLifeImp1One();
        humanLife.child();
        humanLife.education();
        humanLife.job();
        System.out.println(HumanLife.name);
        HumanLife.marriage();
    }
}