package praxis.arrays.collection_kinds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class CollectionKinds {
	static List names = new Vector();
	static List grandSlams = new ArrayList();
	static Map nameToGrandSlams = new HashMap();
	public static void main (String[] args) {	
		fillAndPrintLists();
		fillAndPrintTable();		
	}
	
	public static void fillAndPrintLists() {
		fillLists();
		printLists();
	}
	
	public static void fillAndPrintTable() {
		fillTable();
		printLists();
	}
	
	public static void fillLists() {

		names.add("Nadal");
		grandSlams.add(13);
		names.add("Federer");
		grandSlams.add(17);
		names.add("Sampras");
		grandSlams.add(14);
		grandSlams.set(0, 14);
	}
	
	public static void fillTable() {

		nameToGrandSlams.put("Nadal", 13);
		nameToGrandSlams.put("Federer", 17);
		nameToGrandSlams.put("Sampras", 14);
		nameToGrandSlams.put("Nadal", 14);
	}
	
	public static void printLists() {
		System.out.println("Printing lists");
		for (int index = 0; index < names.size(); index++) {
			System.out.println ("Name: " + names.get(index) + " Grand Slames:" + grandSlams.get(index));
		}
	}
	

	public static void printTable() {
		System.out.println("Printing table");

		for (Object aKey: nameToGrandSlams.keySet()) {
			System.out.println ("Name: " + aKey + " Grand Slames:" + nameToGrandSlams.get(aKey));
		}
	}

}
