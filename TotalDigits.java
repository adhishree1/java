import java.util.Scanner;
class TotalDigits
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int i=0;
		while(n!=0)
		{
			n=n/10;
			i++;
		}
		System.out.println("The digits in given number is:"+i);
	}
}