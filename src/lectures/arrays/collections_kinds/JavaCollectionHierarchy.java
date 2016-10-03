package lectures.arrays.collections_kinds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;
/*
 * Look at the code below
 * 
 * (T/F) An ArrayList is an instance of a Map.
 * (T/F) An ArrayList is an instance of a Collection.
 * (T/F) A HashSet is an  instance of a List.
 * (T/F) A HashSet is an  instance of a Collection.
 * (T/F) A HashMap is an instance of a Collection
 */
public class JavaCollectionHierarchy {
	public static void instanceOf(Object anObject) {
		System.out.println (anObject instanceof List);
		System.out.println (anObject instanceof Map);
		System.out.println (anObject instanceof Collection);

	}
	
	public static void main (String[] anArgs) {
		instanceOf(new ArrayList());
		instanceOf(new HashMap());
		instanceOf(new HashSet());
	}

}
