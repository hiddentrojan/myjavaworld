import java.util.*;

class demo
{
    private
    int num;
    static int count;
    
    public
    void getdata(int n)
    {
        num=n;
        count=count+1;
    }
    
    void display()
    {
        System.out.println("\nNum value is :"+num);
        
    }
    
    static void putdata() // static can be called using class name. You can also call it using obj, if any parameter is being send then is will check the parameter
    {
        System.out.println("\nTotal Count is  :"+count);
    }
}

public class stat
{
    public static void main (String [] args)
    {
        demo obj1=new demo();
        demo obj2=new demo();
        demo obj3=new demo();
        
        obj1.getdata(10);
        obj2.getdata(20);
        obj3.getdata(30);
        
        obj1.display();
        demo.putdata();
        obj2.display();
        demo.putdata();
        obj3.display();
        demo.putdata();
        
    }
}