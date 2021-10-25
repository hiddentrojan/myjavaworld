import java.util.*;

class com
{
    //private variables declaration
    private double real, img;
    
    /*
     public com() default constructor
     {
         Scanner sc = new Scanner(System.in);
         real=sc.nextDouble();
         img=sc.nextDouble();
     }
    */
    
    public com(double x, double y) // parameterised constructor
    {
        real=x;
        img=y;
    }
    
    com(com c)
    {
        real=c.real;
        img=c.img;
    }
    
    public void display()
    {
        System.out.println(real+"+"+img+"i");
    }
    
    public void add(com x, com y)
    {
        real = x.real + y.real;
        img= x.img + y.img;
    }
    
    public void sub(com x, com y)
    {
        real = (x.real - y.real);
        img = (x.img - y.img); 
    }
    
    public void mul(com x, com y)
    {
        real = (x.real*y.real - x.img*y.img); 
        img = (x.real*y.img + y.real*x.img);
    }
    
    public void div(com x, com y)
    {
        double d = (y.real*y.real + y.img*y.img);
        real = (x.real*y.real + x.img*y.img)/d; 
        img = (y.real*x.img - x.real*y.img)/d;
    }
}

public class complex_assignment
{
    public static void main (String [] agrs)
    {
        double real1, real2, img1, img2;
        Scanner sc = new Scanner(System.in);
        //Taking value from user
        System.out.print("Enter the 1st complex number : ");
        real1=sc.nextDouble();
        img1=sc.nextDouble();
        System.out.print("\nEnter the 2nd complex number : ");
        real2=sc.nextDouble();
        img2=sc.nextDouble();
        //creating objects
        com c1 = new com(real1, img1);
        com c2 = new com(real2, img2);
        com c3 = new com(0.00, 0.00);
        com c4 = new com(c1);
        
        int c;
        do
        {
            System.out.print("\n1] Addition\n2]Substract\n3]Multiplication\n4]Division\n5]Copy Constructor\n6]Exit\nEnter Your Choice :");
            c=sc.nextInt(); // taking choice input
            //menu driven
            switch(c)
            {
                case 1: c3.add(c1,c2); // calling add function
                System.out.println("\nThe Addition is  ");
                c3.display();
                break;
                
                case 2: c3.sub(c1,c2); // calling sub function 
                System.out.println("\nThe Substraction is  ");
                c3.display();
                break;
                
                case 3: c3.mul(c1,c2); // calling mul function
                System.out.println("\nThe Multiplication is  ");
                c3.display();
                break;
                
                case 4: c3.div(c1,c2); // calling div function
                System.out.println("\nThe Division is  ");
                c3.display();
                break;
                
                case 5 : c4.display();
                break;
                    
                case 6: System.exit(0); // exit command for switch case
                break;
                
                default : System.out.println("Wrong Choice"); // used for other choices than given from the switch case
                break;
            }
        }while(c!=6); // excute until conditon gets satisfied
        
    }
}