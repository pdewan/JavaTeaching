package lectures.inheritance;
/*
 * Study the program and run it without break points.
 */
public class AStringSet extends AStringDatabase // extending an extended class
	implements StringDatabase { // same interface as implemented by the superclass
	public AStringSet() {
		super(); 
		uselessVariable = 1;
//		super();
    }
	public void addElement(String element) {
		/*
		 * SUPER CALL IN METHOD
		 * set a break point here and Step Over (F6) the statements to see
		 * which path is taken in the two adds
		 * 
		 */
		if (isFull()) {
			System.out.println("Adding item to a full history");
		} else if (!member(element)) { // add only if the element is not a member
			/*
			 * click on addElement and hit F3 to see where the call before is defined
			 */
			super.addElement(element);
			/*
			 * what if we called addElement without super?
			 * 
			 */
//			addElement(element); 
		}
	}
	
	 public static void main (String[] args) {		 
    	StringDatabase aStringSet = new AStringSet();
//    	StringDatabase aStringSet = new AStringDatabase(); 
    	/*
		 * click on manipulateDatabase and hit F3 to see where the call before is defined
    	 */
    	manipulateDatabase(aStringSet); 
    	/*
    	 * What if we called manipulateDatabase with super? Is that legal in Java?
    	 * 
    	 */
//    	super.manipulateDatabase(aStringSet);
	  }
	 
}
/*
 * Why do you think this object is called a set?

 * CLASS OBJECT
 * Go to the definition of toString() in AStringSet.
 * Comment out the current return statement and uncomment the one below.
 * Set a breakpoint at the new return statement.
 * Debug-Run the program again. When you stop at the break point,
 * and step into (F5) the super call in the return statement.
 * In which class do you land?

 * PRIVATE VS PROTECTED VS DEFAULT ACCESS

 * For the next part, you need to note that AStringHistory is in a different package from
 * AStringDatabase and AStringSet

 * Comment out the keyword protected from the declaration of size in AStringHistory.
 * Note the errors in its subclass(es) if any.
 * Now comment our this keyword from uselessVariable in AStringDatabase.
 * Note the errors in its subclass(es) if any?
 * Add the keyword private to the declaration of uselessVariable.
 * Note the errors in te subclasses of AStringDatabase (if any).
 * Can you figure out the rules of variable visibility in different classes?

 * CONSTRUCTORS AND SUBCLASSING

 * Uncomment the parameterless constructor in AStringHistory and run this program and see if its
 * output appears on the console.
 * Uncomment the single-parameter constructor and run this program and see if its output
 * appears on the console.
 * Can you explain the difference?

 * Uncomment the constructor in AStringDatabase and run this program and see if if its
 * output appears on the console.
 * Remove the call to super in the constructor in AStringSet. Did that make a difference.

 * SUPER CALL PLACEMENT
 * Uncomment the top super in the constructor in this class and comment the first one out.
 * Note the error
 * What would be the value of useLessVariable if the second super was allowed? 
 * Does it make sense for a super class to initialize after the subclass does?

 * ORDER OF INITIALIZATION
 * To really understand what is going on, put a break point on the first statement of 
 * the constructor in AStringSet and use f5 (Step into) to trace the path to the constructor
 * in AStringHistory noting the order in which the variables and constructors are called.
 * What are the various values taken by uselessVariable in this process.
 * 
 */



