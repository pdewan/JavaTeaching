package lectures.interfaces;

public class PolymorphicType {
	/*	
	 * Which is true:
	 * An interface contains only bodies of methods (the code between curly braces after a method header)
	 * An interface contains both  headers and bodies of methods.
	 * 
	 * (T/F) An interface provides a Java type to unite classes that are of the same logical type.
	 * (T/F If class C implements interface I, then an instance of C can be assigned to a variable
	 * of type I.
	 * 
	 * We no longer differentiate between variables holding instances of the two factorial classes
	 * We use a special type {@link FactorialSpreadsheet}, which is an interface rather than a class
	 * Got to its definition and examine it -does it capture what is common to both
	 * ALoopingFactorialSpreadsheet and ARecursiveFactorialSpreadsheet?
	 */
	 
	static FactorialSpreadsheet a = new ALoopingFactorialSpreadsheet();	
	static FactorialSpreadsheet b = new ARecursiveFactorialSpreadsheet();
	public static void main (String[] args) {
		
		/*
		 * There is a 50/50 chance, when the program is executed that the condition of the following
		 * if will be satisfied
		 */
		
		if (Math.random() > 0.5) {
			/*
			 * T/F A polymorphic variable can be assigned instances of different classes.
			 * 
			 * Assigned to a variable that held an instance of one class an instance of
			 * another class!
			 * A variable that can be assigned objects of multiple classes is a polymorphic variable
			 * 
			 */			 
			a = b;
			
		}
		/*
		 * 
		 * (T/F) The operations that allowed on a polymorphic variable by the compiler depend
		 * on the type the variable (e.g FactorialSpreadsheet) rather than the class of the object 
		 * assigned to it (e.g. ALoopingFactorialSpreadsheet).
		 * 
		 * At this point, the computer, which does its job before the program is 
		 * executed has no idea what the class of the object is that is assigned to a.
		 * So all type checking is done based on what is provided in the interface, FactorialSpreasheet
		 * 
		 */	

		/*
		 * (T/F) If class C implements I, then C must have a method matching every method in I.
		 * (T/F) If class C implements I, then I must have a method matching every method in C.
		 * class C must contain		
		 * Go to the definition of {@link FactorialSpreadsheet) (F3).
		 * Let us try to understand what the implements clause really means.
		 * Add a method, getA, to the interface. Do you get a compile error in the
		 * two classes that implement it?
		 * Comment it out if you do.
		 * Now go to {@link ALoopingFactorialSpreadsheet)		
		 * Copy the method getNumber() and call it getN()
		 * Do you get an error message? 
		 */
		 
		/*
		 * 
		 * (T/F) The operations that allowed on a polymorphic variable by the compiler depend
		 * on the type the variable (e.g FactorialSpreadsheet) rather than the class of the object 
		 * assigned to it (e.g. ALoopingFactorialSpreadsheet).
		 * 
		 * Comment out the following statement. Do you get a compile error?
		 * 
		 */		
//		System.out.println (a.getN() + ":" + a.getFactorial());
		
		
		/*
	 	 * As we see above, when a Class C implements an interface I, we can use
		 * both C and I as types. Which should we choose? We can declare variables
		 * using both interfaces as we see above for variables a and b, or classes, as shown below.
		 * 
		 * The answer is interfaces. To understand why go below this method and look at the
		 * two print methods printPolymorphic() and printNonPolyMoprhic();

		 */
		ALoopingFactorialSpreadsheet l = new ALoopingFactorialSpreadsheet();
		ARecursiveFactorialSpreadsheet r = new ARecursiveFactorialSpreadsheet();
		
	
//		printPolymorphic(l);
//		printPolymorphic(r);
//		printPolymorphic(a);
//		printPolymorphic(b);
//		
//		printNonPolyMoprhic(l);
//		printNonPolyMoprhic(r);
//		printNonPolyMoprhic(a);
//		printNonPolyMoprhic(b);
		
		/*
		 * 
		 * Do the error messages make sense?
		 * Which print is more versatile, that is, can operate on a greater variety of objects?
		 *
		 *
		 * What are the advantages of interfaces?
		 * If a class is  a factory, what is an interface?
		 * (T/F) If C implements I, then an instance of C is also considered an instance of I.
		 * 
		 * Polymorphism is only one of the advantage of interfaces.
		 * Think of other advantages.
		 * To understand one of them, click on the name FactorialSpreadsheet below and press F4
		 * You should see a new tree window called the type hierarchy.
		 * Does the window make sense? Is it useful even if you did not use polymorphism
		
		 * To unite the type checking rules and this hierarchies consider the following
		 * Which of these instanceof operations aways/sometimes make sense?;
		 */
//		System.out.println (l instanceof ALoopingFactorialSpreadsheet);
//		System.out.println (r instanceof ALoopingFactorialSpreadsheet);
//		System.out.println (l instanceof FactorialSpreadsheet);
//		System.out.println (r instanceof FactorialSpreadsheet);
//		System.out.println (a instanceof ALoopingFactorialSpreadsheet);
//		System.out.println (a instanceof ALoopingFactorialSpreadsheet);
		
	}
	/*
	 * (T/F) A polymorphic methods has one or more parameters that can be assigned instances
	 * of multiple classes.
	 * 
	 * This is a polymorphic method as it declares a  parameter that is a polymprhic variable.
	 */
	public static void printPolymorphic (FactorialSpreadsheet aFactorialSpreadsheet) {
		System.out.println (aFactorialSpreadsheet.getNumber() + ":" + aFactorialSpreadsheet.getFactorial());
	}
	/*
	 * This is not a polymorphic method as it does not declare a polymorphic parameter
	 * (Actually when we study inheritance we we will see that it does - even so
	 * the former print is more
	 */
	public static void printNonPolyMoprhic (ALoopingFactorialSpreadsheet aFactorialSpreadsheet) {
		System.out.println (aFactorialSpreadsheet.getNumber() + ":" + aFactorialSpreadsheet.getFactorial());
	}
}
