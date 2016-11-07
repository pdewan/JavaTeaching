package lectures.inheritance.abstract_classes;
/*
 * Study this class and the class it extends and answer the questions below
 */
public class AnotherRegularCourse extends AnotherFreshmanSeminar implements RegularCourse {
	
	int courseNum;
	
	public AnotherRegularCourse (String theTitle, String theDept, int theCourseNum) {
		super (theTitle, theDept);
		courseNum = theCourseNum;
	} 
	@Override
	public int getNumber() {
		return courseNum;
	}
}
/*
 * (T/F) AnotherFreshmanSeminar has three (direct + inherited) instance variables.
 * 
 * (T/F) AnotherRegularCourse has three (direct + inherited) instance variables.
 * 
 * (T/F) An instance of AnotherFreshmanSeminar takes less space in memory
 * than an instance of AnotherRegularCourse.
 * 
 * (T/F) getNumber() in AnotherFreshmanSeminar returns the value of a named constant.
 * 
 * (T/F) getNumber() in AnotherRegularCourse returns the value of a named constant.
 * 
 * (T/F) AnotherRegularCourse reuses part of the code in AnotherFreshmanSeminar.
 * 
 * (T/F) It makes logical sense of AnotherRegularCourse to be a subclass of 
 * AnotherFreshmanSeminar.
 * 
 * (T/F) AnotherRegularCourse is an abstract class.
 * 
 * (T/F) AnotherFreshmanSeminar is an abstract class.
 * 
 * In class AnotherFreshmanSeminar, find the declaration of SEMINAR_NUMBER
 * 
 * (T/F) An interface can declare a public named constant.
 * 
 */
/*
 * Next class: ARegularCourse
 */
