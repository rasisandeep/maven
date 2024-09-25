package superkeyword;

public class Child extends Parent
{
String name="raz";
public Child()
{
	super();
	System.out.println("child class constr");
}
public void Bruno()
{
	super.Bruno();
	System.out.println ("child class method");
	System.out.println ("name:" +name);
	System.out.println(super.name);

}
	public static void main(String[] args) {
		Child obj=new Child();
		System.out.println (obj.name);
obj.Bruno();
	}

}
