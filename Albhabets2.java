import java.util.Scanner;
class Alphabets2
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter Row Number");
       int n=sc.nextInt();
	   int j=0;
	   int k=0;

	   for(int i=65;k<=n;i++)
	   {
	   	for(j=65;j<=i;j++)
	   	{
	   		System.out.print((char)+i);
	   	}
	   	System.out.println("");
	   }	
       
	}
}