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
 * (T/F) The source code of a class (written by the programmer) must always
 * contain an unparameterized constructor.
 * 
 * (T/F) The compiled object code of a class must always contain an unparameterized 
 * constructor.
 * 
 * (T/F) The source code of a class may contain multiple constructors.
 * 
 * (T/F) The object code of a class may contain multiple constructors.
 * 
 */
/*
 * Change package name in link.
 * Next file:  {UninitializedVariables}
 */
}
