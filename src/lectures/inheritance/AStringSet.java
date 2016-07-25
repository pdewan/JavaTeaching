package lectures.inheritance;

// Study the program and the comments and run it without break points.
public class AStringSet extends AStringDatabase // extending an extended class
	implements StringDatabase { // same interface as implemented by the superclass
	public void addElement(String element) {
		// set a break point here and Step Over (F6) the statements to see
		// which path is taken in the two adds
		if (isFull()) {
			System.out.println("Adding item to a full history");
		} else if (!member(element)) { // add only if the element is not a member
			// click on addElement and hit F3 to see where the call before is defined
			super.addElement(element);
//			addElement(element); // what if we called addElement without super?
		}
	}
	
	 public static void main (String[] args) {		 
    	StringDatabase aStringSet = new AStringSet();
//    	StringDatabase aStringSet = new AStringDatabase(); 
		// click on manipulateDatabase and hit F3 to see where the call before is defined
    	manipulateDatabase(aStringSet); 
    	 // what if we called manipulateDatabase with super? Is that legal in Java?
//    	super.manipulateDatabase(aStringSet);
	  }
	 
}

// Go to the definition of toString() in AStringSet.
// Comment out the current return statement and uncomment the one below.
// Set a breakpoint at the new return statement.
// Debug-Run the program again. When you stop at the break point,
// and step into (F5) the super call in the return statement.
// In which class do you land?
// Before you terminate the program, look at the variables.



