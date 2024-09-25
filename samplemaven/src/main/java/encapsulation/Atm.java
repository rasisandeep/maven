package encapsulation;

public class Atm {
private int pin;

public void setPin(int pin) {
	this.pin = pin;
}

public void getPin()
{
	System.out.println ("pin is:" +pin);
	
}
public void validatepin()
{
	if (pin==1001||pin==1234||pin==1212)
	{
		System.out.println("pin is valid");
		
	}
	else
	{
		System.out.println("invalid pin");
	}
}

}
