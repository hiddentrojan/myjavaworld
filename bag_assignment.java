import java.util.*;

class bag_ball
{
    //variable declaraion as private
    private
    String color;
    double weight;
    //static variable declaration
    static int total_object;
    static double total_weight;
    //method declaration public
    public
    bag_ball() // Default Constructor
    {
        color="ReddishBrown";
        weight=10.52;
        total_object=total_object+1;
        total_weight=total_weight+weight;
    }
    bag_ball(double wt) //parameterized contructor
    {
        color="ReddishBrown";
        weight=wt;
        total_object=total_object+1;
        total_weight=total_weight+weight;
    }
    bag_ball(String cl)
    {
        color=cl;
        weight=10.52;
        total_object=total_object+1;
        total_weight=total_weight+weight;
    }
    bag_ball(double wt, String cl)
    {
        color=cl;
        weight=wt;
        total_object=total_object+1;
        total_weight=total_weight+weight;
    }
    void display(int n)
    {
        System.out.println(n+"\t"+color+"\t"+weight+"\n");
    }
    void deleteball(int n, bag_ball d[])
    {
        total_weight=total_weight-weight;
        for(int i = n;i<total_object+1;i++)
        {
            d[i]=d[i+1];
        }
        System.out.println("Element deleted");
        total_object=total_object-1;
    }
    static void displaytotal()
    {
        System.out.println("Total Weight : "+total_weight);
        System.out.println("Total Object : "+total_object);
    }
}

public class bag_assignment
{
    public static void main(String [] args)
    {
        //Scanner Class declaration
        Scanner sc = new Scanner(System.in);
        //object creation
        bag_ball[] obj = new bag_ball[10];
        //variable declaration
        int choice, count=bag_ball.total_object;
        do
        {
            System.out.print("1]Default Values\n2]Weight\n3]Color\n4]Weight and Color\n5]Delete\n6]Display\n7]Exit\nEnter Your Choice : ");
            choice=sc.nextInt(); // storing the choice 
            // menu driven starts
            switch(choice)
            {
                case 1 :
                    obj[count]=new bag_ball();
                    count=bag_ball.total_object;
                    break;
                case 2 :
                    double wt;
                    System.out.print("\nEnter The Weight :");
                    wt=sc.nextDouble();
                    obj[count]=new bag_ball(wt);
                    count=bag_ball.total_object;
                    break;
                case 3 :
                    String cl;
                    System.out.print("\nEnter The Color :");
                    cl=sc.next();
                    obj[count]=new bag_ball(cl);
                    count=bag_ball.total_object;
                    break;
                case 4 :
                    String cl1;
                    double wt1;
                    System.out.print("\nEnter The Weight : ");
                    wt1=sc.nextDouble();
                    System.out.print("\nEnter The Color : ");
                    cl1=sc.next();
                    obj[count]=new bag_ball(wt1, cl1);
                    count=bag_ball.total_object;
                    break;
                case 5 :
                    int de;
                    System.out.print("\nEnter The Ball number to be deleted : ");
                    de=sc.nextInt();
                    if(de!=0 && de<=count)
                    {
                        if(count==0)
                        {
                            System.out.println(" Bag is empty");
                        }
                        else
                        {
                            obj[de-1].deleteball(de-1, obj);
                        }
                        count=bag_ball.total_object;
                    }
                    else
                    {
                        System.out.println("No Such Element is their in the list. ");
                    }
                    break;
                case 6 :
                    for(int i=0;i<count;i++)
                    {
                        obj[i].display(i+1);
                    }
                    bag_ball.displaytotal();
                    break;
                case 7 :System.exit(0);
                    break;
                default : System.out.println("Wrong Choice");
            }
            //menu driven ends
        }while(choice!=7);
    }
}