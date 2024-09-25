package abstraction;

public class Abstclaschil extends Abstractclass {
public void show() {
	System.out.println("abstraction implementation");
	
}
public void print() {
	System.out.println("child class method");
	
}
public  Abstclaschil()
{
	super();
}
	public static void main(String[] args) {
		 Abstclaschil dd =new  Abstclaschil();
dd.display();
dd.print();
dd.show();
	}

}
