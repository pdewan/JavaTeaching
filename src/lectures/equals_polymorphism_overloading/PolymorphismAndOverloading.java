package lectures.equals_polymorphism_overloading;

import lectures.arrays.collections_implementation.StringHistory;
import lectures.inheritance.AStringDatabase;
import lectures.inheritance.AStringSet;

public class PolymorphismAndOverloading {

	static void print(StringHistory strings) {
		System.out.println("******************");
		for (int elementNum = 0; elementNum < strings.size(); elementNum++)
			System.out.println(strings.elementAt(elementNum));
	}
	static void useOfPolymorphism() {
		print(new AStringHistoryWithCustomEquals());
		print(new AStringDatabase());
	}
	static void useOfOverloading() {
		System.out.print(5);
		System.out.print(5.0);
	}
	static public boolean equals(StringHistory stringHistory1,
			Object stringHistory2) {
		return false;
	}
	static public boolean equals(Object stringHistory1,
			StringHistory stringHistory2) {
		return false;
	}
	static public boolean equals(StringHistory stringHistory1,
			StringHistory stringHistory2) {
		return false;
	}
	// adding this method causes compile error
//	public boolean equals (Point point1, Point point2) {
//		return false;
//	}

	
	static  public void main(String[] args) {
		equals(new AStringSet(), new AStringSet());
		equals(null, null);
		equals ((StringHistory) null, (StringHistory) null);
	}

}
