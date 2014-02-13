package lectures.arrays.collections_kinds;

import java.util.HashMap;
import java.util.Map;

import bus.uigen.ObjectEditor;

public class MapUser {
	public static void main (String[] args) {	
		Map aMap = new HashMap();
		aMap.put("Borg", 11);
		aMap.put("Nadal", 11);
		aMap.put("Federer", 17);
		aMap.put("Sampras", 14);
		System.out.println(aMap.get("Nadal"));
		System.out.println(aMap.get("nadal"));
		aMap.put("Nadal", 11);
		System.out.println(aMap.get("Nadal"));
		System.out.println(aMap);
		ObjectEditor.edit(aMap);
	}
}
