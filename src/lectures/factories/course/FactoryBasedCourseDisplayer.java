package lectures.factories.course;

import lectures.inheritance.abstract_classes.ACourseDisplayer2;
import lectures.inheritance.abstract_classes.CourseDisplayer;

public class FactoryBasedCourseDisplayer extends ACourseDisplayer2 {

	
   protected static CourseDisplayer createCourseDisplayer() {
    	return new FactoryBasedCourseDisplayer();
    }
	public static void main(String[] args) {
		CourseDisplayer aCourseDisplayer = createCourseDisplayer();
		aCourseDisplayer.fillCourses();
		aCourseDisplayer.matchTitles();
	}
	public  void fillCourses() {
		CourseFactory courseFactory = new ACourseFactory();
		courses.addElement(courseFactory.getRegularCourse("Intro. Prog.", "COMP", 14));
		courses.addElement(courseFactory.getRegularCourse("Found. of Prog.", "COMP", 114));
		courses.addElement(courseFactory.getFreshmanSeminar("Comp. Animation", "COMP"));
		courses.addElement(courseFactory.getFreshmanSeminar("Lego Robots", "COMP"));
	}
}
