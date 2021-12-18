import java.util.Scanner;
class CalculateArea
{
	public static void main(String[] args)
	{
      double pi=3.14;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the option to be calculated");
	    System.out.println("1. Area of a Triangle");
	    System.out.println("2. Area of Rectangle");
	    System.out.println("3. Area of Square");
	    System.out.println("4. Area of Circle");
	    System.out.println("5. volume of cube");
      System.out.println("6. volume of cuboid");
      System.out.println("7. volume of cylinder");
      System.out.println("8. volume of cone");
      double num=sc.nextDouble();
    
      switch(num)
       {
        case 1:
           System.out.println("Area of Triangle:");
           double base,height,area=0;
           System.out.println("Enter base and height:");
           base=sc.nextDouble();
           height=sc.nextDouble();
           area=0.5*base*height;
           System.out.println("Area of Triangle "+area);
           break;

        case 2:
           System.out.println("Area of Rectangle:");
           double length,breadth,area=0;
           System.out.println("Enter length and breadth:");
           length=sc.nextDouble();
           breadth=sc.nextDouble();
           area=length*breadth;
           System.out.println("Area of Rectangle "+area);
           break;

        case 3:
           System.out.println("Area of Square:");
           double length,area=0;
           System.out.println("Enter the length:");
           length=sc.nextDouble();
           area=length*length;
           System.out.println("Area of Square "+area);
           break; 

        case 4:
           System.out.println("Area of circle:");
           double radius,area=0;
           System.out.println("Enter the radius:");
           radius=sc.nextDouble();
           area=pi*radius*radius;
           System.out.println("Area of Circle "+area);
           break;  

        case 5:
           System.out.println("volume of Cube:");
           double length,volume=0;
           System.out.println("Enter length:");
           length=sc.nextDouble();
           volume=length*length*length;
           System.out.println("volume of Cube "+volume);
           break;

        case 6:
           System.out.println("volume of cuboid:");
           double length,width,height,volume;
           System.out.println("Enter length,width and height:");
           length=sc.nextDouble();
           width=sc.nextDouble();
           height=sc.nextDouble();
           volume=length*width*height;
           System.out.println("volume of cuboid "+volume);
           break; 

        case 7:
           System.out.println("volume of cylinder:");
           double radius,height,volume;
           System.out.println("Enter radius and height:");
           radius=sc.nextDouble();
           height=sc.nextDouble();
           volume=pi*radius*radius*height;
           System.out.println("volume of cylinder "+volume);
           break;      

        case 8:
           System.out.println("volume of cone:");
           double radius,height,volume;
           System.out.println("Enter length,height and height:");
           radius=sc.nextDouble();
           height=sc.nextDouble();
           volume=0.3*pi*radius*radius*height;
           System.out.println("volume of cone "+volume);
           break;   

        default:
           System.out.println("not found");   
      }
	}
}