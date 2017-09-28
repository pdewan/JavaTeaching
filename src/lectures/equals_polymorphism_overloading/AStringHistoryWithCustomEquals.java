package lectures.equals_polymorphism_overloading;
import lectures.inheritance.ABaseStringHistory;
import lectures.inheritance.BaseStringHistory;;

public class AStringHistoryWithCustomEquals extends ABaseStringHistory implements StringHistoryWithCustomEquals {
	
	public boolean equals(BaseStringHistory otherStringHistory) {
		if (size != otherStringHistory.size()) 
			return false; 
		        for (int index  = 0; index < size; index++)
			if (!contents[index].equals(otherStringHistory.elementAt(index))) 
				return false;
		 return true;

	}
	public boolean equals(Object otherObject) {
		System.out.println("Equals with Object Parameter Called");
		if (!(otherObject instanceof  BaseStringHistory)) return false;
		return equals((BaseStringHistory) otherObject);
	}
	
	
	
}
