import java.util.Scanner;
class Scholership
{
	public static void main(String[] args)
	{
		boolean flag=true;
		while(flag)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your year");
			int year=sc.nextInt();

			if(year>0 && year<5)
			{
				switch(year)
				{
					case 1:
					   System.out.println("you cant get a Scholership");
					   break;

					case 2:
					   System.out.println("you cant get a Scholership");
					   break;
					   
					case 3:
					   double p1=50,p2=55,p3=90;
	                   System.out.println("Enter your gender:");
	                   String gender=sc.next().toLowerCase();
	                   char ch=gender.charAt(0);

	                   double percentage=((p1+p2+p3)/300)*100;

	                   if(percentage>=62 && ch=='f')
	                   {
	                   System.out.println("She can get the Scholership");
	                   }
                       else
                       {
           	           System.out.println("She cant take Scholership");
                       }	      
                       break;

                    case 4:
                       System.out.println("she cant get Scholership");
                       break;   

				}
				flag=false;
			}
			else
			{
				System.out.println("invalid year,please enter the valid year");
			}

		}
	}
}