package lectures.interfaces;
/*
 * This class motivates but does not use interfaces.
 * It uses classes as types of variables.
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
	 * (T/F) The type of an object variable determined what operations can be performed on it.
	 * Comment out each of the following declarations and see what compile errors you get
	 */
//	long factorial1 = a.getFactorial();
//	int factorial2 = c.getfactorial();
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
	 * 
	 * 
	 * 
	 * 
	 */		
	public static void main (String[] args) {
		
		
		System.out.println (a.getNumber() + ":" + a.getFactorial());
		System.out.println (b.getNumber() + ":" + b.getFactorial());
		System.out.println (c.getHeight() + "," + c.getWeight() + ":" + c.getBMI());
		/*
		 * 	
		 * (T/F) If the same set of public methods can be invoked on two encapsulated classes
		 * (classes with no public methods) then the the classes are of the same logical type.
		 * (T/F) If two classes are of the same logical type, then it is not possible to possible
		 * to distinguish between them based on the public methods that can be executed on their instances.
		 * 
		 * Can you tell without looking at the static variable declaration whether c is assigned 
		 * an instance of 
		 * {@link ALoopingFactorialSpreadsheet}, 
		 * {@link ARecursiveFactorialSpreadsheet}, or 
		 * {@link ABMISpreadsheet}	
		 * 	 
		 * Can you do the same for a (or b), that is, whether a (b) is assigned
		 * an instance of ALoopingFactorialSpreadsheet  ARecursiveFactorialSpreadsheet, or ABMISpreadsheet
		 * 
		 * Is there any publicly available usage context that can distinguish between instances of the two spreadsheets?
		 * If instances of two classes cannot be distinguished by their public context of their external use, then
		 * they are of the same logical type.		 * 
		 * Though they may internally be implemented very differently and perform very differently in different cases.
		 *
		 */
		
		/*
		 * (T/F) The  Java (physical) type of an object variable determines what instances can be assigned to it.
		 * (T/F) If C1 and C2 have the same logical type, and a variable c is declared to be of type C1,
		 * then c can be assigned an instance of C2.
		 * Comment out each of the statements and see if you get a compile error
		 */
//		a = new ALoopingFactorialSpreadsheet();
//		a = new ARecursiveFactorialSpreadsheet();	
		
	}
}
/*
 * Next class: {@link PolymorphicType}
 */
