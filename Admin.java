import java.util.Scanner;
class Admin
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    double p1=50,p2=55,p3=90;
	    System.out.println("Enter your gender:");
	    String gender=sc.next().toLowerCase();
	    char ch=gender.charAt(0);

	    double percentage=((p1+p2+p3)/300)*100;

	       if(percentage>=62 && ch=='f')
	       {
	          System.out.println("She can take the admission");
	       }
           else
           {
           	 System.out.println("She cant take admission");
           }	
}
}