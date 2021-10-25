import java.util.*;
class addition
{
    private int num;
    
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
    }
    
    public void add(addition a, addition b) // a b
    {
        num=a.num+b.num;
    }
    
    public void display()
    {
        System.out.println(num);
    }
}

public class basicdemo
{
    public static void main(String[] args)
    {
        addition obj1 =new addition();
        addition obj2 =new addition();
        addition obj3 =new addition();
        
        System.out.print("\n Accept the First Number :");
        obj1.accept();
        System.out.print("\n Accept the Second Number :");
        obj2.accept();
        
        /*obj1.display();
        obj2.display();
        */
        obj3.add(obj1, obj2);
        System.out.print("\n The Addition is :");
        obj3.display();
    }
}