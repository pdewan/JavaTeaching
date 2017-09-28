package lectures.generics_adapters;

import lectures.arrays.collections_implementation.AStringHistory;
import lectures.arrays.collections_implementation.StringHistory;
import lectures.generics_adapters.extra.AnIntegerHistory;
import lectures.generics_adapters.extra.IntegerHistory;
/*
 GENERICS
 Look at the three different static methods presented here, all
 trying to do the same job, in different ways.
 
 Look at the classes AStringHistory and AnIntegerHistory.
 How would you characterize the difference between them.
 
 Look at the class AnObjectHistory. Given this class, do you need
 AStringHistory and AnIntegeHistory. That is the question the second 
 method below is trying to answer.
 
 Can we have the best of both worlds? That is what the third method answers.
 It uses the new concept of generics. 
 
 Run the main program and look at the boolean value printed.
 
 Now uncomment the code in each of the three methods.
 Understand the compile-time error messages.
 Comment back the code that gives these messages and run the program.
 Study the runtime messages.
 Is it better to get compile-time or runtime messages?
 
 Go to the interface History. Does the term type parameter make sense for the type symbol used there?
 Is it like a method parameter?
 
 Now go to the class AHistory and study the code and the comments.
 
 
 */
public class HistoryVariety {
	static final int EXAMPLE_INT = 0;
	static final String EXAMPLE_STRING = "0";
	public static void duplicateButSafe() {
		/*
		 Use anIntegerHistory correctly
		 */
		IntegerHistory anIntegerHistory = new AnIntegerHistory();
		anIntegerHistory.addElement(EXAMPLE_INT);
		Integer anInteger = anIntegerHistory.elementAt(0);
		
		/*
		 Use aStringHistory correctly
		 */
		StringHistory aStringHistory = new AStringHistory();
		aStringHistory.addElement(EXAMPLE_STRING);
		String aString = aStringHistory.elementAt(0);
		/*
		 Are these classes the same at runtime?
		 */
		System.out.println(aStringHistory.getClass().equals(anIntegerHistory.getClass()));
		/*
		 Try cheating - cast element to wrong type and mix integers and strings and 	 
		 Are these errors caught at compile time or runtime?
		 */
//		aStringHistory.addElement(anInteger);
//		anIntegerHistory.addElement(aString);
//		anInteger = (Integer) aStringHistory.elementAt(0);
//		aString = (String) anIntegerHistory.elementAt(0);
	}
	public static void reuseButUnsafe() {
		/*
		 Use anIntegerHistory correctly
		 */
		ObjectHistory anIntegerHistory = new AnObjectHistory();
		anIntegerHistory.addElement(EXAMPLE_INT);
		/*
		 Must cast even in correct usage
		 */
		Integer anInteger = (Integer) anIntegerHistory.elementAt(0);
		
		/*
		 Use aStringHistory correctly
		 */
		ObjectHistory aStringHistory = new AnObjectHistory();
		aStringHistory.addElement(EXAMPLE_STRING);
		/*
		 Must cast even in correct usage
		 */
		String aString = (String) aStringHistory.elementAt(0);
		
		/*
		 Are these classes the same at runtime?
		 */
		System.out.println(aStringHistory.getClass().equals(anIntegerHistory.getClass()));
		
		/*
		 Try cheating - cast element to wrong type and mix integers and strings and 	 
		 Are these errors caught at compile time or runtime?
		 */
//		anInteger = (Integer) aStringHistory.elementAt(0);
//		aString = (String) anIntegerHistory.elementAt(0);
//		aStringHistory.addElement(anInteger);
//		anIntegerHistory.addElement(aString);

	}
	public static void reuseAndSafe() {
		/*
		 Use anIntegerHistory correctly
		 Elaborate History and AHistory with Integer parameter
		 */
		History<Integer> anIntegerHistory = new AHistory<Integer>();
		anIntegerHistory.addElement(EXAMPLE_INT);
		/*
		 No need to cast
		 */
		Integer anInteger = anIntegerHistory.elementAt(0);
		
		/*
		 Use aStringHistory correctly
		 Elaborate History and AHistory with Integer parameters
		 */
		History<String>  aStringHistory = new AHistory<String>();
		aStringHistory.addElement(EXAMPLE_STRING);
		/*
		 No need to cast
		 */
		String aString = aStringHistory.elementAt(0);
		
		/*
		 Are these classes the same at runtime?
		 */
		System.out.println(aStringHistory.getClass().equals(anIntegerHistory.getClass()));
		

		/*
		 Try cheating - is this caught at compile time or runtime?
		 */
//		anInteger = (Integer) aStringHistory.elementAt(0);
//		aString = (String) anIntegerHistory.elementAt(0);
//		aStringHistory.addElement(anInteger);
//		anIntegerHistory.addElement(aString);

	}
	public static void main(String[] args) {
		duplicateButSafe();
		reuseButUnsafe();
		reuseAndSafe();
	}
}
