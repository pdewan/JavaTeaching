package lectures.inheritance.abstract_classes;

public class AFreshmanSeminar extends ACourse implements FreshmanSeminar {
	
	public AFreshmanSeminar (String theTitle, String theDept) {
		super (theTitle, theDept);
	}
	@Override
	public int getNumber() {
		return SEMINAR_NUMBER; 
	}	
}
/*
 * (T/F) AFreshmanSeminar and AnotherFreshmanSeminar have identical runtime behaviors. *  
 * 
 * (T/F) It makes logical sense for ARegularCourse to extend ACourse
 * 
 * (T/F) It makes logical sense to instantiate ACourse
 * 
 * (T/F) Abstract classes allow reuse of code while making only meaningful
 * subclass relationships
 */
