package lectures.inheritance.abstract_classes;

public class ARegularCourse extends ACourse implements RegularCourse {
	//String title;
	int courseNum = 99;
	public ARegularCourse (String theTitle, String theDept, int theCourseNum) {
		super (theTitle, theDept);
//		title = theTitle;
		courseNum = theCourseNum;
	} 
	@Override
	public int getNumber() {
		return courseNum;
	}
	
//	public  void init (String theTitle, String theDept, int theCourseNum) {
//		super.init(theTitle, theDept);
//		courseNum = theCourseNum;
//	} 

	
}
