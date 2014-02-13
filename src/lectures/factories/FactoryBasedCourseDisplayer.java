package lectures.factories;

import lectures.inheritance.abstract_classes.CourseDisplayer;

public class FactoryBasedCourseDisplayer extends CourseDisplayer {

	public static void main(String[] args) {
		fillCoursesWithFactories();
		matchTitles();
	}
	protected static void fillCoursesWithFactories() {
		CourseFactory courseFactory = new ACourseFactory();
		courses.addElement(courseFactory.getRegularCourse("Intro. Prog.", "COMP", 14));
		courses.addElement(courseFactory.getRegularCourse("Found. of Prog.", "COMP", 114));
		courses.addElement(courseFactory.getFreshmanSeminar("Comp. Animation", "COMP"));
		courses.addElement(courseFactory.getFreshmanSeminar("Lego Robots", "COMP"));
	}
}
