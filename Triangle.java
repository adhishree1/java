import java.util.Scanner;
class Triangle
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a values:");
	   int l= sc.nextInt();
	   int b= sc.nextInt();
	   int h= sc.nextInt();

	   if((l==b)&&(l==h)&&(b==h))
	   {
	   	  System.out.println("It is a Equilateral Triangle");
	   }
	   else if((l!=b)&&(l!=h)&&(b!=h))
	   {
	   	  System.out.println("It is a Scalene Triangle");
	   }
	   else
	   {
	   	if((l==b)||(l==h)||(b==h))
	   {
	   	  System.out.println("It is a Isoscalar Triangle");
	   }
	   }
	}
}	   