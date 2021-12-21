import java.util.Scanner;
class NumberPattern2
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter Row Number");
       int n=sc.nextInt();
	   int j=0;
	   

	   for(int i=1;i<=n;i++)
	   {
	   	for(j=1;j<=i;j++)
	   	{
	   		System.out.print(+j);
	   	
	   	}
	   	System.out.println("");
	   }	
       
	}
}