package lectures.inheritance.multiple;

import lectures.inheritance.abstract_classes.ACourse;

public abstract class ALoggedCourse extends ACourse {
	int numberOfQueries = 0;
	public ALoggedCourse (String theTitle, String theDept) {
		super (theTitle, theDept);		
	}
	public String getTitle() {
		String retVal = super.getTitle();
		numberOfQueries++;
		return retVal;
	}
	public int getNumberOfQueries() {
		return numberOfQueries;
	}
}
