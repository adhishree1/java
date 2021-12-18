import java.util.Scanner;
class ScannerDemo
{
	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   String name=sc.nextLine();
	   char gender=sc.next().charAt(0);
	   int age=sc.nextInt();
	   double sgpa=sc.nextDouble();
	   System.out.println("Name:"+name);
	   System.out.println("Gender:"+gender);
       System.out.println("Age:"+age);
       System.out.println("SGPA:"+sgpa);
	}
}