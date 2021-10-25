/*
 * Multilevel Inheritance
 * a derived class will be inheriting a base class and as well as the derived class also act as the base class to other class.
 */

import java.util.*;

class print1
{
    public String month = " October ";
    public
    print1()
    {
        System.out.println("Welcome To multilevel inheritance area");
    }
    print1(int d, int m, int y)
    {
        System.out.println("Today is "+d+"\t"+m+"\t"+y); 
    }
}

class print2 extends print1
{
    public
    print2()
    {
        System.out.println("This is "+month);
    }
}

class print3 extends print2
{
    public
    print3()
    {
        System.out.println("Program Ends here");
    }
}

public class MLI
{
    public static void main(String [] args)
    {
        print3 obj = new print3();
    }
}