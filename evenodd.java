import java.util.*;

class checker
{
    static int count_even, count_odd, count_prime;
    private int a[], i, n;
    public
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter The Number of Elements : ");
        n=sc.nextInt();
        a = new int[n];
        System.out.print("\nEnter The Elements : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    void evenodd()
    {
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                count_even+=1;
            }
            else
            {
                count_odd+=1;
            }
        }
    }
    void prime()
    {
        int flag = 0;
        for(i=0;i<n;i++)
        {
            int d = a[i]/2;
            for(int j=2;j<=d;j++)
            {
                if(a[i]%j==0)
                {
                   flag=1;
                   break;
                }
            }
            if(flag==0)
            {
                count_prime+=1;
            }
        }
    }
    static void display()
    {
        System.out.println("Even Numbers : "+count_even);
        System.out.println("Odd Numbers : "+count_odd);
        System.out.println("Prime Numbers : "+count_prime);
    }
}

public class evenodd
{
    public static void main(String []args)
    {
        checker obj = new checker();
        obj.getdata();
        obj.evenodd();
        obj.prime();
        checker.display();
    }
}