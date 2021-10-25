import java.util.*;

class addition
{
 private int num1, num2, sum;
 
 public void getdata(int a, int b) //formal parameter
 {
     num1=a;
     num2=b;
 }
 
 public void add()
 {
     sum=num1+num2;
 }
 
 public void display()
 {
    System.out.println("\n Addition : "+sum);
 }

}

public class collegeaddition
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("\n Enter the First Number : ");
      int a=sc.nextInt();
      System.out.print("\n Enter the Second Number : ");
      int b=sc.nextInt();
      addition obj=new addition();
      obj.getdata(a,b);
      obj.add();
      obj.display();
  }
}