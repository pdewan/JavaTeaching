package lectures.inheritance.abstract_classes;
/*
 * Study this class and the class ACourse it extends
 */
public class ARegularCourse extends ACourse implements RegularCourse {
	
	int courseNum;
	
	public ARegularCourse (String theTitle, String theDept, int theCourseNum) {
		super (theTitle, theDept);
		courseNum = theCourseNum;
	} 
	@Override
	public int getNumber() {
		return courseNum;
	}
}
/*
 * (T/F) ARegularCourse and AnotherRegularCourse have identical runtime behaviors. 
 * 
 * (T/F) ARegularCourse is an abstract class.
 * 
 * (T/F) ACourse is an abstract class.
 * 
 * (T/F) ACourse has abstract methods.
 * 
 * (T/F) An abstract class can have constructors.
 * 
 * (T/F) It makes logical sense for ARegularCourse to extend ACourse
 * 
 * Inside ACourse, uncomment "implements Locatable" to see if any error messages
 * are generated. Then comment it back out.
 * (T/F) An abstract class can implement an interface without 
 */
/*
 * Next class: AFreshmanSeminar
 */
 