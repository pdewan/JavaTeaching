package lectures.constructors_pointers;
public class ABMISpreadsheet  {
	/*
	 * Uninitializing declarations
	 */
	double weight;	
	double height;	
	
	/*
	 * Initializing declaration
	 */
//	double height = 1.77;
	
	/*
	 * A constructor, not seen before.  
	 */
	public ABMISpreadsheet(
			double theInitialHeight, double theInitialWeight) {
		setHeight(theInitialHeight);
		setWeight(theInitialWeight);
	}
	/* 
	 * A constructor - looks and behaves like a method except
	 * it is called once per object when we do a new to create it, which passes
	 * parameters to the constructor:	 * 
	 *     new ABMISpreadsheet(EXAMPLE_HEIGHT, EXAMPLE_WEIGHT);
	 * 
	 * (T/F) During the lifetime of an object, a constructor can be called multiple
	 * times to operate on the object.	
	 * 
	 * (T/F) A constructor is executed before an instance method can be called.* 	 
	 * 
	 * Look at the difference between the syntax of a constructor and an instance 
	 * method. 
	 *  
	 * (T/F) Like an instance method, a constructor can take parameters.
	 * 
	 * (T/F) Like an instance method, a constructor must have a method name and 
	 * a method return type.	 
	 * 	
	 * The name of a constructor must always be the same as the name of the class in 
	 * which it is declared.
	 * There is no return type explicitly associated with a constructor.
	 * The class in which it is declared is the implicit return type.
	 * In contrast a method must have a return type and a name.
	 *
	 * The above is a constructor with two parameters, which are 
	 * assigned to the two instance variables.	 
	 * Thus, this constructor initializes the instance variables.
	 * Do you see any code in the constructor to "construct" the instance -
	 * allocate space for the instance variables in memory?
	 * 
	 * Java constructs the object, loads it into memory, and then calls the constructor, 
	 * which can initialize the variables (or not) with the constructor parameters.
	 * Initialization means it gives the variables its initial values - non-final
	 * variables can be changed multiple times.
	 * 
	 * 	 
	 * A constructor:
	 *   (a) "constructs" the object, that is, allocates space for 
	 * 	  the instance	variables of the object in memory.
	 *   (b) can initialize instance variables of an object.
	 *   (c) must initialize instance variables of an object.
	 */
	
	
	public ABMISpreadsheet() { 
	}
	
	/*
	 * The above is another constructor with the same name 
	 * as the first constructor,but this time with no parameter.
	 * Example call to it is: 
	 *     new ABMISpreadsheet();
	 * We saw calls to both constructors in UsingConstructors.
	 * 
	 * All constructors have the same name, that is, are overloaded.
	 * 
	 * Ordinary methods can also be overloaded.
	 * Based on parameters supplied Java knows which constructor/method to call
	 * 
	 * (T/F) A class can have overloaded methods, that is, multiple methods with the same name.
	 * (T/F) A class can have multiple constructors with different parameters.	 
	 * 
	 */
	
	/*
	 * The following is another overloaded method with the same name as the constructor.
	 * Like a regular method, it has an explicit return type, so it is not a constructor.
	 * 
	 * (T/F) An instance method can have the same name as a constructor.
	 * 
	 */
	
	public int ABMISpreadsheet() { 
		return 0;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double newValue) {
		weight = newValue;
	}	
	public double getHeight() {
		return height;
	}
	public void setHeight(double newValue) {
		height = newValue;
	}	
	public double getBMI() {
		return weight/(height*height);
	}
	
/*
 * Replace the uninitializing declaration of height with the commented initializing
 * one given at the top of this file and run {UsingConstructors}
 * Does the initialization make a difference to the outputs? If it does, then
 * the variable initialization occurs after the two-parameter constructor is called,
 * which also assigns a value to the variable. If not, then the constructor is
 * called after the declaration code.
 * 
 * (T/F) A constructor is executed before the instance variables of a class 
 * are initialized through variable declarations. * 
 * 
 */
/*
 * Next class: {PrintingConstructors}
 */
}
