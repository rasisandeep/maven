package exceptions;

public class Sample {

	public static void main(String args[]) {
		
int a=10,b=20;
int s=a+b;
try
{
	int res=5/0;
	System.out.println("try block");
	
}
catch(ArithmeticException e)
{
System.out.println("not divisible by zero");
}
System.out.println("execute rest code");
}
}