package abstraction;

public class Childinterfc implements Sampleinterface
{
public void display() 
{
	System.out.println("interface parent");
}

public void show()
{
	System.out.println("interface parent example");
}
	public void print()
	{
		System.out.println("interface child");
	}
			
			public static void main(String[] args) {
		Sampleinterface ob= new Childinterfc(); //upcasting ie creating object to parentclass. can creat new object to childclass alsointerface doesnt hv constructor
	ob.display();
	ob.show();	
	//ob.print();child method cannot be called in parent but using obj(child object we can call parent methods)
			Childinterfc obj=new Childinterfc();
			obj.print();

}
}