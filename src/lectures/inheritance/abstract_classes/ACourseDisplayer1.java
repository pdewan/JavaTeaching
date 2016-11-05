package lectures.inheritance.abstract_classes;

import java.util.Scanner;

import lectures.inheritance.abstract_classes.courselist.ACourseList;
import lectures.inheritance.abstract_classes.courselist.CourseList;
import util.misc.Console;
/**
 * 
 * Study this interactive program. 
 * 
 * Run it.
 *
 * Enter two course-title lines and then a .: 
 * "Intro. Prog."
 * "Meaning of Life"
 * "."
 * 
 * Answer the questions below.
 */

public class ACourseDisplayer1 extends ACourseDisplayer  {
	
	protected RegularCourse createRegularCourse(String theTitle, String theDept, int theCourseNum) {
		return new AnotherRegularCourse(theTitle, theDept, theCourseNum);
	}
	protected FreshmanSeminar createFreshmanSeminar(String theTitle, String theDept) {
		return new AnotherFreshmanSeminar(theTitle, theDept);
	}
	
    protected static CourseDisplayer createCourseDisplayer() {
    	return new ACourseDisplayer1();
    }
	public static void main(String[] args) {
		CourseDisplayer aCourseDisplayer = createCourseDisplayer();
		aCourseDisplayer.fillCourses();
		aCourseDisplayer.matchTitles();
	}
/*
 * FACTORY_METHODS
 * 
 * Compare the factory methods in ACourseDislayer1 and ACourseDisplayer2.
 * 
 * 
 * Abstract classes and factory methods often go together.
 * 
 * A factory method is one that creates and returns an instance of some class.
 * 
 * It can be static or non static.
 * 
 * (T/F) The method main() in ACourseDisplayer1 is static factory method.
 * 
 * (T/F) The method createCourseDisplayer() in ACourseDisplayer1 is a static 
 * factory method.
 * 
 * (T/F) All instance methods in ACourseDisplayer1 are factory methods.
 * 
 * (T/F) A factory method does not have to be public.
 * 
 */
/*
 * Next class ACourseDisplayer2
 */

}
