package lectures.arrays.collections_kinds;

import java.util.HashMap;
import java.util.Map;

import bus.uigen.ObjectEditor;
/**
 * MAPS/TABLES
 * 
 * A Map (Table) is probably the most important structured type in Java - some languages
 * have just primitive types and tables.
 * 
 * Take a look at the program and run it.
 * 
 * Then uncomment the last three statements and run the program again.
 * 
 * (T/F) The get(k) operation on a Map instance returns k, if a previous 
 * operation on the instance was put(k, v).
 * 
 * (T/F) The get(k) operation on a Map instance returns v, if a previous 
 * operation on the instance was was put(k, v), and this was the most recent
 * put that used k.
 * 
 * (T/F) The get(k) operation on a Map instance returns null if some put(k,v)
 * was not previously executed on the instance.
 * 
 * (T/F) The get(k) operation on a Map instance throws an exception if some put(k,v)
 * was not previously executed on the instance.
 * 
 * (T/F) Executing put (k, null) on a Map instance associates k with null.  
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
		
		aMap.put("Djokovic", 11); // There is a later "put" for this name. What does the first put mean?
		
		System.out.println(aMap.get("Djokovic"));
		System.out.println(aMap.get("djokovic")); // Does case matter?
		
		aMap.put("Djokovic", 12); // What does a subsequent put mean?
		System.out.println(aMap.get("Djokovic"));
		
		System.out.println(aMap);
		/*
		 * Uncomment the following statements
		 */
//		aMap.put ("me", null);
//		System.out.println (aMap.get("me"));
//		System.out.println (aMap);
	}
	
}
/*
 * Next class: JavaCollectionHierarchy
 */
