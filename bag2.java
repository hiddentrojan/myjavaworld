/*
 * A bag consists of zero or more objects of the same type. Each object can be described by its color and weight.
 * Design C++ program to create a new object. This can be done in two ways. 
 * If the user provides information about color and/or weight of the object to be created then this information will be used to create the object otherwise the object will be created using default values for these attributes.
 * Provide a facility to keep track of total number of objects and total weight of object from a bag.
*/

import java.util.*;

class bagload
{
    private
    double weight;
    String color;
    
    static int to;
    static double tw;
    
    public
    
    void getdata()
    {
        color="Red";
        weight = 10.1;
        to=to+1;
        tw=weight+tw;
    }
    
    void getdata(double w)
    {
        color="Red";
        weight=w;
        to=to+1;
        tw=weight+tw;
    }
    
    void getdata(String c)
    {
        color=c;
        weight= 10.1;
        to=to+1;
        tw=weight+tw;
    }
    
    void getdata(String c, double w)
    {
        color=c;
        weight=w;
        to=to+1;
        tw=weight+tw;
    }
    
    void display()
    {
        System.out.print(color+"\t"+weight+"\n");
    }
    
    static void dis()
    {
        System.out.print("Total Weight : "+tw+"\n");
        System.out.print("Total Object : "+to+"\n");
    }
}

public class bag2
{
    public static void main (String [] agrs)
    {
        Scanner sc = new Scanner (System.in);
        
        double weight;
        String color;
        
        System.out.print("Weight : ");
        weight=sc.nextDouble();
        System.out.print("Color : ");
        color=sc.next();
        
        bagload[] bl = new bagload[10];
        for(int i=0;i<10;i++)
        {
            bl[i]= new bagload();
        }
        
        int count = 0;
        bl[count].getdata();
        count=count+1;
        
        bl[count].getdata(weight);
        count=count+1;
        
        bl[count].getdata(color);
        count=count+1;
        
        bl[count].getdata(color, weight);
        count=count+1;
        
        for(int i=0;i<count;i++)
        {
            bl[i].display();
        }
        
        bagload.dis();
    }
}