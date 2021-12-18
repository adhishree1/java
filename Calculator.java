import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("*****Calculator*****");
	   System.out.println("1. Addition");
	   System.out.println("2. Substraction");
	   System.out.println("3. Multiplication");
	   System.out.println("4. Division");
	   System.out.println("5. Modulus");
       System.out.println("Enter your choice of Operation");
       int choice=sc.nextInt();
       int a,b,result;

       switch(choice)
       {
          case 1:
          System.out.println("Enter two number to add:");
          a=sc.nextInt();
          b=sc.nextInt();
          result = a+b;
          System.out.println("Addition is:" +result);
          break;

          case 2:
          System.out.println("Enter two number to substract:");
          a=sc.nextInt();
          b=sc.nextInt();
          result = a-b;
          System.out.println("Substraction is:" +result);
          break;

          case 3:
          System.out.println("Enter two number to multiply:");
          a=sc.nextInt();
          b=sc.nextInt();
          result = a*b;
          System.out.println("Multiplication is:" +result);
          break;

          case 4:
          System.out.println("Enter two number to division:");
          a=sc.nextInt();
          b=sc.nextInt();
          result = a/b;
          System.out.println("Division is:" +result);
          break;

          case 5:
          System.out.println("Enter two number to modulus:");
          a=sc.nextInt();
          b=sc.nextInt();
          result = a%b;
          System.out.println("Modulus is:" +result);
          break;

          default:
          System.out.println("Wrong Input");

        }
	}
}