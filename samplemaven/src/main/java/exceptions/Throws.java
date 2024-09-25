package exceptions;

public class Throws {  //unchecked

	public static void error() throws ArrayIndexOutOfBoundsException
	{
		throw new ArrayIndexOutOfBoundsException();
		
	}
	public static void main(String[] args) {
		error();

	}

}
