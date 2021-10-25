/*
 * TITLE : OVERRDING FUNCTION USING RUN TIME POLYMORPHISM
 * AIM : CREATE AN AREA CALCULATING FUNCTION BY OVERRIDING
 * DEFINATION :
 *              RUN TIME POLYMORPHISM : CREATING AN OBJECT OF BASE CLASS AND CALL THE DERIVED CLASS IN WHICH THE BASE CLASS IS EXTENDED.
 *              EXAMPLE :
 *              
 *              class sample
 *              {
 *                  public
 *                  void sample()
 *                  {
 *                  }
 *                  void sample2()
 *                  {
 *                  }
 *               }
 *               class sample 3
 *               {
 *                   public
 *                  void sample()
 *                  {
 *                  }
 *                  void sample2()
 *                  {
 *                  }
 *                }
 *                
 *                sample obj = new sample3();
 *                obj.sample();
 *                obj.sample2();
 */



import java.util.*;

class shape
{
    public 
    void getdata()
    {
        
    }
    void calculate()
    {
        
    }
}

class area_triangle extends shape
{
    private double b, h, area_t;
    public 
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the base:");
        b=sc.nextDouble();
        System.out.print("\nEnter the height:");
        h=sc.nextDouble();
    }
    void calculate()
    {
        area_t=0.5*b*h;
        System.out.println("Area Of Triangle is : "+area_t);
    }
}

class area_rectangle extends shape
{
    private double l, b, area_r;
    public 
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the length:");
        l=sc.nextDouble();
        System.out.print("\nEnter the breadth:");
        b=sc.nextDouble();
    }
    void calculate()
    {
        area_r=l*b;
        System.out.println("Area Of Rectangle is : "+area_r);
    }
}

class area_circle extends shape
{
    private double r, area_c;
    public 
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the radius:");
        r=sc.nextDouble();
    }
    void calculate()
    {
        area_c=3.14*r*r;
        System.out.println("Area Of Circle is : "+area_c);
    }
}

public class shape_override_rt
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.print("1]Triangle\n2]Rectangle\n3]Circle\n4]Exit\nEnter Your Choice : ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1 :
                    shape obj = new area_triangle();
                    obj.getdata();
                    obj.calculate();
                    break;
                case 2 :
                    shape obj1 = new area_rectangle();
                    obj1.getdata();
                    obj1.calculate();
                    break;
                case 3 :
                    shape obj2 = new area_circle();
                    obj2.getdata();
                    obj2.calculate();
                    break;
                case 4 :
                    System.exit(0);
                    break;
                default : System.out.println("Wrong Choice");
            }
        }while(choice!=4);
    }
}