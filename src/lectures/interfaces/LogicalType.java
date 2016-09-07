package lectures.interfaces;
/*
 * This class motivates but does not use interfaces.
 */
public class LogicalType {
	/*
	 * Purposely using bad names for variables to provide the motivation.
	 *  
	 * 
	 */
	static ALoopingFactorialSpreadsheet a = new ALoopingFactorialSpreadsheet();
	static ARecursiveFactorialSpreadsheet b = new ARecursiveFactorialSpreadsheet();
	static ABMISpreadsheet c = new ABMISpreadsheet();
	/*
	 * This space left intentionally blank.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main (String[] args) {
		System.out.println (a.getNumber() + ":" + a.getFactorial());
		System.out.println (b.getNumber() + ":" + b.getFactorial());
		System.out.println (c.getHeight() + "," + c.getWeight() + ":" + c.getBMI());
		
		// Can you tell without looking at the static variable declaration whether c is assigned 
		// an instance of ALoopingFactorialSpreadsheet, ARecursiveFactorialSpreadsheet, or ABMISpreadsheet
		// Can you do the same for a (or b), that is, whether a (b) is assigned
		// an instance of ALoopingFactorialSpreadsheet, ARecursiveFactorialSpreadsheet, or ABMISpreadsheet
		// Is there any use context that can distinguish between instances of the two spreadsheets?
		// If instances of two classes cannot be distinguished by their external use context, then
		// they are of the same logical type.
		// Though they may internally be implemented very differently and perform very differently in different cases.
		// How to unite these two classes by a single type
		
		
		
	}

}
