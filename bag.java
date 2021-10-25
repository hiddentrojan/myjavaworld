/*
 * A bag consists of zero or more objects of the same type. Each object can be described by its color and weight.
 * Design C++ program to create a new object. This can be done in two ways. 
 * If the user provides information about color and/or weight of the object to be created then this information will be used to create the object otherwise the object will be created using default values for these attributes.
 * Provide a facility to keep track of total number of objects and total weight of object from a bag.
*/

import java.util.*;

class loadbag
{
    private 
    double weight;
    String color;
    
    public 
    void getdata()
    {
       Scanner sc =  new Scanner(System.in);
       System.out.print("Enter The Color of the Ball : ");
       color = sc.next();
       System.out.print("Enter The Weight of the Ball : ");
       weight = sc.nextDouble();
    }
    
    void getdata(String bname, double bweight)
    {
        color=bname;
        weight=bweight;
    }
    void display()
    {
        System.out.println(color+"\t"+weight+"\n");
    }
}


public class bag
{
    public static void main (String [] agrs)
    {
        Scanner sc = new Scanner(System.in);
        int choice, i;
        
        do
        {
            System.out.print("1]User-Defined\n2]Pre-Defined\n3]Exit\nEnter Your Choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1 : System.out.print("Enter The Number of Balls to be stored in the bag : ");
                     int userdefined=sc.nextInt();
                    loadbag [] lbu = new loadbag[userdefined];
                    for(i=0;i<userdefined;i++)
                    {
                       lbu[i] = new loadbag(); 
                    }
                    for(i=0;i<userdefined;i++)
                    {
                        lbu[i].getdata();
                    }
                    System.out.println("Color\tWeight");
                    for(i=0;i<userdefined;i++)
                    {
                        lbu[i].display();
                    }
                    break;
                    
                case 2 :
                    int predefined=5;
                    loadbag[] lbp = new loadbag[predefined];
                    for(i=0;i<predefined;i++)
                    {
                        lbp[i]=new loadbag();
                    }
                    String bn[] = {"Blue", "Black", "Red", "Yellow", "Green"};
                    double bw[] = {10.1, 20.1, 30.1, 40.1, 50.1};
                    for(i=0;i<predefined;i++)
                    {
                        lbp[i].getdata(bn[i],bw[i]);
                    }
                    System.out.println("Color\tWeight");
                    for(i=0;i<predefined;i++)
                    {
                        lbp[i].display();
                    }
                    break;
                    
                case 3 : System.out.println("The Prgram Ends Here.");
                break;
                
                default : System.out.println("Wrong Choice");
            }
            
        }while(choice!=3);
    }
}