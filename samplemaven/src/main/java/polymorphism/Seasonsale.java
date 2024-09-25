package polymorphism;

public class Seasonsale
{
	int total=0;
	float onseason;
 public void sale(int price, int price1)
 {
	 int total= price+price1;
	 onseason=total*0.4f;
	 System.out.println("onseason discount:" +onseason);
 }
}
