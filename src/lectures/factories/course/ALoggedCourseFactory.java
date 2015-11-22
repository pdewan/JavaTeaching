package lectures.factories.course;

import lectures.inheritance.multiple.ALoggedFreshmanSeminar;
import lectures.inheritance.multiple.ALoggedRegularCourse;
import lectures.inheritance.multiple.LoggedFreshmanSeminar;
import lectures.inheritance.multiple.LoggedRegularCourse;

public class ALoggedCourseFactory implements CourseFactory {
	public LoggedRegularCourse getRegularCourse(String theTitle, String theDept,
			int theCourseNum) {
		return new ALoggedRegularCourse(theTitle, theDept, theCourseNum);
	}
	public LoggedFreshmanSeminar getFreshmanSeminar(String theTitle, String theDept) {
		return new ALoggedFreshmanSeminar(theTitle, theDept);
	}
}
