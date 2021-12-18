import java.util.Scanner;
class Year
{
	public static void main(String args[])
	{
	   int yr;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the year:");
	   yr=sc.nextInt();
	   if(((yr%400==0)&&(yr%100!=0))||(yr%4==0))
	   {
	      System.out.println("year is leap");
	   }
	   else
	   {
	   System.out.println("year is not leap");
	   }
    }
}