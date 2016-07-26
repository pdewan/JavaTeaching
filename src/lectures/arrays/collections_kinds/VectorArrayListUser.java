package lectures.arrays.collections_kinds;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
//LIST COLLECTIONS
// Demonstrates some Java types that insipired StringHistory and other collection classes
public class VectorArrayListUser {
	public static void main (String[] args) {	
		// can we interchange the two, make names an ArrayList and grandSlams a Vector
		List names = new Vector(); // => Vector IS-A List
		List grandSlams = new ArrayList(); //=> ArrayList IS-A List
		// What are we trying to do below? Do you know of another Java type
		// that can keep this association better?
		names.add("Nadal");
		grandSlams.add(14);
		
		names.add("Federer");
		grandSlams.add(17);
		names.add("Djokovic");
		grandSlams.add(12);
		// Grand slam trophies on the wall, who is the greatest of them all?
		
		// WRAPPER TYPES
		// What do you think is the type of the parameters of add?
		// Does it make sense to assign a primitive value and a String to the same parameter?
		// Put a break point on the last add. Use f5 to step into the add. You do not go to the
		// add directly? Where do you go? What does the last return statement in that method return?
		// What is the return type of the method?
		// Press F7 to return and then press F5 again. Now you are in the add.
		// Look at the variable arg0 in the debug window and see its type and value.
		// Can you figure out what is going on? Can you see why this type is called a wrapper
		// for primitives?
		
	}

}
