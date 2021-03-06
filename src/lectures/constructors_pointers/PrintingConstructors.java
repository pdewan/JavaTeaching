package lectures.constructors_pointers;

import java.util.Arrays;

import lectures.class_dual_roles.instances.ALoopingFactorialSpreadsheet;
/*
 * This class shows the constructors that exist in the compiled object code
 * available at runtime.
 */
public class PrintingConstructors {
	/*
	 * The following method prints the constructors in a compiled class that
	 * is the number of constructors in the object code of a class.	 
	 * 
	 */
	public static void printConstructors(Class aClass) {
		System.out.println(Arrays.toString(aClass.getConstructors()));
	}
	/*
	 * Run main and observe the output.
	 */
	public static void main (String[] args) {
		printConstructors(ABMISpreadsheet.class);
		// In class ALoopingFactorialSpreadsheet we did not declare a constructor.
		printConstructors(ALoopingFactorialSpreadsheet.class);		
	}
/* 
 * 	
 * (T/F) The source code of a class (written by the programmer) might not contain a constructor.
 * 
 * (T/F) The compiled object code of a class might not contain a constructor.
 * 
 * Inserting a constructor in object code implies that some constructor is added to
 * the object code that did not exist in the source code.
 * 
 * 
 * The complier:
 *   a) may insert a constructor in the object code.
 *   b) always inserts a constructor in the object code.
 *   c) never inserts a constructor in the object code.
 * 
 * 
 */
/*
 * Change package name in link.
 * Next file:  {UninitializedVariables}
 */
}
