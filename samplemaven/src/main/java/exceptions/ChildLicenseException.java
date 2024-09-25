package exceptions;

public class ChildLicenseException {
	public static void ageCheck (int age) throws LicenseException
	{
		if(age>18)
		{
			System.out.println("eligible for license");
		
		}
		else {
			throw new LicenseException("not eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	ChildLicenseException.ageCheck(19);
	}
catch(LicenseException e)
{
	System.out.println(e);
}
}
}
