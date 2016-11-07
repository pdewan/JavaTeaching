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
 * (T/F) AFreshmanSeminar and AnotherFreshmanSeminar have identical runtime behaviors.
 * 
 * Now consider the class ACourse, that both AFreshmanSeminar and ARegularCourse extended.
 * It allowed the reuse of code between the two classes the same way that the inheritance
 * hierarchy between AnotherRegularCourse and AnotherFreshmanSeminar did. However,
 * answer the following question:
 * 
 * (T/F) It makes logical sense for ARegularCourse to extend ACourse.
 * 
 * We can see the benefit of using this hierarchy rather than the previous one for reusing
 * code. Now let us think of why ACourse would be abstract. In our course scheme, is there
 * ever a course that is not either a freshman seminar or a regular course?
 * 
 * (T/F) It makes logical sense to instantiate ACourse.
 * 
 * (T/F) Abstract classes allow reuse of code while making only meaningful
 * subclass relationships and allowing only meaningful instantiations.
 */
