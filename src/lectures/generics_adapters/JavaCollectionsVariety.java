package lectures.generics_adapters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lectures.arrays.collections_implementation.AStringHistory;
import lectures.arrays.collections_implementation.StringHistory;
/*
 GENERICS
 
Java Collection types, like our History types, are generic.
Uncomment the code below to see errors that by now should be obvious to you.
 
 
 */
public class JavaCollectionsVariety {
	static final int EXAMPLE_INT = 0;
	static final String EXAMPLE_STRING = "0";
	
	public static void reuseAndSafe() {
		
		List<Integer> anIntegerList = new ArrayList<Integer>();
		anIntegerList.add(EXAMPLE_INT);
		Map<String, List<Integer>> aMap = new HashMap<String, List<Integer>>();
		aMap.put("my scores", anIntegerList);
		/*
		 Should you get compile errors? Do you?
		 */
//		anIntegerList.add("0");
//		aMap.put("his scores", new ArrayList<String>());

		

	}
	
}
