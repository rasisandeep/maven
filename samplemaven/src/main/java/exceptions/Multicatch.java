package exceptions;

public class Multicatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=12;
int b=23;
int s= a+b;

try
{
int res=5/0;
System.out.println("try block");
int d[]=new int[12];
d[14]=12;

}
catch(ArithmeticException e)
{
System.out.println("not divisible by zero");
}
catch(ArrayIndexOutOfBoundsException r)
{
	System.out.println("exception r");
}
finally
{
System.out.println("finally will be executed");
}
System.out.println("execute rest code");
	}
}
	

