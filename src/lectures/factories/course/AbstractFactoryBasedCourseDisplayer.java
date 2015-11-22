package lectures.factories.course;

import lectures.inheritance.abstract_classes.CourseDisplayer;

public class AbstractFactoryBasedCourseDisplayer extends CourseDisplayer {

	public static void main(String[] args) {
		fillCoursesWithFactories();
		matchTitles();
	}
	protected static void fillCoursesWithFactories() {
		courses.addElement(CourseFactorySelector.getRegularCourse("Intro. Prog.", "COMP", 14));
		courses.addElement(CourseFactorySelector.getRegularCourse("Found. of Prog.", "COMP", 114));
		courses.addElement(CourseFactorySelector.getFreshmanSeminar("Comp. Animation", "COMP"));
		courses.addElement(CourseFactorySelector.getFreshmanSeminar("Lego Robots", "COMP"));
	}
}
