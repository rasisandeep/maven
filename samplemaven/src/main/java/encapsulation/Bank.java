package encapsulation;

public class Bank 
{
public static void main(String args[])
{
	Atm obj=new Atm();
	obj.setPin(1001);
	obj.getPin();
	obj.validatepin();
}
}
