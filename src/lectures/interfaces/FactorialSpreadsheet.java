package lectures.interfaces;
/* 
 * Which is true:
 * 	An interface contains only bodies of methods 
 * 	    (the code between curly braces after a method header)
 * 	An interface contains both headers and bodies of methods.
 */
public interface FactorialSpreadsheet {
	/*
	 * Comment out this method. Do you get a compile error in 
	 * ALoopingFactorialSpreadsheet or ARecursivefactoralSpreadsheet?
	 */
	public int getNumber();
	public void setNumber(int newValue) ;
	public long getFactorial();
	/*
	 * Uncomment the method below. Do you get a compile error in 
	 * ALoopingFactorialSpreadsheet or ARecursivefactoralSpreadsheet?
	 * Comment it out if you do.
	 *  
	 */
//	public int getA();
}
