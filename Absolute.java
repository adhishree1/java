import java.util.Scanner;
class Absolute
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Num:");
	   int num=sc.nextInt();

	   if(num<0)
	   {
	   	  num=num*(-1);
	   	  System.out.println("number is"+num);
       }
       else
       {
       	  System.out.println("Number is"+num);
       } 
    }
}      
