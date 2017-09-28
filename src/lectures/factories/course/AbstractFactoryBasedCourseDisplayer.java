package lectures.factories.course;

import lectures.inheritance.abstract_classes.ACourseDisplayer2;

public class AbstractFactoryBasedCourseDisplayer extends ACourseDisplayer2 {

	
	public void fillCourses() {
		courses.addElement(CourseFactorySelector.getRegularCourse("Intro. Prog.", "COMP", 14));
		courses.addElement(CourseFactorySelector.getRegularCourse("Found. of Prog.", "COMP", 114));
		courses.addElement(CourseFactorySelector.getFreshmanSeminar("Comp. Animation", "COMP"));
		courses.addElement(CourseFactorySelector.getFreshmanSeminar("Lego Robots", "COMP"));
	}
}
