package lectures.inheritance.abstract_classes;

import java.util.Scanner;

import lectures.inheritance.abstract_classes.courselist.ACourseList;
import lectures.inheritance.abstract_classes.courselist.CourseList;
import util.misc.Console;
// This example is motivated by a course numbering scheme that used to exist at UNC
// in which all freshman seminars were given the same course number - Comp 6.
// This program understands the following course titles: 
// "Intro. Prog.", "Found. of Prog.", "Computer Animation", "Lego Robots" 
// The first two are regular courses with individual numbers. The last two are
// freshman semimars mapped to comp 16.
// Run the program. For course titles, enter some titles known to the program
// and some unknown.

// PROGRAM DECOMPOSITION

// How would you decompose the program into classes?

public class ACourseDisplayer1 extends ACourseDisplayer {
	
	protected RegularCourse createRegularCourse(String theTitle, String theDept, int theCourseNum) {
		return new ARegularCourse(theTitle, theDept, theCourseNum);
	}
	protected FreshmanSeminar createFreshmanSeminar(String theTitle, String theDept) {
		return new AFreshmanSeminar(theTitle, theDept);
	}
	
    protected static CourseDisplayer createCourseDisplayer() {
    	return new ACourseDisplayer1();
    }
	public static void main(String[] args) {
		CourseDisplayer aCourseDisplayer = createCourseDisplayer();
		aCourseDisplayer.fillCourses();
		aCourseDisplayer.matchTitles();
	}
}
