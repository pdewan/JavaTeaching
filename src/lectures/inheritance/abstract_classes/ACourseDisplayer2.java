package lectures.inheritance.abstract_classes;

import java.util.Scanner;

import lectures.inheritance.abstract_classes.courselist.ACourseList;
import lectures.inheritance.abstract_classes.courselist.CourseList;
import util.misc.Console;


public class ACourseDisplayer2 extends ACourseDisplayer  {
	protected CourseList courses = new ACourseList();
	Scanner scanner = new Scanner(System.in);
	

	
	
	protected RegularCourse createRegularCourse(String theTitle, String theDept, int theCourseNum) {
		return new AnotherRegularCourse(theTitle, theDept, theCourseNum);
	}
	protected FreshmanSeminar createFreshmanSeminar(String theTitle, String theDept) {
		return new AnotherFreshmanSeminar(theTitle, theDept);
	}

	
    protected static CourseDisplayer createCourseDisplayer() {
    	return new ACourseDisplayer2();
    }
	public static void main(String[] args) {
		CourseDisplayer aCourseDisplayer = createCourseDisplayer();
		aCourseDisplayer.fillCourses();
		aCourseDisplayer.matchTitles();
	}
}
