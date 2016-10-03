package lectures.arrays.collections_kinds;

import java.util.HashMap;
import java.util.Map;

import bus.uigen.ObjectEditor;
/**
 * MAPS/TABLES
 * 
 * A Map (Table) is probably the most important structured type in Java - some languages
 * have only primitive types and tables.
 * 
 * Run this program.
 * 
 * Then uncomment the last two statements run the program again.
 * 
 * (T/F) The get(k) operation on a Map instance returns k, if the (immediately) previous 
 * operation on the instance was put(k, v).
 * 
 * (T/F) The get(k) operation on a Map instance returns v, if the previous 
 * operation on the instance was was put(k, v).
 * 
 * (T/F) The get(k) operation on a Map instance returns null, if some put(k,v)
 * was not previously executed on the instance.
 * 
 * (T/F) The get(k) operation on a Map instance throws an exception, if some put(k,v)
 * was not previously executed on the instance.
 * 
 * (T/F) Executing put (k, null) on a Map instance associates k with null;  
 * 
 * (T/F) It is possible to execute put(k, v) on a Map instance if a put (k, v2)
 * was previously executed on it.
 * 
 *
 */
public class MapUser {
	public static void main (String[] args) {	
		Map aMap = new HashMap();
		aMap.put("Nadal", 14); 
		aMap.put("Federer", 17);
		aMap.put("Djokovic", 11); // What does the first put mean?
		System.out.println(aMap.get("Djokovic"));
		System.out.println(aMap.get("djokovic")); // Does case matter
		aMap.put("Djokovic", 12); // What does a subsequent put mean?
		System.out.println(aMap.get("Djokovic"));
		System.out.println(aMap);
		/*
		 * Uncomment the following statements
		 */
//		aMap.put ("me", null);
//		System.out.println (aMap.get("me"));
	}
	
}
