package lectures.extra;

import lectures.inheritance.abstract_classes.ACourse;
import lectures.inheritance.abstract_classes.FreshmanSeminar;

public class ADelegatingFreshmanSeminar extends ACourse implements FreshmanSeminar {
	
	public ADelegatingFreshmanSeminar (String theTitle, String theDept) {
		super (theTitle, theDept);
		title = theTitle;
	}
	@Override
	public int getNumber() {
		return SEMINAR_NUMBER;
	}	
}
