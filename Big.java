class Big
{
	public static void main(String[] args)
	{
	    int a=3,b=7,c=22,big;
	    if(a>b)
	    {
	        if(a>c)
	          big=a;
	        else
	          big=c;
	    }
	    else
	    {
	        if(b>c)
	          big=b;
	        else
	          big=c;  
	    }      
	    System.out.println("Big value is"+big);
	}
}