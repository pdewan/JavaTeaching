package lectures.constructors_pointers;
public class ABMISpreadsheet  {
	
	double height;	
//	double height = 2.0;
	double weight;	
	/*
	 * A constructor - looks and behaves like a method except
	 * It is called once per object when we do a new to create it.
	 * Java constructs the object, loads it into memory, and then calls the constructor, which can  initialize
	 * the variables (or not)
	 * What follows new is not the name of the class but the name of the constructor and its parameters
	 * The name of a constructor must always be the same as the name of the class in which it is declared
	 * There is no return type explicitly associated with a constructor.
	 * The class in which it is declared is the implicit return type.	 * 
	 *
	 * The following is a constructor with two parameters, which are 
	 * assigned to the two instance variables.	 
	 * Thus, this constructor initializes the instance variables.
	 * Example call to it is: new ABMISpreadsheet(1.77, 75);
	 * 
	 *  Relevant Sakai Questions:
	 * Why provide constructors in a language?
	 * (T/F) A constructor cannot take parameters.
	 * (T/F) During the life time of an object, multiple constructors can be called to operate on it.
	 * (T/F) A constructor "constructs" the object, that is, allocates space for the instance  variables of the object in memory.
	 */
	public ABMISpreadsheet(
			double theInitialHeight, double theInitialWeight) {
		setHeight(theInitialHeight);
		setWeight(theInitialWeight);
	}
	/*
	 * The following is another constructor with the same name with no parameter.
	 * All constructors have the same name, that is, are overloaded
	 * Ordinary methods can also be overloaded
	 * Based on parameters supplied Java knows which constructor/method to call
	 * A constructor with no parameters, that does nothing, does no initializations
	 * Example call to it is: new ABMISpreadsheet();
	 * 
	 * (T/F) A constructor cannot take parameters.
	 * (T/F) A constructor is executed before before an instance method can be called.
	 * 
	 * 
	 */
	public ABMISpreadsheet() { 
		
	}
	/*
	 * The following is another overloaded method with the same name as the constructor.
	 * It has an explicit return type, so it is not a constructor.
	 * 
	 * (T/F) The syntax of a constructor header is the same as the syntax of a method header.
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
	 * one given at the top of this file and run {@link UsingConstructors}
	 * Does the initialization make a difference to the outputs? 
	 * 
	 * (T/F) A constructor is executed before the instance variables of a class are initialized.
	 * 
	 * 
	 */
	/*
	 * Change package name in link.
	 * Next class: {@link PrintingConstructors}
	 */
}
