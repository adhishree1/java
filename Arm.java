import java.util.Scanner;
class Arm
{
	public static void main(String[] args)
	{
		int i,n,r,arm,sum=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    n=sc.nextInt();
	    arm=n;
	    while(n>0)
	    {
	    	r=n%10;
	    	sum=sum+(r*r*r);
	    	n=n/10;
	    }
	    if(arm==sum)	
	     System.out.println("sum:"+arm);
	    else
	     System.out.println("sum:"+na); 
	}
}	