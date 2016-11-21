package lectures.generics_adapters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lectures.arrays.collections_implementation.AStringHistory;
import lectures.arrays.collections_implementation.StringHistory;
/**
 * This class demonstrates some of the generic collections in Java.
 * 
 */
 
public class JavaCollectionsVariety {
	static final int EXAMPLE_INT = 0;
	static final String EXAMPLE_STRING = "0";
	
	public static void reuseAndSafe() {
		
		List<Integer> anIntegerList = new ArrayList<Integer>();
		anIntegerList.add(EXAMPLE_INT);
		Map<String, List<Integer>> aMap = new HashMap<String, List<Integer>>();
		aMap.put("my scores", anIntegerList);
	}
	
}
/*
 * (T/F) A generic has at most one type parameter.
 * 
 * (T/F) An actual parameter of a generic an itself be an elaboration of a generic.
 * 
 * Next class AStringHistoryDelegator
 */
