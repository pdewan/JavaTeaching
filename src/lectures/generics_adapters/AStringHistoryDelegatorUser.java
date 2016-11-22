package lectures.generics_adapters;

import java.util.ArrayList;
import java.util.List;

import lectures.arrays.collections_implementation.AStringHistory;
import lectures.inheritance.InheritingStringDatabase;
/**
 * This class better illustrates the concept of least privilege.
 * 
 * It shows how a history can be modeled by ArrayList directly or by 
 * AStringHistoryDelegator
 *
 * Answer the questions below.
 */

public class AStringHistoryDelegatorUser {
	

	final static String EXAMPLE_STRING = "0";
	
	public static void useListDirectly() {
		List<String> aStringHistory = new ArrayList<String>();
		aStringHistory.add(EXAMPLE_STRING);
		/*
		 * Uncomment the following when asked
		 */
//		aStringHistory.remove("EXAMPLE_STRING");
	}
	
	public static void useHistory() {
		History<String> aStringHistory = new AStringHistoryDelegator();
		aStringHistory.addElement(EXAMPLE_STRING);
		/*
		 * Uncomment the following when asked
		 */
//		aStringHistory.removeElement(EXAMPLE_STRING));
	}
	
	public static void main(String[] args){
		useListDirectly();
		useHistory();
	}
}
 	
/*
 * Recall that the least privilege principle says that the users of an object should
 * not be able to perform unauthorized operations - operations not needed to their tasks.
 * 
 * Recall that a history is a collection from which elements cannot be removed.
 * 
 * Uncomment the line in useListDirectly.
 * 
 * (Multiple choice) Removing an element from aStringHistory in useListDirectly leads to a:
 * (a) compile-time error.
 * (b) runtime error.
 * (c) successful violation of least privilege principle.
 * (d) none of the above.
 * 
 * (Multiple choice) Removing an element from aStringHistory in useHistory leads to a:
 * (a) compile-time error.
 * (b) runtime error.
 * (c) successful violation of least principle.
 * (d) none of the above.
 * 
 * (T/F) Adapting a class rather than using it directly can reduce least privilege violations.
 * 
 * AStringHistory is an adapter of ArrayList.
 * 
 * The limitation of operations on a class is one common use of adapters and delegation.
 * 
 * Another way that adapters in can be useful is in cases where code might expect particular
 * naming and parameters of methods in a class, but the class (not written by us) uses different
 * naming. We can write methods in a form that we find useful that simply pass on the work to 
 * the delegate. 
 * 
 * Why would a proxy ever be useful, if it has the same names and methods (since it implements
 * the same interface)? Proxies are used in more specialized situations where they tweak how we
 * interact with a class. For example they might restrict access to the delegate object based
 * on access rights, or help the code use the delegate object by forwarding it requests if it
 * is actually connected over a network.
 */

