import java.util.Scanner;
public class Operator
{
	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter n:");
	   System.out.println("Enter 1 for additon");
	   System.out.println("Enter 2 for subtract");
	   System.out.println("Enter 3 for Multiplication");
	   System.out.println("Enter 4 for division");
	   int n=sc.nextInt();
       if(n<=4&&n>0)
       {
		   switch(n)
		   {
		   	  case 1:
		   	  System.out.println("how many numbers you want to add");
		   	  int num=sc.nextInt();
		   	  switch(num)
		   	  {
	             case 2:
	             System.out.println("enter 2 numbers");
	             int a=sc.nextInt();
	             int b=sc.nextInt();
	             int sum=a+b;
	             System.out.println("Addition is:"+sum);
	             break;

	             case 3:
	             System.out.println("enter 3 numbers");
	             a=sc.nextInt();
	             b=sc.nextInt();
	             int c=sc.nextInt();
	             sum=a+b+c;
	             System.out.println("Addition is:"+sum);
	             break;

	             case 4:
	             System.out.println("enter 2 numbers");
	             a=sc.nextInt();
	             b=sc.nextInt();
	             c=sc.nextInt();
	             int d=sc.nextInt();
	             sum=a+b+c+d;
	             System.out.println("Addition is:"+sum);
	             break;
		   	  }
		   	  break;

		   	  case 2:
		   	  System.out.println("how many numbers you want to substract");
		   	  num=sc.nextInt();
		   	  switch(num)
		   	  {
	             case 2:
	             System.out.println("enter 2 numbers");
	             int a=sc.nextInt();
	             int b=sc.nextInt();
	             int sub=a-b;
	             System.out.println("Addition is:"+sub);
	             break;

	             case 3:
	             System.out.println("enter 3 numbers");
	             a=sc.nextInt();
	             b=sc.nextInt();
	             int c=sc.nextInt();
	             sub=(a-b)-c;
	             System.out.println("Addition is:"+sub);
	             break;

	             case 4:
	             System.out.println("enter 4 numbers");
	             a=sc.nextInt();
	             b=sc.nextInt();
	             c=sc.nextInt();
	             int d=sc.nextInt();
	             sub=(a-b)-(c-d);
	             System.out.println("Addition is:"+sub);
	             break;
		   	  }
		   	  break;

		   	  case 3:
		   	  System.out.println("how many numbers you want to multiply");
		   	  num=sc.nextInt();
		   	  switch(num)
		   	  {
		   	  	 case 2:
	             System.out.println("enter 2 numbers");
	             int a=sc.nextInt();
	             int b=sc.nextInt();
	             int mul=a*b;
	             System.out.println("Multiplication is:"+mul);
	             break;

	             case 3:
	             System.out.println("enter 3 numbers");
	             a=sc.nextInt();
	             b=sc.nextInt();
	             int c=sc.nextInt();
	             mul=a*b*c;
	             System.out.println("Multiplication is:"+mul);
	             break;

	             case 4:
	             System.out.println("enter 4 numbers");
	             a=sc.nextInt();
	             b=sc.nextInt();
	             c=sc.nextInt();
	             int d=sc.nextInt();
	             mul=a*b*c*d;
	             System.out.println("Multiplication is:"+mul);
	             break;
		   	  }
		   	  break;

		   	  case 4:
		   	  System.out.println("how many numbers you want to divide");
		   	  num=sc.nextInt();
		   	  switch(num)
		   	  {
		   	  	 case 2:
		   	  	 double res1=0.0;
	             System.out.println("enter 2 numbers");
	             double a=sc.nextInt();
	             double b=sc.nextInt();
	             if(a>=1&&b>=1)
	             {
	             	 res1=a/b;
	             	System.out.println("division is:"+res1);
	             }
	             else
	             {
	                System.out.println("cant divide");
	             }
	             break;

	             case 3:
	             double div=00.0;
	             System.out.println("enter 3 numbers");
	             a=sc.nextInt();
	             b=sc.nextInt();
	             double c=sc.nextInt();
	             if(a>=1&&b>=1&&c>=1)
	             {
		              res1=(a/b);
		              if(res1>=1)
		              {
		              	 div=res1/c;
		              	System.out.println("division is is:"+div);
		              }
		              else
		              {
		              	System.out.println("cant divide");
		              }	     
	          	 }
	          	 else
	          	 {
	          	 	System.out.println("cant divide");
	          	 }
	             break;

	             case 4:
	             System.out.println("enter 4 numbers");
	             a=sc.nextInt();
	             b=sc.nextInt();
	             c=sc.nextInt();
	             double d=sc.nextInt();
	             if(a>=1&&b>1&&c>=1&&d>=1)
	             {
	             	res1=a/b;
	             	double res2=c/d;
	             	if(res1>=1&&res2>1)
	             	{
	             		div=res1/res2;
	             		System.out.println("division is"+div);
	             	}
	             }
	             	else
	             	{
	             		System.out.println("cant divide");
	             	}
	             
	             break;
		   	  }
		   	 break;
		   }

	   }
	   else
	   {
	   	System.out.println("wrong input");
	   } 
	}
}	
	   
