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
 * A class A delegates to class B if A has-a B (A has a reference to an
 * instance of B) and some of A's methods are implemented by calling methods
 * on B. A is called the delegator and B is called the delegate.
 * 
 * (T/F) AStringHistoryDelegator inherits from ArrayList.
 * 
 * (T/F) AStringHistoryDelegator delegates to ArrayList.
 * 
 * A method m in class A delegates to method n in class B if A delegates to B and
 * m calls n.
 * 
 * (T/F) The size() method in AStringHistory delegates to the size() method in ArrayList.
 * 
 * (T/F) The addElement() method in AStringHistory delegates to the add() method in ArrayList.
 *
 *
 * A delegator class A is a proxy for a delegate class B if A and B have the same interface and every 
 * public method in A delegates to a method in class B.
 *  
 * A delegator class A is an adapter of delegate class B if every public method in class A delegates to
 * a method in class B. The delagate class, B, is called the adapted class.
 * 
 * 
 * Thus, a proxy is a more specific form of an adapter.
 * 
 * It is possible to create proxies using inheritance by overriding the inherited
 * methods and making super calls. As an adapter can change the interface provided
 * by the adapted class, it is not always possible to create an adapter using
 * inheritance.
 * 
 * (T/F) AStringHistory is a proxy for ArrayList.
 * 
 * (T/F) AStringHistory is an adapter of ArrayList.
 * 
 * In the next class that you will visit, you will see one reason that we use delegation.
 *  
 * Next class AStringHistoryDelegatorUser
 */
 

