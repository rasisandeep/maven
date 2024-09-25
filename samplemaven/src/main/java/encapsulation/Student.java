package encapsulation;

public class Student {
private String name;
private int rollnum;
private String dept;
public void setter (String name,int roll,String dept)
{
	this.name = name;
	this.rollnum=rollnum;
	this.dept=dept;
}
public void getter() {
	System.out.println("name:"+name);
	System.out.println("rollnum:" +rollnum);
	System.out.println("dept:" +dept);
	
}
}
