package lectures.interfaces;
/* 
 * Which is true:
 * 	An interface contains only headers of methods 
 * 	    (the code between curly braces after a method header)
 * 	An interface contains both headers and bodies of methods.
 */
public interface FactorialSpreadsheet {
	/*
	 * Comment out this method. Do you get a compile error in 
	 * ALoopingFactorialSpreadsheet or ARecursivefactoralSpreadsheet and
	 * what is the error is you do (hover on a red mark denoting an error
	 * to look at the explanation and click on it to get a fix)?
	 */
	public int getNumber();
	public void setNumber(int newValue) ;
	public long getFactorial();
	/*
	 * Uncomment the method below. Do you get a compile error in 
	 * ALoopingFactorialSpreadsheet or ARecursivefactoralSpreadsheet
	 * and what is the error if you do?
	 * Comment it out if you do.
	 *  
	 */
//	public int getA();
}
