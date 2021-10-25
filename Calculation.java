import java.util.*;

class Area
{
    public
    double result;
    Area()
    {
        result=0;
    }
    void calculate(double v, double b, double h)
    {
        result=v*b*h;
        System.out.println("Area Of Triangle is : "+result);
    }
    void calculate(double l, double h)
    {
        result=l*h;
        System.out.println("Area Of Rectangle is : "+result);
    }
    void calculate(double r)
    {
        result=3.14*r*r;
        System.out.println("Area Of Circle is : "+result);
    }
}

public class Calculation
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        Area obj = new Area();
        do
        {
            System.out.print("1]Triangle\n2]Rectangle\n3]Circle\n4]Exit\nEnter Your Choice : ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1 :
                    double b, h;
                    System.out.print("\nEnter the Base of the triangle :");
                    b=sc.nextDouble();
                    System.out.print("\nEnter the Height of the triangle:");
                    h=sc.nextDouble();
                    obj.calculate(0.5, b, h);
                    break;
                case 2 :
                    double L, B;
                    System.out.print("\nEnter the length of the Rectangle :");
                    L=sc.nextDouble();
                    System.out.print("\nEnter the breadth of the Rectangle:");
                    B=sc.nextDouble();
                    obj.calculate(L, B);
                    break;
                case 3 :
                    double r;
                    System.out.print("\nEnter the radius of circle :");
                    r=sc.nextDouble();
                    obj.calculate(r);
                    break;
                case 4 :
                    System.exit(0);
                    break;
                default : System.out.println("Wrong Choice");
            }
        }while(choice!=4);
    }
}