char ch=sc.next().charAt(0);
if(ch>=65 && ch<=90)
{
   System.out.println("capital letter");
}
else if(ch>=97 && ch<=122)
{
   System.out.println("lowercase letter");
}
else if(ch>=48 && ch<=57)
{
	System.out.println(it is a digit);
}
else
{
	System.out.println("it is a special symbol");
}