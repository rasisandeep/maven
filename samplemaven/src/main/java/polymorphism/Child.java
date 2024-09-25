package polymorphism;

public class Child  extends Parent
{
	public void example(String name,String place)
	{
		super.example("Ambadi","kerala");
		System.out.println("polymorphism");
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Child ob=new Child();
ob.example("Sahasru", "trivandrum");
	}

}
