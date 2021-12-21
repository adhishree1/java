import java.util.Scanner;
class CalculateArea
{
	public static void main(String[] args)
	{ 
      boolean flag=true;
      while(flag)
      {
        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the option to be calculated");
        System.out.println("1. Area of a Triangle");
        System.out.println("2. Area of a Rectangle");
        System.out.println("3. Area of Square");
        System.out.println("4. Area of Circle");
        System.out.println("5. volume of cube");
        System.out.println("6. volume of cuboid");
        System.out.println("7. volume of cylinder");
        System.out.println("8. volume of cone");
        int option= sc.nextInt();

            if(option>0&&option<=8)
            {
               
               switch(option)
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
                  double length,breadth;
                  System.out.println("Enter length and breadth:");
                  length=sc.nextDouble();
                  breadth=sc.nextDouble();
                  area=length*breadth;
                  System.out.println("Area of Rectangle "+area);
                 break;

                 case 3:
                 System.out.println("Area of Square:");
                 System.out.println("Enter the length:");
                 length=sc.nextDouble();
                 area=length*length;
                 System.out.println("Area of Square "+area);
                 break; 

                case 4:
                System.out.println("Area of circle:");
                double radius;
                System.out.println("Enter the radius:");
                radius=sc.nextDouble();
                area=pi*radius*radius;
                System.out.println("Area of Circle "+area);
                break;  

               case 5:
               System.out.println("volume of Cube:");
               double volume=0;
               System.out.println("Enter length:");
               length=sc.nextDouble();
               volume=length*length*length;
               System.out.println("volume of Cube "+volume);
               break;

              case 6:
              System.out.println("volume of cuboid:");
              double width;
              System.out.println("Enter length,width and height:");
              length=sc.nextDouble();
              width=sc.nextDouble();
              height=sc.nextDouble();
              volume=length*width*height;
              System.out.println("volume of cuboid "+volume);
              break; 

             case 7:
             System.out.println("volume of cylinder:");
             System.out.println("Enter radius and height:");
             radius=sc.nextDouble();
             height=sc.nextDouble();
             volume=pi*radius*radius*height;
             System.out.println("volume of cylinder "+volume);
             break;      

            case 8:
            System.out.println("volume of cone:");
            System.out.println("Enter length,height and height:");
            radius=sc.nextDouble();
            height=sc.nextDouble();
            volume=0.3*pi*radius*radius*height;
            System.out.println("volume of cone "+volume);
            break; 
              
          }
          break;
              
        }
       else
       {
              System.out.println("Invalid Option. please enter the correct one.");
       }
    }
 }
}
     