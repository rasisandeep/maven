package exceptions;

public class Throw {
	public static void sum(int a, int b)
	{
	int sum=a+b;
	System.out.println(sum);
	if(sum>80)
	{
		throw new ArrayIndexOutOfBoundsException("sum should be lessthan 60");
		
	}
	else
	{
		System.out.println("sum is lessthan 60");
	}
	}

	public static void main(String[] args) {
	
	sum();
		try
		{
		sum(20,30);
}
catch(ArrayIndexOutOfBoundsException e)
		{
	System.out.println(e);
		}
		}
}