class Result2
{
	public static void main(String[] args)
	{
	    int num1=2,num2=5;
        int result=0;
           System.out.println("Your values are:"+num1+" "+num2);
           for(int i=1;i<=num1;i++)
           {
              result=result+num2;
           }
           System.out.println("Result is:" +result);
	}
}