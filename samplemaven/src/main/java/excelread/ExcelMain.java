package excelread;

import java.io.IOException;

public class ExcelMain extends XcelCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String s1=XcelCode.readStringData(0, 0);
System.out.println(s1);
String s2=XcelCode.readIntegerData(1, 0);
System.out.println(s2);
	}

}
