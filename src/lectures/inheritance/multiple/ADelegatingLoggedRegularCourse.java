package lectures.inheritance.multiple;

public class ADelegatingLoggedRegularCourse extends ALoggedCourse implements LoggedRegularCourse {
	int courseNum = 99;
	public ADelegatingLoggedRegularCourse (String theTitle, String theDept, int theCourseNum) {
		super (theTitle, theDept);
		courseNum = theCourseNum;
	} 
	public int getNumber() {
		return courseNum;
	}
}
