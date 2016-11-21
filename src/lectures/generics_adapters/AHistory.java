package lectures.generics_adapters;

import java.util.ArrayList;
import java.util.List;

import lectures.graphics.Point;

/**
 * An example of a generic class.
 *   
 * The formal parameter T this class defines is used as an actual parameter to the 
 * generic History.
 * 
 * So if it is elaborated with String, it implements the elaboration, History<String>
 * 
 * (T/F) The class AHistory implements a generic.
 * 
 * (T/F) The class AHistory elaborates a generic.
 */


public class AHistory<T> implements 
	/*
	 * Swap the two lines below when asked
	 */
	History<T> {	
//	History<T2> {
	public static final int MAX_SIZE = 50;
	/*
	 * Swap the two lines below when asked.
	 */

	Object[] contents = new Object[MAX_SIZE]; 
//	Object[] contents = new T[MAX_SIZE];
	int size = 0;
	public int size() {return size;	}	
	public T elementAt (int index) {
		return (T) contents[index]; 
//		return contents[index];

	}
	boolean isFull() {return size == MAX_SIZE;	}

	public void addElement(T element) {
		if (isFull()) {
			System.out.println("Adding item to a full history");
		} else {
			contents[size] = element;
			size++;
		}
		/*
		 * Comment out the following when asked
		 */
//		element.charAt(0);
//		element.toString();
		
	} 	
}
/*
 
 * 
 * Swap the two elaborations of History.
 * What happens?
 * 
 * (multiple choice) A generic can be elaboarte with parameter P in some type 
 * (class or interface) C if:
 * 
 * (a) P is a literal (actual) type.
 * 
 * (b) P is a type parameter defined by C
 * 
 * (b) P is some arbitrary identifier.
 * 
 * 
 * Swap the two declarations of the array.
 * 
 * What happens?
 * 
 * (T/F) An array is a generic type.
 * 
 * (T/F) Regardless of the type (e.g. Point, String) used to elaborate AHistory , 
 * contents will hold values of type Object. 
 * 
 * 
 * Swap the two return statements in elementAt.
 * 
 * What happens?
 * 
 * (T/F) If T is a type parameter, then a value of type Object can be automatically
 * converted to a a value of type T.
 * 
 * (T/F) If T is a type parameter, then a value of type Object can be automatically
 * converted to a a value of type T with cast. 
 * 
 * Comment out the String and Object operationd in addElement()
 * 
 * What happens?
 * 
 * If T is a type parameter, then it is possible to invoke on a value of type T:
 * (a) no operation,
 * (b) any operation defined by class Object.
 * (c) any operation defined by a predefined type.
 * (c) any operation defined by a predefined or programmer defined type.
 * 
 * Go back to GenericHistoryUser
 * 
 * Next class AGenericConsoleView
 * 
 */