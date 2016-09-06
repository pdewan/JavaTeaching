package lectures.constructors_pointers;

public class UsingConstructors {
	/*
	 * 
	 * Final variable is a named constant - a variable that that cannot be changed later.
	 * It gives a name to a literal that would otherwise be magic to the program reader.
	 * It makes sure magic numbers and strings do not appear in the program.
	 * These should be static as they do not change from instance to instance.
	 * 
	 * Relevant Sakai Questions:
	 * 
	 *  What is a named constant?
	 *  What is a magic number?
	 */
	 
	 static final double EXAMPLE_HEIGHT = 1.77;
	 static final double EXAMPLE_WEIGHT = 75;
	 
	 /*
	 * Example of a method that takes a class parameter, that is, a parameter
	 * whose type is a class
	 */
	public static void print(ABMISpreadsheet aBMISpreadsheet) {
		System.out.println ("Height:" + aBMISpreadsheet.getHeight() + 
				" Weight:" + aBMISpreadsheet.getWeight() +
				" BMI " + aBMISpreadsheet.getBMI());
	}
	
	public static void main (String[] args) {
		/*
		 * Instantiate the class ABMISpreadsheet
		 */
		ABMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet();
		/*
		 * Invoke setters on the instance
		 */
		aBMISpreadsheet.setWeight(EXAMPLE_WEIGHT);
		aBMISpreadsheet.setHeight(EXAMPLE_HEIGHT);		
		print (aBMISpreadsheet);
		/*
		 * Does it make sense for the height or weight to ever be 0?
		 * The following uses a different syntax for new.
		 * It provides the height and weight when instantiating the class.
		 * It makes sure the instance variables in the class are initialized to values specified 
		 * by the use of the class
		 */
		aBMISpreadsheet = new ABMISpreadsheet(EXAMPLE_HEIGHT, EXAMPLE_WEIGHT);
		print(aBMISpreadsheet);
		/*
		 * Change package name in link.
		 * Next class {@link lectures.constructors_pointers.ABMISpreadsheet}
		 * to better understand constructors.
		 */
		
		
	}

}
