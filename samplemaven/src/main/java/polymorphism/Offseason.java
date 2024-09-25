package polymorphism;
import java.util.Scanner;

public class Offseason extends Seasonsale

{
int total=0;
float offsale;
public void sale(int price, int price1)
{
	int total= price+price1;
	float offsale=total*0.15f;
System.out.println("offseason discount:" +offsale);
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter onseason or offseason");
String season=sc.next();
System.out.println("enter the price");
int price=sc.nextInt();
System.out.println("enter the price1");
int price1= sc.nextInt();
Offseason obj=new Offseason();
Seasonsale obj1=new Seasonsale();

if (season.equals("Offseason"))
{
	obj.sale(price,price1);
	}
else
{
	obj1.sale(price,price1);
	}
}
}