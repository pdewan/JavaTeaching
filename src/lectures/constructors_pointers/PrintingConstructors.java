package lectures.constructors_pointers;

import java.util.Arrays;
/*
 * This class shows the constructors that exist in the compiled object code
 * available at runtime.
 */
public class PrintingConstructors {
	/*
	 * The following method prints  the constructors in the 
	 * code to which the class of an object is compiled.
	 * 
	 * Look at the program and run it.
	 * 
	 */
	public static void printConstructors(Class aClass) {
		System.out.println(Arrays.toString(aClass.getConstructors()));
	}
	public static void main (String[] args) {		

		printConstructors(ABMISpreadsheet.class);
		/*
		 * Comment this out if the program does not compile.
		 */
		ABMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet(); 
		/*
		 * Comment out the the parameterless constructor in ABMISPreadsheet.
		 * Does the statement above compile? If not, comment it.
		 * Run this program again.
		 * How many constructors?		
		 * Now comment out also the constructor with the two parameters so
		 * now there is no constructor in the source code of ABMISpreadsheet.
		 * Uncomment the statement above if you commented it.
		 * Does the statement above compile? If not, comment it.
		 * How many constructors?
		 * Can you explain the numbers and compile errors?
		 * 	
		 * (T/F) The source code of a class (written by the programmer) may not contain a constructor.
		 * 
		 * (T/F) The compiled object code of a class may not contain a constructor.
		 * 
		 * (T/F) The source code of a class may contain multiple constructors.
		 * 
		 * (T/F) The object code of a class may contain multiple constructors.
		 * 
		 * What are the parameters and body of a constructor inserted by a compiler in object code?
		 */
	}
	/*
	 * Change package name in link.
	 * Next file:  {@link UninitializedVariables}
	 */
}
