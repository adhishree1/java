class TotalCost
{
	public static void main(String[] args)
	{
	   double quantity=10,temp=1000;

	    if(temp>=1000)
	    {
	       double discount = temp*0.10;
	       double total_cost=temp - discount;
	       System.out.println("You are given discount of "+discount+"rs");
	       System.out.println("Your total amount is:"+total_cost);
	    }
	    else
	    {
	       System.out.println("Your total cost is" +temp);
	    }
	}
}