package lectures.factories.course;

import lectures.inheritance.abstract_classes.CourseDisplayer;

public class FactoryBasedParsingCourseDisplayer extends CourseDisplayer {

	public static void main(String[] args) {
		fillCoursesInteractively();
		matchTitles();
	}
	static void fillCoursesInteractively() {
        System.out.println("Please enter course info, terminating with a period:");
        courses = (new AnAbstractFactoryBasedCourseParser()).parseCourseList();
   }	
}
