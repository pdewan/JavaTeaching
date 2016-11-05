package lectures.factories.course;

import lectures.inheritance.abstract_classes.ACourseDisplayer2;
import lectures.inheritance.abstract_classes.CourseDisplayer;

public class FactoryBasedParsingCourseDisplayer extends ACourseDisplayer2 {
	
	public void fillCourses() {
        System.out.println("Please enter course info, terminating with a period:");
        courses = (new AnAbstractFactoryBasedCourseParser()).parseCourseList();
    }	
	protected static CourseDisplayer createCourseDisplayer() {
    	return new FactoryBasedParsingCourseDisplayer();
    }
	public static void main(String[] args) {
		CourseDisplayer aCourseDisplayer = createCourseDisplayer();
		aCourseDisplayer.fillCourses();
		aCourseDisplayer.matchTitles();
	}
}
