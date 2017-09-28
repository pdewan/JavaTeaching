package praxis.inheritance;

import bus.uigen.ObjectEditor;
import lectures.arrays.collections_implementation.AStringHistory;
import lectures.arrays.collections_implementation.StringHistory;


public class APraxisStringSet extends APraxisStringDatabase implements PraxisStringSet  {
//	public APraxisStringSet() {
//    }
//	public APraxisStringSet () {
//		super("Jane Doe");
//	}
	
	// uncomment this
//	protected int size = 0;
	public void add(String element) {
//		System.out.println ("Calling addElement and size =" + size);
//		if (size == MAX_SIZE)
		if (size == AStringHistory.MAX_SIZE) {
			System.out.println("Adding item to a full history");
		} else if (!member(element)) {
			System.out.println ("calling super addElement");
			super.add(element);
		}
	}
	
}
