package lectures.equals_polymorphism_overloading;

import lectures.arrays.collections_implementation.AStringHistory;
import lectures.arrays.collections_implementation.StringHistory;

public class AStringHistoryWithCustomEquals extends AStringHistory implements StringHistoryWithCustomEquals {
	
	public boolean equals(StringHistory otherStringHistory) {
		if (size != otherStringHistory.size()) 
			return false; 
		        for (int index  = 0; index < size; index++)
			if (!contents[index].equals(otherStringHistory.elementAt(index))) 
				return false;
		 return true;

	}
	public boolean equals(Object otherObject) {
		System.out.println("Equals with Object Parameter Called");
		if (!(otherObject instanceof  StringHistory)) return false;
		return equals((StringHistory) otherObject);
	}
	
	
	
}
