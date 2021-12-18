import java.util.Scanner;
class Result
{
	public static void main(String args[])
	{ 
		int num;
		Scanner reader=new
		Scanner(System.in);
		System.out.println("Enter marks:");
		num=reader.nextInt();
		if(num>=45)
		{
			System.out.println("Pass!");
		}
		else
			System.out.println("Fail");
	}
}		
