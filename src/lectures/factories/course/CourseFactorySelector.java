package lectures.factories.course;

import lectures.inheritance.abstract_classes.FreshmanSeminar;
import lectures.inheritance.abstract_classes.RegularCourse;

public class CourseFactorySelector {
	static CourseFactory courseFactory = new ACourseFactory();
	
	public static CourseFactory getCourseFactory() {
		return courseFactory;
	}
	public static void setCourseFactory(CourseFactory courseFactory) {
		CourseFactorySelector.courseFactory = courseFactory;
	}
	public static RegularCourse getRegularCourse(String theTitle, String theDept, int theCourseNum) {
		return courseFactory.getRegularCourse(theTitle, theDept, theCourseNum);
		
	}
	public static FreshmanSeminar getFreshmanSeminar(String theTitle, String theDept) {
		return courseFactory.getFreshmanSeminar(theTitle, theDept);		
	}
}
