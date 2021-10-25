import java.util.*;

class cons
{
    private 
    int num;
    
    public 
    
    void cons()
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Number : ");
       num = sc.nextInt();
    }
    
    void cons(int a)
    {
        num = a;
    }
    
    void display()
    {
        System.out.println("The Number Entered is  : "+num);
    }
    
}

public class kons
{
    public static void main (String [] args)
    {
        cons obj1 = new cons();
        cons obj2 = new cons();
        obj1.cons();
        int a = 10; 
        obj2.cons(a);
        obj1.display();
        obj2.display();
    }
}