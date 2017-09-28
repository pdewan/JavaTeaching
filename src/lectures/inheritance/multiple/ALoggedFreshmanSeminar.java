package lectures.inheritance.multiple;

import lectures.inheritance.abstract_classes.FreshmanSeminar;

public class ALoggedFreshmanSeminar extends ALoggedCourse implements 
    LoggedFreshmanSeminar,
    FreshmanSeminar,
    LoggedCourse{
	
	public ALoggedFreshmanSeminar(String theTitle, String theDept) {
		super(theTitle, theDept);
	}

	public int getNumber() {
		return SEMINAR_NUMBER;
	}
}
