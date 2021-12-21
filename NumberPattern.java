import java.util.Scanner;
class NumberPattern
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter Row Number");
       int n=sc.nextInt();
	   int j=0;
	   int k=0;

	   for(int i=0;i<=n;i++)
	   {
	   	for(j=0;j<=i;j++)
	   	{
	   		System.out.print(k);
	   		k++;
	   	}
	   	System.out.println(" ");
	   }	
       
	}
}