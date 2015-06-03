package lectures.scanning;

public class StyleErrorsCS1 {
	static int lengthInInches;
	static int mLengthInInches;
	public final static double CMS_IN_INCHES = 2.54;	
	String[] args;
	
	public static void main(String[] args) {
		int lengthInInches = 0;
		int aLengthInInches = 0;
		if (lengthInInches <= 0 ); 
		{
		    System.out.println ("Error!");		
		}
		double lengthInCMS = lengthInInches*2.54;
		lengthInCMS = lengthInInches*CMS_IN_INCHES;
		boolean roundingError = lengthInCMS/lengthInInches != CMS_IN_INCHES;
		if (roundingError == true) {
			System.out.println ("Java has rounding errors");
		}
		if (roundingError) {
			System.out.println ("Java has rounding errors");
		}
		if (roundingError = lengthInCMS/lengthInInches != CMS_IN_INCHES ) {
			System.out.println ("Java has rounding errors");
		}	
		if (lengthInCMS/lengthInInches != CMS_IN_INCHES) 
			roundingError = true;
			System.out.println ("Java has rounding errors");
		if (roundingError) System.out.println ("Java has rounding errors");
	}

}
