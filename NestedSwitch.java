import java.util.Scanner;
public class NestedSwitch
{
	public static void main(String[] args)
	{
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter year:");
	   int year=scan.nextInt();

	   switch(year)
	   {
	      case 1:
	      System.out.println("You can't have scholorship");
	      break;

	      case 2:
	      System.out.println("You can't have scholorship");
	      break;

	      case 3:
	      System.out.println("Enter gender:");
	      String g=scan.next().toLowerCase();
	      char gender=g.charAt(0);

	      switch(gender)
	      {
              case 'm':
	          System.out.println("You can't have scholorship");
	          break;

	          case 'f':
	          System.out.println("Congratulations.!! You are eligible for scholership");
	          break;

	          default:
	          System.out.println("Wrong gender input.");
	      
	      }
	      break;
	      
	      case 4:
	      System.out.println("you can't have scholership");
	      break;

	      default:
	      System.out.println("Wrong year.Enter valid year");
	   }
	}
}