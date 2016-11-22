package lectures.generics_adapters;

import java.util.ArrayList;
import java.util.List;

import lectures.graphics.Point;

/**
 * An example of a generic class.
 *   
 *   
 * The formal parameter T that this class declares is used as an actual parameter
 * (argument) to the generic History interface. In other words, AHistory says "Given 
 * that I named the type with which I am elaborated T, I will implement History 
 * elaborated with T."
 * 
 * So if it is elaborated with String, AHistory implements the elaboration, History<String>
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
		
		/*
		 * Swap the two lines below when asked.
		 */
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
		 * Uncomment the following when asked
		 */
//		element.charAt(0);
//		element.toString();
		
	} 	
}
/*
 * (T/F) The element type of AHistory (that is the type of elements that can be
 *  added to and retrieved from instance of the the class)  is T.
 * 
 * Swap the two elaborations of History.
 * What happens?
 * 
 * (T/F) A generic can be elaborated with parameter P in some type (class or 
 * interface) C only if P is a literal type or P is a type parameter declared
 * by C.
 * 
 * Swap the two declarations of the array.
 * 
 * What happens?
 * 
 * (T/F) An array can be of a generic type.
 * 
 * (T/F) Regardless of the type (e.g. Point, String) used to elaborate AHistory, 
 * the contents array will hold values of type Object. 
 * 
 * 
 * Swap the two return statements in elementAt.
 * 
 * What happens?
 * 
 * (T/F) If T is a type parameter, then a value of type Object can be automatically
 * converted to a a value of type T.
 * 
 * (T/F) If T is a type parameter, then a value of type Object can be converted to
 * a value of type T with cast. 
 * 
 * Uncomment the String and Object operations in addElement(). Notice that "element"
 * is of type T.
 * 
 * What happens?
 * 
 * If T is a type parameter, then it is possible to invoke on a value of type T:
 * (a) no operation.
 * (b) any operation defined by class Object.
 * (c) any operation defined by a predefined type.
 * (c) any operation defined by a predefined or programmer-defined type.
 * 
 * Go back to GenericHistoryUser
 * 
 */