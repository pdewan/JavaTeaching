package lectures.arrays.collections_kinds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;
/*
 * Look at the code below to answer the following:
 * 
 * (T/F) An ArrayList object is an instance of a Map.
 * (T/F) An ArrayList object is an instance of a Collection.
 * (T/F) A HashSet object is an  instance of a List.
 * (T/F) A HashSet object is an  instance of a Collection.
 * (T/F) A HashMap object is an instance of a Collection.
 */
public class JavaCollectionHierarchy {
	public static void instanceOf(Object anObject) {
		System.out.println (anObject instanceof List);
		System.out.println (anObject instanceof Map);
		System.out.println (anObject instanceof Collection);

	}
	
	public static void main (String[] anArgs) {
		System.out.println("ArrayList:");
		instanceOf(new ArrayList());
		
		System.out.println("\nHashMap:");
		instanceOf(new HashMap());
		
		System.out.println("\nHashSet:");
		instanceOf(new HashSet());
	}

}
