package interfaceeg;

public class Interface implements Interface1,Interface2 {
public void display() {
	System.out.println("interface1");
}
public void show()
{
	System.out.println("interface2");
}
public static void main(String args[])
{
	Interface obj= new Interface();
			obj.display();
			obj.show();
}
}
