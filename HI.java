/*
 * Hierarchical Inheritance
 * one class serves as a superclass (base class) for more than one subclass
 */

import java.util.*;

class diceroll
{
    public
    diceroll()
    {
        System.out.println("1");
    }
}

class diceroll2 extends diceroll
{
    public
    diceroll2()
    {
        System.out.println("2");
    }
}

class diceroll3 extends diceroll
{
    public
    diceroll3()
    {
        System.out.println("3");
    }
}

class diceroll4 extends diceroll
{
    public
    diceroll4()
    {
        System.out.println("4");
    }
}

class diceroll5 extends diceroll
{
    public
    diceroll5()
    {
        System.out.println("5");
    }
}

class diceroll6 extends diceroll
{
    public
    diceroll6()
    {
        System.out.println("6");
    }
}

public class HI
{
    public static void main(String [] args)
    {
        diceroll2 obj = new diceroll2();
        diceroll3 obj1 = new diceroll3();
        diceroll4 obj2 = new diceroll4();
        diceroll5 obj3 = new diceroll5();
        diceroll6 obj4 = new diceroll6();
    }
}