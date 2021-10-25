import java.util.*;

class parent
{
    public parent() // default constructor
    {
        System.out.println("Parent Class");
    }
    public parent(int a) // parameterized constructor
    {
        System.out.println("Parent Class : Value of a : "+a);
    }
}

class child extends parent
{
    public child() // default constructor
    {
        // creates a super function by default when class gets called 
        // super();
        System.out.println("Child Class");
    }
    public child(int a) // parameterized constructor
    {
        super(a);
        System.out.println("Child Class : Value of a : "+a);
    }
}

public class skey_c
{
    public static void main(String [] args)
    {
        child obj = new child(10);
    }
}