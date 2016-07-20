package lectures.constructors_pointers;

import lectures.state_properties.ABMISpreadsheet;

public class UninitializedVariables {
	static double height; // uninitialized primitive variable
	static String string; // uninitialized object variable


	public static void main (String[] args) {
		System.out.println(height); // printing an uninitialized primitive
		System.out.println(string); // printing an uninitialized object
		System.out.println (height + 2); // doing an integer operation on height
		System.out.println (string.charAt(0)); // doing a String operation on string1;
		// Can you describe the difference in behavior for primitive variables and object variables
	}

}
