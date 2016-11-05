package lectures.inheritance.abstract_classes;

public class AnotherRegularCourse extends ACourse implements RegularCourse {
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
