package lectures.inheritance.multiple;

import lectures.inheritance.abstract_classes.AFreshmanSeminar;
import lectures.inheritance.abstract_classes.FreshmanSeminar;

public class ADelegatingLoggedFreshmanSeminar extends ALoggedCourse implements LoggedFreshmanSeminar {
	FreshmanSeminar delegate;
	public ADelegatingLoggedFreshmanSeminar (String theTitle, String theDept) {
		super (theTitle, theDept);
		delegate = new AFreshmanSeminar(theTitle, theDept);
	} 
	public int getNumber() {
		return delegate.getNumber();
	}
}
