package lectures.factories.course;

import lectures.inheritance.abstract_classes.AFreshmanSeminar;
import lectures.inheritance.abstract_classes.ARegularCourse;
import lectures.inheritance.abstract_classes.FreshmanSeminar;
import lectures.inheritance.abstract_classes.RegularCourse;

public class ACourseFactory implements CourseFactory {
	public RegularCourse getRegularCourse(String theTitle, String theDept,
			int theCourseNum) {
		return new ARegularCourse(theTitle, theDept, theCourseNum);
	}
	public FreshmanSeminar getFreshmanSeminar(String theTitle, String theDept) {
		return new AFreshmanSeminar(theTitle, theDept);
	}
}
