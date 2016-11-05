package lectures.inheritance.abstract_classes;

import java.util.Scanner;

import lectures.inheritance.abstract_classes.courselist.ACourseList;
import lectures.inheritance.abstract_classes.courselist.CourseList;
import util.misc.Console;
/*
 * Run this program and provide the same input you provided to ACourseDislayer1.
 * 
 * (T/F) ACourseDislayer1 and ACourseDisplayer2 provide the same functionality,
 * that is, produce the same output for each input.
 * 
 * Answer the questions below.
 */

public class ACourseDisplayer2 extends ACourseDisplayer {
	
	protected RegularCourse createRegularCourse(String theTitle, String theDept, int theCourseNum) {
		return new ARegularCourse(theTitle, theDept, theCourseNum);
	}
	protected FreshmanSeminar createFreshmanSeminar(String theTitle, String theDept) {
		return new AFreshmanSeminar(theTitle, theDept);
	}
	
    protected static CourseDisplayer createCourseDisplayer() {
    	return new ACourseDisplayer2();
    }
	public static void main(String[] args) {
		CourseDisplayer aCourseDisplayer = createCourseDisplayer();
		aCourseDisplayer.fillCourses();
		aCourseDisplayer.matchTitles();
	}
/*
 * COMMON METHODS
 * (T/F) The headers of the methods in ACourseDisplayer1 and ACourseDisplayer2 
 * are identical.
 * 
 * (T/F) The headers of the methods in ACourseDisplayer1 and ACourseDisplayer2  
 * are public
 * 
 * (T/F) The headers of the methods in ACourseDisplayer1 and ACourseDisplayer2 
 * can be put in a common interface.
 * 
 * (T/F) The corresponding methods in in ACourseDisplayer1 and ACourseDisplayer2
 * (the ones with the same header) return instances of the same class.
 * 
 * (T/F)  The corresponding methods in in ACourseDisplayer1 and ACourseDisplayer2
 * (the ones with the same header) return instances of the same interface.
 * 
 * (T/F) It makes logical sense for ACourseDisplayer1 to be a subclass of ACourseDisplayer.
 * 
 * (T/F) It makes logical sense for ACourseDisplayer2 to be a subclass of ACourseDisplayer1.
 * 
 * (T/F) ACourseDisplayer1 and ACourseDisplayer2 can share the implementation of
 * printHeader() without making the common superclass, ACourseDisplayer, abstract,
 * and without adding nonsense empty methods in the common superclass.
 * 
 * (T/F) ACourseDisplayer1 and ACourseDisplayer2 can share the implementation of
 *  fillCourses() without making the common superclass, ACourseDisplayer, abstract,
 *  and  without adding nonsense empty methods in the common superclass.
 * 
 * 
 */
/*
 * Next class ACourseDisplayer
 */
}
