import java.util.*;

class shape
{
    public
    double x, y, result;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        x=sc.nextDouble();
        y=sc.nextDouble();
    }
    void getdata(double pie)
    {
        Scanner sc = new Scanner(System.in);
        x=pie;
        y=sc.nextDouble();
    }
}

class area_triangle extends shape
{
    public void calculate()
    {
        result=0.5*x*y;
        System.out.println("Area Of Triangle is : "+result);
    }
}

class area_rectangle extends shape
{
    public void calculate()
    {
        result=x*y;
        System.out.println("Area Of Rectangle is : "+result);
    }
}

class area_circle extends shape
{
    public void calculate()
    {
        result=x*y*y;
        System.out.println("Area Of Circle is : "+result);
    }
}

public class shape_complietime
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
                    area_triangle obj = new area_triangle();
                    obj.getdata();
                    obj.calculate();
                    break;
                case 2 :
                    area_rectangle obj1 = new area_rectangle();
                    obj1.getdata();
                    obj1.calculate();
                    break;
                case 3 :
                    area_circle obj2 = new area_circle();
                    obj2.getdata(3.14);
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