import java.util.*;

class A
{
    public
    int a = 10;
    protected
    int b = 20;
    private
    int c = 30;
    public void print()
    {
        System.out.println(a+"\t"+b+"\t"+c+"\nPublic protected private");
    }
    protected void print5()
    {
        System.out.println(a+"\t"+b+"\t"+c+"\nPublic protected private");
    }
}

class B extends A 
{
    public void print1()
    {
        System.out.println(a+"\t"+b+"\t"+"Public protected");
    }
    private void print2()
    {
        System.out.println(a+"\t"+b+"\t"+"Public Protected");
    }
    protected void print3()
    {
        System.out.println(a+"\t"+b+"\t"+"Public Protected");
    }
    public void print4()
    {
        System.out.print(b);
    }
}

class C extends A
{
    protected void print7()
    {
        System.out.println(a+"\t"+b+"\t"+"\nPublic protected private");
    }
}

public class ppp
{
    public static void main(String [] args)
    {
        B obj = new B();
        obj.print();
        obj.print1();
        obj.print3();
        int d = obj.b;
        obj.b=100;
        System.out.println(d);
        obj.print3();
        obj.print5();
        C obj1 = new C();
        obj1.print7();
    }
}