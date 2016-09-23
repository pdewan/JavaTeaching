package lectures.equals_polymorphism_overloading;

import lectures.inheritance.BaseStringHistory;
import lectures.inheritance.AnInheritingStringDatabase;
import lectures.inheritance.AnInheritingStringSet;

public class PolymorphismAndOverloading {

	static void print(BaseStringHistory strings) {
		System.out.println("******************");
		for (int elementNum = 0; elementNum < strings.size(); elementNum++)
			System.out.println(strings.elementAt(elementNum));
	}
	static void useOfPolymorphism() {
		print(new AStringHistoryWithCustomEquals());
		print(new AnInheritingStringDatabase());
	}
	static void useOfOverloading() {
		System.out.print(5);
		System.out.print(5.0);
	}
	static public boolean equals(BaseStringHistory stringHistory1,
			Object stringHistory2) {
		return false;
	}
	static public boolean equals(Object stringHistory1,
			BaseStringHistory stringHistory2) {
		return false;
	}
	static public boolean equals(BaseStringHistory stringHistory1,
			BaseStringHistory stringHistory2) {
		return false;
	}
	// adding this method causes compile error
//	public boolean equals (Point point1, Point point2) {
//		return false;
//	}

	
	static  public void main(String[] args) {
		equals(new AnInheritingStringSet(), new AnInheritingStringSet());
		equals(null, null);
		equals ((BaseStringHistory) null, (BaseStringHistory) null);
	}

}
