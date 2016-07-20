package lectures.scanning;

public class StringManipulation {
	public static void main (String[] args) {
		String aString = "012345678";
		int aStringLength = aString.length();
		char firstChar = aString.charAt(0);
		char aLastChar = aString.charAt(aStringLength - 1);
		// hover over substring to understand its behavior
		String aSubString = aString.substring(0, aStringLength - 1);
		// what is the value of aSubString;
		System.out.println (aSubString);
		// what happens with the following prints		
		System.out.println (Integer.parseInt(aSubString));
		System.out.println(aString.substring(4, 7));
		System.out.println(aString.substring(4, 4));
		System.out.println(aString.substring(7, 4));
		// an exception is an error

	}

}
