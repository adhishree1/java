import java.util.Scanner;
class Sum
{
	public static void main(String[] args)
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    i=sc.nextInt();
	    while(i>0)
	    {
	    	n=i%10;
	    	sum=sum+n;
	    	i=i/10;
	    }	
	     System.out.println("sum of no:"+sum);
   }
}
