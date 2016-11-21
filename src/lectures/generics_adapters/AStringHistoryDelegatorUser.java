package lectures.generics_adapters;

import java.util.ArrayList;
import java.util.List;

import lectures.arrays.collections_implementation.AStringHistory;
import lectures.inheritance.InheritingStringDatabase;
/**
 * This class better illustrates least privilege.
 * 
 * It shows how a history can be modeled by ArrayList directly or by 
 * AStringHistoryDelegator
 *
 */

public class AStringHistoryDelegatorUser {
	

	final static String EXAMPLE_STRING = "0";
	public static void useListDirectly() {
		List<String> aStringHistory = new ArrayList<String>();
		aStringHistory.add(EXAMPLE_STRING);
		/*
		 * Uncomment the following when asked
		 */
//		aStringHistory.remove("0");
	}
	public static void useHistory() {
		History<String> aStringHistory = new AStringHistoryDelegator();
		aStringHistory.addElement(EXAMPLE_STRING);
		/*
		 * Uncomment the following when asked
		 */
//		aStringHistory.removeElement(EXAMPLE_STRING));
	}
}
 	
/*
 * Recall that the least principle says that the users of an object should not be 
 * able to perform unauthorized operations - operations not needed to their tasks.
 * 
 * Uncomment the line in useListDirectly.
 * 
 * (Multiple choice) Removing an element from aStringHistory in useListDirectly leads to a:
 * (a) a compiler error.
 * (b) a runtime error;
 * (c) violation of least principle.
 * (d) none of the above
 * 
 * (Multiple choice) Removing an element from aStringHistory in useHistory leads to a:
 * (a) a compiler error.
 * (b) a runtime error;
 * (c) violation of least principle.
 * (d) none of the above 
 * 
 * (T/F) Adapting a class rather than using it directly can reduce least privilege violations
 */

