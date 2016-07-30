package lectures.inheritance.abstract_classes;

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
