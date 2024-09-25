package superkeyword;

public class Num extends Add
{
	int div;
	public void div()
	{
int s= super.addition(10,20);

		if(s%10==0)
		{
			System.out.println("divisible");
		}
		else
		{
			System.out.println("not divisible");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Num obj=new Num();
obj.div();
	}

}
