import java.util.Scanner;
class Salary
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Salary");
	    double salary = sc.nextDouble();
	    System.out.println("Year");
	    int year=sc.nextInt();

	    if(year>5)
	    {
	       double bonus=salary*0.05;
	       salary = salay+bonus;
	       System.out.println(salary);
	    }
	}
}