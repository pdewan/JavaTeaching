package lectures.interfaces;
/**		
 * (T/F) An interface provides a Java type to unite classes that implement the same conceptual type.

 * Now we no longer differentiate between variables holding instances of the 
 * two factorial classes
 * We use a special type {@link FactorialSpreadsheet}, which is an 
 * interface rather than a class
 * Go to its definition and examine it - does it capture what is common to both
 * ALoopingFactorialSpreadsheet and ARecursiveFactorialSpreadsheet? Does everything in
 * the interface appear in each of the two classes?
 * Use ALT <- to return to this class
 */
public class PolymorphicType {
	/*
	 * (T/F If class C implements interface I, then an instance of C can be 
	 *  assigned to a variable of type I.
	 */	 
	static FactorialSpreadsheet a = new ALoopingFactorialSpreadsheet();	
	static FactorialSpreadsheet b = new ARecursiveFactorialSpreadsheet();
	
	public static void main (String[] args) {
		
		/*
		 * The purpose of the if below is to show that one cannot predict the
		 * value a variable might hold at execution time. With interfaces, 
		 * one can also not	predict the	class of the value assigned to a 
		 * variable. 
		 * There is a 50/50 chance, when the program is executed, that the
		 * condition of the following if will be satisfied.
		 */		
		if (Math.random() > 0.5) { // hover on random to see what it does
			/*		
			 * 
			 * Below, we assign to a variable that held an instance 
			 * of one class an instance of another class!
			 * 
			 * A variable that can be assigned objects of multiple classes is a 
			 * polymorphic variable.
			 * 
			 * T/F A polymorphic variable can be assigned instances of 
			 * different classes.
			 */			 
			a = b;
			
		}
		/*
	
		 * 
		 * At this point, because of the call to randonm(),
		 * the compiler, which does its job before the program is 
		 * executed has no idea of the class of the object assigned to a is 
		 * at execution time.
		 * So all type checking is done based on what is provided in the interface, 
		 * FactorialSpreasheet.
		 * 	
		 * (T/F) The operations that are allowed on a polymorphic variable by 
		 * the compiler depend on the type of the variable 
		 * (e.g FactorialSpreadsheet) rather than the class of the object 
		 * assigned to it (e.g. ALoopingFactorialSpreadsheet).
		 * 
		 */	

		/*
		 * Let us try to understand what the implements clause really means.
		 * 
		 * (T/F) If class C implements I, then C must have a method matching 
		 * every method in I.
		 * (T/F) If class C implements I, then I must have a method matching 
		 * every method in C.
		 * 
		 * Go to the definition of {@link FactorialSpreadsheet) (F3).
		 * Uncomment the method, public int getA(), in the interface. 
		 * Do you get a compile error in the two classes
		 * (ALoopingFactorialSpreadsheet or ARecursivefactoralSpreadsheet) 
		 * that implement it? If so, what does it say. Comment it out if you do.
		 * 
		 * Now go to {@link ALoopingFactorialSpreadsheet)		
		 * Copy the method getNumber() and call it getN()
		 * Do you get an error message? If so, what does it say.
		 * Comment it out if you do.
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
		 * using both interfaces as we see above for variables a and b, or classes, 
		 * as shown below.
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
		 * 
		 * Which print is more versatile, that is, can operate on a greater 
		 * variety of objects?
		 */
		
		/*
		 * If a class is  a factory, what is an interface?
		 * What are the advantages of interfaces?
		 * What do you think of the rule - every class should implement at least 
		 * one interface?
		 * What do you think of the rule - every object variable should be typed
		 * using an interface rather than a class.
		 * 
		 * Polymorphism is only one of the advantage of interfaces.
		 * Think of other advantages.
		 * To understand one of them, click on the name FactorialSpreadsheet 
		 * below and press F4.
		 * You should see a new tree window called the type hierarchy.
		 * Does this hierarchy make sense? 
		 * Is it useful even if you did not use polymorphism?
		 * 
		 */
		
		/*
		 * (T/F) If C implements I, then an instance of 
		 * C is also considered an instance of I.
		 * 		
		 * To unite the type checking rules and this hierarchies consider the following
		 * Which of these instanceof operations aways/sometimes make sense?;
		 */
//		System.out.println (l instanceof ALoopingFactorialSpreadsheet);
//		System.out.println (r instanceof ALoopingFactorialSpreadsheet);
//		System.out.println (l instanceof FactorialSpreadsheet);
//		System.out.println (r instanceof FactorialSpreadsheet);
//		System.out.println (a instanceof ALoopingFactorialSpreadsheet);
//		System.out.println (a instanceof ALoopingFactorialSpreadsheet);
		
		/*
		 * (T/F If class C implements interface I, then an instance of I can be 
		 *  assigned to a variable of type C.
		 *  
		 * Uncomment the following to answer this question
		 */
//		ALoopingFactorialSpreadsheet c = a;
		/*
		 * Why did we need the two print methods?
		 * Comment out all of the println() statements above that give errors.
		 * 
		 * Next, comment out the following two statements and run the program.
		 * What output do you get?
		 * This output will help you understand the output of A3.
		 */
		System.out.println ("l hashcode:" + Integer.toHexString(l.hashCode()));
		System.out.println ("l:" + l);
		
		
	}
	/*
	 * (T/F) A polymorphic method has one or more parameters that can be assigned instances
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
	 * the former print is more flexible.
	 */
	public static void printNonPolyMoprhic (ALoopingFactorialSpreadsheet aFactorialSpreadsheet) {
		System.out.println (aFactorialSpreadsheet.getNumber() + ":" + aFactorialSpreadsheet.getFactorial());
	}
}
