package lectures.interfaces;

public class PolymophicType {
	// We no longer differentiate between variables holding instances of the two factorial classes
	// We use a special type FactorialSpreadsheet, which is an interface rather than a class
	// Got to its definition and examine it -does it capture what is common to both
	// ALoopingFactorialSpreadsheet and ARecursiveFactorialSpreadsheet
	static FactorialSpreadsheet a = new ALoopingFactorialSpreadsheet();	
	static FactorialSpreadsheet b = new ARecursiveFactorialSpreadsheet();
	public static void main (String[] args) {
		
		// There is a 50/50 chance, when the program is executed that the condition of the following
		// if will be satisfied
		if (Math.random() > 0.5) {
			
			// Just assigned to a variable that held an instance of one class an instance of
			// another class!
			// A variable that can be assigned objects of multiple classes is a polymorphic variable
			a = b;
			
		}
		
		// At this point, the computer, which does its job before the program is 
		// executed has no idea what the class of the object is that is assigned to a.
		// So all type checking is done based on what is provided in the interface, FactorialSpreasheet
		// Does the interface contain enough information to say that the following is legal?
		System.out.println (a.getNumber() + ":" + a.getFactorial());
		
		// Does it contain enough information to say that the following is illegal
//		System.out.println (a.getHeight() + "," + a.getWeight() + ":" + a.getBMI());
		
		// The following is legal
		a = new ALoopingFactorialSpreadsheet();
		// But the following is not
//		a = new ABMISpreadsheet();
		// Why? 		
		// To understand,go to the definition of ALoopingFactorialSpreadsheet (F3) The key is the implements clause.
		// Let us try to understand what it really means
		// Comment out the definition of one of the method in the class: getNumber();
		// Does the error message in that class make sense?
		// Copy the method getNumber() and call it getN()
		// You will not get any error message. 
		// When a class C says it implements an interface I, what exactly is it guaranteeing?

		ALoopingFactorialSpreadsheet l = new ALoopingFactorialSpreadsheet();
		ARecursiveFactorialSpreadsheet r = new ARecursiveFactorialSpreadsheet();

		// Comment out the following lines. Which ones give you errors.
//		System.out.println (a.getN());
//		System.out.println (l.getN());
//		System.out.println (r.getN());
//		r = l;
		// Can you explain this?
		
		// As we see above, when a Class C implements an interface I, we can use
		// both C and I as types. Which should we choose?
		
		// Look at the two prints below.
		// Uncomment the statements below
//		printPolymorphic(l);
//		printPolymorphic(r);
//		printPolymorphic(a);
//		printPolymorphic(b);
//		
//		printNonPolyMoprhic(l);
//		printNonPolyMoprhic(r);
//		printNonPolyMoprhic(a);
//		printNonPolyMoprhic(b);
		
		// Do the error messages make sense?
		// Which print is more versatile, that is, can operate on more objects?
		
		// Polymorphism is only one of the advantage of interfaces.
		// Think of other advantages.
		// To understand one of them, click on the name FactorialSpreadsheet below and press F4
		// You should see a new tree window called the type hierarchy.
		// Does the window make sense? Is it useful even if you did not use polymorphism
		
		// To unite the type checking rules and this hierarchies consider the following
		// Which of these instanceof operations aways/sometimes make sense?;
//		System.out.println (l instanceof ALoopingFactorialSpreadsheet);
//		System.out.println (r instanceof ALoopingFactorialSpreadsheet);
//		System.out.println (l instanceof FactorialSpreadsheet);
//		System.out.println (r instanceof FactorialSpreadsheet);
//		System.out.println (a instanceof ALoopingFactorialSpreadsheet);
//		System.out.println (a instanceof ALoopingFactorialSpreadsheet);
		
		// As we see above, with polymorphism, an object can now be considered an instance of multiple types
		
		// Why does the following not make sense?
		
//		a = new FactorialSpreadsheet();
		// what would it mean to execute a.getFactorial() if the above was allowed
		
		// Look at Point, CartesianPoint, PolarPoint BMISpreadsheet, ABMISpreadsheet
		// and AnotherBMISpreadheet to see other uses of interfaces




		
		
	}
	
	// This is a polymorphic method as it declares a polymorphic parameter
	public static void printPolymorphic (FactorialSpreadsheet aFactorialSpreadsheet) {
		System.out.println (aFactorialSpreadsheet.getNumber() + ":" + aFactorialSpreadsheet.getFactorial());
	}
	// This is not a polymorphic method as it does not declare a polymorphic parameter
	// (Actually when we study inheritance we we will see that it does - even so
	// the former print is more
	public static void printNonPolyMoprhic (ALoopingFactorialSpreadsheet aFactorialSpreadsheet) {
		System.out.println (aFactorialSpreadsheet.getNumber() + ":" + aFactorialSpreadsheet.getFactorial());
	}
}
