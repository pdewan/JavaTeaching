package lectures.equals_polymorphism_overloading;

import lectures.arrays.collections_implementation.StringHistory;

public interface StringHistoryWithCustomEquals extends StringHistory {
	
	public boolean equals(StringHistory otherStringHistory);
}
