import java.util.*;

class parent
{
    public void display()
    {
        System.out.println("Parent Class");
    }
}

class child extends parent
{
    public void display()
    {
        System.out.println("Child Class");
        super.display();
    }
}

public class skey
{
    public static void main(String [] args)
    {
        child obj = new child();
        obj.display();
    }
}