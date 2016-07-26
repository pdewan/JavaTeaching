package lectures.arrays.collections_kinds;

import java.util.HashMap;
import java.util.Map;

import bus.uigen.ObjectEditor;
// MAP COLLECTIONS
public class MapUser {
	public static void main (String[] args) {	
		Map aMap = new HashMap();
		aMap.put("Nadal", 14); 
		aMap.put("Federer", 17);
		aMap.put("Djokovic", 13); // What does the first put mean?
		System.out.println(aMap.get("Djokovic"));
		System.out.println(aMap.get("djokovic")); // Does case matter
		aMap.put("Djokovic", 14); // What does a subsequent put mean?
		System.out.println(aMap.get("Djokovic"));
		System.out.println(aMap);
	}
	
}
