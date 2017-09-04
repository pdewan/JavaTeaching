package lectures.class_dual_roles.users;

/*
 * Use commenting and uncommenting to switch between the imports below.
 * 
 * Can you have both imports in this class? That is, can you import
 * two different classes from two different packages with the same short name?
 */
import lectures.class_dual_roles.statics.StaticLoopingFactorialSpreadsheet;

public class StaticFactorialSpreadsheetUse {
	/*
	 * Run the program. Then study this class and the classes to which it refers.
	 * Then follow the commented instructions in each of the classes referenced 
	 * in the package-info
	 */
	public static void main (String[] args) {		
		StaticLoopingFactorialSpreadsheet.setNumber(4);
		/*
		 * Squaring the factorial below. 
		 * Is the factorial of 4 computed twice when we call getFactorial() twice?
		 * Based on this answer, can you justify why we need both
		 * Factorials and StaticLoopingFactorialSpreadsheet
		 * and why we use the term spreadsheet for the latter.
		 * (Hint: think of the difference between a calculator and spreadsheet)
		 */
		System.out.println("The square of 4 factorial is:" + StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		/*
		 * What compile error do we get if we uncomment the following two statements?
		 * Click on the error and say yes to making the variable public or go to the class
		 * and declare the variable factorial public. 
		 * Does the uncommented println print correct output when you run the program now?
		 */
//		StaticLoopingFactorialSpreadsheet.factorial = 0;	
//		System.out.println("The square of 4 factorial is:" + StaticLoopingFactorialSpreadsheet.getFactorial() 
//				* StaticLoopingFactorialSpreadsheet.getFactorial());
		
		/*
		 * The principle of least privilege says do not give any code more rights than it needs.
		 * What variables and methods should be public and not public in 
		 * StaticLoopingFactorialSpreadsheet?
		 * 
		 * 
		 */
		StaticLoopingFactorialSpreadsheet.setNumber(2);
		System.out.println("The square of 2 factorial is:" + StaticLoopingFactorialSpreadsheet.getFactorial() 
				* StaticLoopingFactorialSpreadsheet.getFactorial());
		/*
		 * When we called setNumber(2), we erased the previous factorial (4!) in 
		 * StaticLoopingFactorialSpreadsheet.
		 * A class cannot access 4! and 2! simultaneously (without storing them 
		 * in local variables.)
		 * Problem: how to allow multiple stored factorials to be shared by 
		 * multiple classes or the same clas.
		 * Go to {lectures.class_dual_roles.users.TwoStaticFactorialSpreadsheetUse} 
		 * for one not very nice solution.
		 * 
		 */
		
	}	
}
/*
 * Next class:  {TwoStaticFactorialSpreadsheetUse}
 */
