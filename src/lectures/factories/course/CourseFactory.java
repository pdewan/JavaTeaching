package lectures.factories.course;

import lectures.inheritance.abstract_classes.FreshmanSeminar;
import lectures.inheritance.abstract_classes.RegularCourse;

public interface CourseFactory {
	public RegularCourse getRegularCourse(String theTitle, String theDept, int theCourseNum);
	public FreshmanSeminar getFreshmanSeminar(String theTitle, String theDept);
}
