import java.util.Scanner;
class Alphabets
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter Row Number");
       int n=sc.nextInt();
	   int j=0;
	   int k=0;

	   for(int i=65;i<=n;i++,k++)
	   {
	   	for(j=65;j<=i;j++)
	   	{
	   		System.out.print((char)j);
	   	}
	   	System.out.println("");
	   }	
       
	}
}