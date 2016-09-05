package lectures.constructors_pointers;

import java.util.Arrays;

public class PrintingConstructors {
	/*
	 * The following method prints  the constructors in the 
	 * code to which the class of an object is compiled.
	 * 
	 * Only the curious need look at the body of the method between
	 * curly braces.
	 * 
	 */
	public static void printConstructors(Object anObject) {
		System.out.println(Arrays.toString(anObject.getClass().getConstructors()));
	}
	public static void main (String[] args) {
		ABMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet();		
		printConstructors(aBMISpreadsheet);
		/*
		 * Comment out the the parameterless constructor in ABMISPreadsheet and
		 * run this program again.
		 * How many constructors?		
		 * Comment out the constructor with the two parameters.
		 * How many constructors?
		 * Can you explain the numbers?
		 * 
		 * (T/F) A constructor is executed before the instance variables of a class are initialized.
		 *
		 * (T/F) The source code of a class (written by the programmer) may not contain a constructor.
		 * 
		 * (T/F) The compiled object code of a class may not contain a constructor.
		 * 
		 * (T/F) The source code of a class may contain multiple constructors.
		 * 
		 * (T/F) The object code of a class may contain multiple constructors.
		 * 
		 */
	}

}
