import java.util.*;

public class calsquare
{
    public void square(int n)
    {
        int s = n*n;
        System.out.println("Square of an integer is : "+s);
    }
    
    public void square(double n) 
    {
        double s = n*n;
        System.out.println("Square of double is : "+s);
    }
    
    public static void main(String [] args)
    {
        calsquare obj=new calsquare();
        
        obj.square(10.5); // checks the parameter and data type with the function that has being called
        obj.square(20);
    }
}