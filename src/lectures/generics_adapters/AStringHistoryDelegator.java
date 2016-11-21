package lectures.generics_adapters;

import java.util.ArrayList;
import java.util.List;

import lectures.arrays.collections_implementation.AStringHistory;
import lectures.inheritance.InheritingStringDatabase;
/* 
 * DELEGATION AND ADAPTATION
 *
 * We see here that the interface List and the class ArrayList are both
 * generic types.
 * 
 * Study this code.
 * 
 *
 *
 */

public class AStringHistoryDelegator implements History<String>{
	List<String> contents = new ArrayList<String>();
	public void addElement (String s) {
		contents.add (s);
	}
	public String elementAt (int index) {
		return contents.get(index); 
	}
	public int size() {
		return contents.size();
	}	
}
 	
/*
 * 
 * A class A delegates to class B if A has-a reference b to an instance of B
 * and some of its method are implemented by calling methods on B. A is called
 * the delagator and B the delegate.
 * 
 * (T/F) AStringHistoryDelagator inherits from ArrayList.
 * 
 * (T/F) AStringHistoryDelagator delegates to ArrayList.
 * 
 * A method m in class A delegates to method n in class B, if A delegates to B, 
 * m calls n.
 * 
 * (T/F) The size() method in AStringHistory delegates to the size() method in ArrayList.
 * 
 * (T/F) The addElement() method in AStringHistory delegates to the add() method in ArrayList.
 *
 * A class A is a proxy for class B if A and B have the same interface and every 
 * public method in a delegates to the a method in class B.
 * 
 * A class A is an adapter of class B is every public method in class A 
 * delegates to a method in class B.
 * 
 * (T/F) AStringHistory is a proxy for ArrayList.
 * 
 * (T/F) AStringHistory is an adapter of ArrayList.
 * 
 * 
 * Next class AStringHistoryDelegatorUser
 */
 

