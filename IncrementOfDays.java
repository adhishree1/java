import java.util.Scanner;
class IncrementOfDays
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        
        if(d <31)
        {
            d+=1;
            System.out.println("Next days date is "+d+"/"+m+"/"+y);

        }
        else if(d==31 && m!=2)
        {
            d = 1;
            m+=1;
            System.out.println("Next days date is "+d+"/"+m+"/"+y);
        }
        else if(d==28 && m==2)
        {
            d = 1;
            m+=1;
            System.out.println("Next days date is "+d+"/"+m+"/"+y);
        }
        else if(d==31 && m==12)
        {
            d=1;
            m=1;
            y+=1;
            System.out.println("Next days date is "+d+"/"+m+"/"+y);
        }
        else
        {
            System.out.println("Enter proper date");
        }

    }
}