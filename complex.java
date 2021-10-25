import java.util.*;

class com
{
    int real, img;
    
    public void getdata()
    {
        Scanner sc = new Scanner(System.in);
        real = sc.nextInt();
        img = sc.nextInt();
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
        int d = (y.real*y.real + y.img*y.img);
	real = (x.real*y.real + x.img*y.img)/d; 
	img = (y.real*x.img - x.real*y.img)/d;
    }
}

public class complex
{
    public static void main (String [] agrs)
    {
        com c1 = new com();
        com c2 = new com();
        com c3 = new com();
        
        System.out.print("\nEnter the 1st complex number : ");
        c1.getdata();
        
        System.out.print("\nEnter the 2nd complex number : ");
        c2.getdata();
        
        int c;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.print("\n1] Addition\n2]Substract\n3]Multiplication\n4]Division\n5]Exit\nEnter Your Choice :");
            c=sc.nextInt();
            
            switch(c)
            {
                case 1: c3.add(c1,c2);
                System.out.println("\nThe Addition is  ");
                c3.display();
                break;
                
                case 2: c3.sub(c1,c2);
                System.out.println("\nThe Substraction is  ");
                c3.display();
                break;
                
                case 3: c3.mul(c1,c2);
                System.out.println("\nThe Multiplication is  ");
                c3.display();
                break;
                
                case 4: c3.div(c1,c2);
                System.out.println("\nThe Division is  ");
                c3.display();
                break;
                
                case 5: System.out.println("The Program ends here.");
                break;
                
                default : System.out.println("Wrong Choice");
                break;
            }
        }while(c!=5);
        
    }
}