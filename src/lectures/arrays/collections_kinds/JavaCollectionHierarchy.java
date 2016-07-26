package lectures.arrays.collections_kinds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;
// Java COLLECTION HIERARCHY
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
