package lectures.equals_polymorphism_overloading;

import lectures.inheritance.BaseStringHistory;

public interface StringHistoryWithCustomEquals extends BaseStringHistory {
	
	public boolean equals(BaseStringHistory otherStringHistory);
}
