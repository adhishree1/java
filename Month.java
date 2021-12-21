import java.util.Scanner;
class Month
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a month:");
	   String m= sc.next().toLowerCase();

	   switch(m)
	   {
           case "january":
            System.out.println("1st day of month ");
            break;

            case "february":
            System.out.println("2nd day of month ");
            break;

            case "march":
            System.out.println("3rd day of month ");
            break;

            case "april":
            System.out.println("4th day of month ");
            break;

            case "may":
            System.out.println("5th day of month ");
            break;

            case "june":
            System.out.println("6th day of month ");
            break;

            case "july":
            System.out.println("7th day of month ");
            break;

            case "augast":
            System.out.println("8th day of month ");
            break;

            case "september":
            System.out.println("9th day of month ");
            break;

            case "october":
            System.out.println("10th day of month ");
            break;
            
            case "november":
            System.out.println("11th day of month ");
            break;

            case "december":
            System.out.println("12th day of month ");
            break;

            default:
            System.out.println("no month exist");

	   }
	}
}	   