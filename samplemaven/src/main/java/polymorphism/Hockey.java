package polymorphism;

public class Hockey extends Sports
{
public void play()
{
	super.play();
	System.out.println("play well");
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Cricket ob=new Cricket();
ob.play();
Football ob1=new Football();
ob1.play();
Hockey ob2=new Hockey();
ob2.play();
	}

}
