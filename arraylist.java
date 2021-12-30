import java.util.*;

public class arraylist
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        do
        {
            System.out.println("1.Integer\n2.String\n3.Exit");
            System.out.print("Enter Your Choice : ");
            ch = sc.nextInt();
            int cp=0, ce=0, co=0, sp=0;
            switch(ch)
            {
                case 1 :
                    int ch1, n;
                    ArrayList<Integer>obj = new ArrayList<Integer>();
                    do
                    {
                        System.out.println("1.Add\n2.Even\n3.Odd\n4.Prime Number\n5.Exit");
                        System.out.print("Enter Your Choice :");
                        ch1 = sc.nextInt();
                        switch(ch1)
                        {
                            case 1 :
                                System.out.print("Enter A Number :");
                                n = sc.nextInt();
                                obj.add(n);
                                break;
                            case 2 :
                                for(int i=0;i<obj.size();i++)
                                {
                                    if(obj.get(i)%2==0)
                                    {
                                        ce=ce+1;
                                    }
                                }
                                if(ce==0)
                                {
                                    System.out.println("No Even Number Present there");
                                }
                                else
                                {
                                    System.out.println("Even Numbers : "+ce);
                                }
                                break;
                            case 3 :
                                for(int i=0;i<obj.size();i++)
                                {
                                    if(obj.get(i)%2!=0)
                                    {
                                        co=co+1;
                                    }
                                }
                                if(co==0)
                                {
                                    System.out.println("No Odd Number Present there");
                                }
                                else
                                {
                                    System.out.println("Odd Numbers : "+co);
                                }
                                break;
                            case 4 :
                                int flag = 0;
                                for(int i=0;i<obj.size();i++)
                                {
                                    if(obj.get(i)>2)
                                    {
                                        int d = obj.get(i)/2;
                                        for(int j=2;j<=d;j++)
                                        {
                                            flag = 1;
                                            break;
                                        }
                                    }
                                    if(flag==0)
                                    {
                                        cp=cp+1;
                                    }
                                }
                                System.out.println("Prime Number : "+cp);
                                break;
                            case 5 :
                                break;
                        }
                    }while(ch1!=5);
                    break;
                case 2 :
                    ArrayList<String>obj1 = new ArrayList<String>();
                    int ch2;
                    String w, rev = "";
                    do
                    {
                        System.out.println("1]Add\n2]Palindrone\n3]Exit");
                        System.out.print("Enter Your Choice :");
                        ch2 = sc.nextInt();
                        switch(ch2)
                        {
                            case 1 :
                               System.out.print("Enter a word :");
                               w = sc.next();
                               obj1.add(w);
                               break;
                            case 2 :
                                for(int i =0;i<obj1.size();i++)
                                {
                                    String temp = obj1.get(i);
                                    int length = temp.length();
                                    for(int j = length-1;j>=0;j--)
                                    {
                                        rev = rev + temp.charAt(j);
                                    }
                                    if(temp.equals(rev))
                                    {
                                        sp=sp+1;
                                    }
                                    rev="";
                                }
                                if(sp==0)
                                {
                                    System.out.println("No Palindrome String is present there");
                                }
                                else
                                {
                                    System.out.println("Palindrome Strings : "+sp);
                                }
                                break;
                            case 3 :
                                break;
                        }
                    }while(ch2!=3);
                    break;
                case 3 :
                    System.exit(0);
                default : System.out.println("Wrong Choice");
            }
        }while(ch!=3);
    }
}