import java.util.Scanner;
class WeekDay
{
	public static void main(String[] args)
	{
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of day");
    int date = sc.nextInt();

    switch(date)
    {
       case 1:
       System.out.println("It is Monday");
       break;

       case 2:
       System.out.println("It is tuesday");
       break;

       case 3:
       System.out.println("It is wednesday");
       break;

       case 4:
       System.out.println("It is tuesday");
       break;

       case 5:
       System.out.println("It is friday");
       break;

       case 6:
       System.out.println("It is saturday");
       break;

       case 7:
       System.out.println("It is sunday");
       break;

       default:
       System.out.println("incorret day number");
    }
    }
}