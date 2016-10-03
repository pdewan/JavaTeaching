package lectures.arrays.collections_kinds;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
/*
 * LIST COLLECTIONS
 * 
 * Here we see examples of Java lists. 
 * 
 * These types inspired the string history, database and set we saw earlier.
 * 
 * Study the program.
 * 
 * We see the use of two different classes, Vector and ArrayList.
 * 
 * 
 * Can we interchange the two, make names an ArrayList and grandSlams a 
 * Vector without getting compile errors?
 * 
 * Play with the comments if you do not know the answer.
 * 
 * (T/F) The class ArrayList IS-A List
 * (T/F) The class Vector IS-A List.
 * (T/F) If all variables are typed using interfaces, then the classes ArrayList
 * and Vector are interchangeable.
 *  
 */

public class VectorArrayListUser {
	public static void main (String[] args) {	
		
		List names = new Vector();
		List grandSlams = new ArrayList();
		
//		List names = new ArrayList();
//		List grandSlams = new Vector();
		
		
		names.add("Nadal");
	
		grandSlams.add(14);
		
		names.add("Federer");
		grandSlams.add(17);
		names.add("Djokovic");
		/*
		 * Put break point below
		 */
		grandSlams.add(12);
		
		
		
	}
/*
 * WRAPPER TYPES
 * 
 * WRAPPER TYPES
 * What do you think is the type of the parameters of add in grandSlams.add(4)?
 * 
 * Does it make sense to assign a primitive value and a String to the same 
 * parameter?
 * 
 * Put a break point on the last add. 
 * 
 * Use F5 to step into the add. You do not go to the
 * add directly? 
 * 
 * Where do you go? 
 * 
 * if you can see the source, what does the last return statement in that 
 * method return?
 * 
 * What is the return type of the method?
 * 
 * Press F7 to return and then press F5 again. 
 * 
 * If you can see the source of ArrayList:
 * 
 * 1. Now you are in the add.
 * 
 * 2. Look at the variable arg0 in the debug window and see its type and value.
 * Can you figure out what is going on? Can you see why this type is called a 
 * wrapper for primitives?
 * 
 * (T/F) Java can automatically convert a primitive value to an object.
 * 
 * (T/F) Java can automatically convert a value of type int to a value of type
 * Integer.
 */
	
/*
 * What are we trying to do this program? 
 * 
 * Do you know of another Java type
 * that can keep this association better?
 * 
 * Go to MapUser
 * 
*/

}
