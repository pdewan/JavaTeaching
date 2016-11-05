package lectures.inheritance.abstract_classes;

import java.util.Scanner;

import lectures.inheritance.abstract_classes.courselist.ACourseList;
import lectures.inheritance.abstract_classes.courselist.CourseList;
import util.misc.Console;
/**
 * This class illustrates the nature of abstract classes and methods
 * 
 */

public 
// comment out abstract
	abstract 
		class ACourseDisplayer implements CourseDisplayer {
	protected CourseList courses = new ACourseList();
	Scanner scanner = new Scanner(System.in);
	public  void matchTitles() {
		while (true) {
			System.out.println("Please enter course title:");
			String inputLine = scanner.nextLine();
			if (".".equals(inputLine)) {
				break;
			} else {				
				Course matchedCourse = courses.matchTitle(inputLine);
				if (matchedCourse == null) {
					System.out.println("Sorry, this course is not offered.");
				} else {
					printHeader();
					print(matchedCourse);
				}
			}
		}
	}
	
	protected abstract RegularCourse createRegularCourse(
			String theTitle, String theDept, int theCourseNum)
/*
 * Comment out the body below and then comment it back in
 */
//			{ return null}
		;
	protected abstract FreshmanSeminar createFreshmanSeminar(String theTitle, String theDept) ;
	public void fillCourses() {
		courses.addElement(createRegularCourse("Intro. Prog.", "COMP", 14));
		courses.addElement(createRegularCourse("Found. of Prog.", "COMP", 114));
		courses.addElement(createFreshmanSeminar("Comp. Animation", "COMP"));
		courses.addElement(createFreshmanSeminar("Lego Robots", "COMP"));
	}

    void printHeader() {
		System.out.println("TITLE		" + "NUMBER	");
	}

    void print(Course course) {
		System.out.println(course.getTitle() + "	" + course.getDepartment()
				+ course.getNumber());
	}
/*
 * Comment out the method below
 */
//    protected static CourseDisplayer createCourseDisplayer() {
//    	return new ACourseDisplayer();
//    } 
/**
 * ABSTRACT CLASSES AND METHODS
 * 
 * An abstract method is one that has the keyword abstract in its header.
 * An abstract class is one that has the keyword abstract in its header.
 * 
 * (T/F) ACourseDisplayer is an abstract class.
 * 
 * (T/F) ACourseDisp;layer2 is an abstract class.
 * 
 * (T/F) fillCourses()is an abstract method.
 * 
 * (T/F) createRegularCourse() is an abstract method.
 * 
 * Comment out the body of createRegularCourse, look at any error message,
 * and comment it back in. 
 * 
 * (T/F) An abstract method cannot have a header.
 * 
 * (T/F) An abstract method cannot have a body.
 * 
 * (T/F) Each abstract method in ACourseDisplayer is overridden in 
 * ACourseDisplayer1 
 * 
 * (T/F) Each abstract method in ACourseDisplayer is overridden in 
 * ACourseDisplayer2.
 * 
 * (T/F) Each override of an abstract method of ACourseDisplayer is a
 * factory method. 
 * 
 * (T/F) Different overrides of each factory method in ACourseDisplayer return
 * instances of different classes.
 *  
 * Comment out the createCourseDisplayer() method, look at any error message,
 * and comment it back in.
 * 
 * (T/F) An abstract class can be instantiated.
 * 
 * Comment out the abstract keyword in declaration of this class, ook at any error message,
 * and comment it back in.
 * 
 * (T/F) An abstract method can be declared in a non-abstract class  
 * 
 * (T/F) An abstract method declared in a class can be called by methods in that class.
 * 
 * (T/F) An abstract method declared in a class can be called by methods in
 * subclasses of the class.
 * 
 */
 /*
  * Next class AnotherRegularCourse
  */
	
}
