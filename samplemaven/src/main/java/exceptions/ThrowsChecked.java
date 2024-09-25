package exceptions;
import java.io.IOException;

public class ThrowsChecked {
public static void examp() throws IOException
{
	throw new IOException();
}
	public static void main(String args[]) throws IOException {
		examp();
	}

}
