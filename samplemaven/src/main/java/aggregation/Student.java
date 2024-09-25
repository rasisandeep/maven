package aggregation;

public class Student {
String name;
int age;
Address add;
public Student(String name,int age,Address add)
{
	this.name=name;
	this.age=age;
	this.add=add;
}
public void display()
{
	System.out.println(name);
	System.out.println(age);
	System.out.println(add.housename);
	System.out.println(add.housenum);
	System.out.println(add.pincode);
	
}
public static void main(String args[])
{
	Address obj=new Address("ambadi", 12, 695573," tvm");
	Student obj1=new Student("rudra",8,obj);
	obj1.display();
	
}
}	 