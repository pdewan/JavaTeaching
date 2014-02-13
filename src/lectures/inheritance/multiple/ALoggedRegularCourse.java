package lectures.inheritance.multiple;

import lectures.inheritance.abstract_classes.ARegularCourse;
import lectures.inheritance.abstract_classes.RegularCourse;

public class ALoggedRegularCourse extends ALoggedCourse implements LoggedRegularCourse {
	RegularCourse regularCourse;
	public ALoggedRegularCourse (String theTitle, String theDept, int theCourseNum) {
		super (theTitle, theDept);
		regularCourse = new ARegularCourse(theTitle, theDept, theCourseNum);		
	} 
	public int getNumber() {
		return regularCourse.getNumber();
	}
}
