/*
 * A bag consists of zero or more objects of the same type. Each object can be described by its color and weight.
 * Design C++ program to create a new object. This can be done in two ways. 
 * If the user provides information about color and/or weight of the object to be created then this information will be used to create the object otherwise the object will be created using default values for these attributes.
 * Provide a facility to keep track of total number of objects and total weight of object from a bag.
*/

import java.util.*;

class getdata
{
    // Private variable declaration
    private double weight;
    private String color;
    
    //Static variable declaration
    static double total_weight;
    static int total_object;
    
    public
    getdata()
    {
        color="Red";
        weight=10.1;
        total_object+=1;
        total_weight+=weight;
    }
    getdata(double wt)
    {
        color="Red";
        weight=wt;
        total_object+=1;
        total_weight+=weight;
    }
    getdata(String cl)
    {
        color=cl;
        weight=10.1;
        total_object+=1;
        total_weight+=weight;
    }
    getdata(double wt, String cl)
    {
        color=cl;
        weight=wt;
        total_object+=1;
        total_weight+=weight;
    }
    void display()
    {
        System.out.print(color+"\t"+weight+"\n");   
    }
    static void dis()
    {
        System.out.println("Total Weight : "+total_weight);
        System.out.println("Total Objects : "+total_object);
    }
}

public class bag3
{
    public static void main (String [] args)
    {
        // variable declaration
        double wt;
        String cl;
        
        //User Input Taking Process
        Scanner sc = new Scanner(System.in);
        System.out.print("Weight : ");
        wt=sc.nextDouble();
        System.out.print("Color : ");
        cl=sc.next();
        //User Input has being stored in the variable declared
        
        //Creating Objects
         getdata [] obj = new getdata[10];
         int count = getdata.total_object;
         
         obj[count] = new getdata();
         count=getdata.total_object;
         
         obj[count] = new getdata(wt);
         count=getdata.total_object;
         
         obj[count] = new getdata(cl);
         count=getdata.total_object;
         
         obj[count] = new getdata(wt,cl);
         count=getdata.total_object;
         
         for(int i=0;i<count;i++)
         {
             obj[i].display();
         }
         getdata.dis();
        
    }
}