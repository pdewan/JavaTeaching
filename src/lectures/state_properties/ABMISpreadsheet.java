package lectures.state_properties;
public class ABMISpreadsheet  {
	double height;
	double weight;	
	// A constructor - looks and behaves like a method except
	// It is called once per object when we do a new to create it.
	// Java constructs the object, loads it into memory, and then calls the constructor, which can  initialize
	// the variables (or not)
	// What follows new is not the name of the class but the name of the constructor and its parameters
	// The name of a constructor must always be the same as the name of the class in which it is declared
	// There is no return type explicitly associated with a constructor.
	// The class in which it is declared is the implicit return type
	
	// A constructor with no parameters, that does nothing, does no initializations
	// Example call to it is: new ABMISpreadsheet();
	public ABMISpreadsheet() { 
		
	}
	// The following is another constructor wirth the same name with two parameters.
	// All constructors have the same name, that is, are overloaded
	// Ordinary methods can also be overloaded
	// Based on parameters supplied Java knows which constructor/method to call
	// This constructor initialized the instance variables
	public ABMISpreadsheet(
			double theInitialHeight, double theInitialWeight) {
		setHeight(theInitialHeight);
		setWeight(theInitialWeight);
	}
	// The following is another overloaded method with the same as the constructor.
	// It has an explicit return type, so it is not a constructor.
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
//		System.out.println("setHeight() Called");
		height = newValue;
	}	
	public double getBMI() {
//		System.out.println("getBMI() Called");
		return weight/(height*height);
	}
	
}
