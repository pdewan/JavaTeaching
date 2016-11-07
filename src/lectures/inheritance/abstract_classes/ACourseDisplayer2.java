package lectures.inheritance.abstract_classes;

import java.util.Scanner;

import lectures.inheritance.abstract_classes.courselist.ACourseList;
import lectures.inheritance.abstract_classes.courselist.CourseList;
import util.misc.Console;
/*
 * Now compare the factory methods in ACourseDislayer1 and ACourseDisplayer2.
 * 
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
 *  
 * (T/F) ACourseDisplayer2 is an abstract class.
 * 
 * (T/F) Each abstract method in ACourseDisplayer is overridden in 
 * ACourseDisplayer2.
 * 
 * (T/F) The headers of the methods in ACourseDisplayer1 and ACourseDisplayer2 
 * are identical.
 * 
 * (T/F) The headers of the methods in ACourseDisplayer1 and ACourseDisplayer2  
 * are public.
 * 
 * 
 * Recall that interfaces hold public method headers, not private or protected.
 * 
 * (T/F) The headers of the methods in ACourseDisplayer1 and ACourseDisplayer2 
 * can be put in a common interface.
 * 
 * (T/F) The corresponding methods in in ACourseDisplayer1 and ACourseDisplayer2
 * (the ones with the same header) return instances of the same class.
 * 
 * (T/F)  The corresponding methods in ACourseDisplayer1 and ACourseDisplayer2
 * (the ones with the same header) return instances of classes that implement the same interface.
 * 
 * 
 * Let us consider the relationships between ACourseDisplayer, ACourseDisplayer1, and
 * ACourseDisplayer2. ACourseDisplayer1 and ACourseDisplayer2 only differ in the classes
 * that they use to implement their functionality. Assume that we care about the underlying
 * implementation, and therefore care which we use in any particular situation.
 * Meanwhile, ACourseDisplayer is a general class that does not make any promises about the
 * implementation.
 * 
 * (T/F) It makes logical sense for ACourseDisplayer1 to be a subclass of ACourseDisplayer.
 * 
 * (T/F) It makes logical sense for ACourseDisplayer2 to be a subclass of ACourseDisplayer1.
 * 
 * 
 * ACourseDisplayer allows ACourseDisplayer1 and ACourseDisplayer2 to share code. However, look
 * at the code that they are inheriting (especially fillCourses()). It fills a collection
 * with objects representing courses. However, as discussed previously, ACourseDisplayer1 and
 * ACourseDisplayer2 will use different classes for this representation.
 * 
 * (T/F) Each override of an abstract method of ACourseDisplayer is a
 * factory method.
 * 
 * (T/F) Different overrides of each factory method in ACourseDisplayer return
 * instances of different classes.
 *  
 *  
 * Consider the hypothetical case in which ACourseDisplayer1 and ACourseDisplayer2 wanted to
 * share the implementation of a method named printHeaders(), which printed the headers of the
 * public and protected methods of the class.
 * 
 * (T/F) ACourseDisplayer1 and ACourseDisplayer2 can share the implementation of
 * printHeaders() without making the common superclass, ACourseDisplayer, abstract,
 * and without adding nonsense empty methods in the common superclass.
 * 
 * 
 * Now consider the present case, where the two classes want to share the implementation of
 * fillCourses(), but fillCourses() needs to make calls to methods that will be implemented 
 * differently in the two classes (such as createRegularCourse()).
 * 
 * (T/F) ACourseDisplayer1 and ACourseDisplayer2 can share the implementation of
 *  fillCourses() without making the common superclass, ACourseDisplayer, abstract,
 *  and  without adding nonsense empty methods in the common superclass.
 * 
 * 
 * We will now look at the hierarchies of the classes representing courses.
 */
/*
 * Next class AnotherRegularCourse
 */
}
