import java.util.*;

class student
{
    private 
    String name;
    int age;
    
    public
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Name of The Student : ");
        name=sc.next();
        System.out.print("Enter The Age of The Student : ");
        age=sc.nextInt();
    }
    
    void display(int sr)
    {
        System.out.println(sr+"\t\t\t"+name+"\t\t"+age+"\n");
    }
}

public class sdb
{
    public static void main(String [] args)
    {
        int r, i, c; // r is for number of records, i is for for loops, c is for switch case
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Records to be Entered : ");
        r=sc.nextInt(); // r=3;
        
        student [] s = new student[10];  
        
        for(i=0;i<10;i++) // object
        {
            s[i] = new student();
        }
        
        for(i=0;i<r;i++)
        {
            s[i].getdata();
        }
        
        System.out.println("Student No.\t\tName\t\tAge\n");
        for(i=0;i<r;i++)
        {
            s[i].display(i+1);
        }
        
        do
        {
            System.out.println("1]Modify A Student Data\n2]Search A Student Data\n3]Delete A Student Data\n4]Add A Student Data\n5]Exit\nEnter Your Choice : ");
            c=sc.nextInt();
            
            switch(c)
            {
                case 1 : System.out.print("Enter the Student Number To Be Modify : ");
                int mod;
                mod=sc.nextInt();
                if(mod>0 && mod<=r)
                {
                    s[mod-1].getdata();
                    System.out.println("Student No.\t\tName\t\tAge\n");
                    for(i=0;i<r;i++)
                    {
                        s[i].display(i+1);
                    }  
                }
                else
                {
                    System.out.println("No Such Record exits in the database");
                }
                break;
                
                case 2: System.out.print("Enter the Student Number To Be Searched : ");
                int search;
                search=sc.nextInt();
                if(search>0 && search<=r)
                {
                    System.out.println("Student No.\t\tName\t\tAge\n");
                    s[search-1].display(search);
                }
                else
                {
                    System.out.println("No Such Record exits in the database");
                }
                break;
                case 3: System.out.print("Enter the Student Number To Be Deleted : ");
                int del;
                del=sc.nextInt();
                if(del>0 && del<=r)
                {
                    del=del-1;
                    for(i=del;i<r+1;i++)
                    {
                        s[i]=s[i+1]; // s[1]=s[2]
                    }
                    System.out.println("Student No.\t\tName\t\tAge\n");
                    r=r-1; // 3-1 = 2
                    for(i=0;i<r;i++)
                    {
                        s[i].display(i+1);
                    }            
                }
                else
                {
                    System.out.println("No Such Record exits in the database");
                }
                break;

                case 4 : /*System.out.print("Enter the Student no. to be added : ");
                int ad;
                ad=sc.nextInt();
                for(i=r;i>ad-1;i--)
                {
                    s[i-1]=s[i];
                }*/
                s[r].getdata(); // s[2].getdata();
                r=r+1;
                System.out.println("Student No.\t\tName\t\tAge\n");
                for(i=0;i<r;i++)
                {
                    s[i].display(i+1);
                }
                break;
                
                case 5 : System.exit(0);
                break;
                
                default : System.out.println("Wrong Choice");
            }
            
        }while(c!=5);
    }
}