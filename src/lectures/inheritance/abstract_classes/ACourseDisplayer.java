package lectures.inheritance.abstract_classes;

import java.util.Scanner;

import lectures.inheritance.abstract_classes.courselist.ACourseList;
import lectures.inheritance.abstract_classes.courselist.CourseList;
import util.misc.Console;
/**
 * This class illustrates the nature of abstract classes and methods.
 * 
 */

public 
// Comment out the "abstract" keyword to see what happens, then uncomment.
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
 * Uncomment the body below and then comment it back in
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
 * Uncomment the method below to see what happens, then comment it out again.
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
 * (T/F) fillCourses() is an abstract method.
 * 
 * (T/F) createRegularCourse() is an abstract method.
 * 
 * Uncomment the body of createRegularCourse, look at any error message,
 * and comment it back out. 
 * 
 * (T/F) An abstract method cannot have a header.
 * 
 * (T/F) An abstract method cannot have a body.
 *  
 * Uncomment the createCourseDisplayer() method, look at any error message,
 * and comment it back out.
 * 
 * (T/F) An abstract class can be instantiated.
 * 
 * Comment out the abstract keyword in declaration of this class, look at any error message,
 * and uncomment it.
 * 
 * (T/F) An abstract method can be declared in a non-abstract class  
 * 
 * (T/F) An abstract method declared in a class can be called by methods in that class.
 * 
 */
 /*
  * Next class: ACourseDisplayer1
  */
	
}
