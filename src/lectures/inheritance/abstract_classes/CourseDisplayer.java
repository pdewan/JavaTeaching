package lectures.inheritance.abstract_classes;

import java.util.Scanner;

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

public class CourseDisplayer {
	protected static CourseList courses = new ACourseList();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		fillCourses();
		matchTitles();
	}

	protected static void matchTitles() {
		while (true) {
			System.out.println("Please enter course title:");
			String inputLine = scanner.nextLine();
			if (".".equals(inputLine)) {
				break;
			} else {
				// Press F4 and find and look at the various classes into which
				// it is decomposed.
				// Follow the commented instructions in these classes.
				// Why is there not a single class for the two kinds of courses?
				// Why three classes?
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

	protected static void fillCourses() {
		courses.addElement(new ARegularCourse("Intro. Prog.", "COMP", 14));
		courses.addElement(new ARegularCourse("Found. of Prog.", "COMP", 114));
		courses.addElement(new AFreshmanSeminar("Comp. Animation", "COMP"));
		courses.addElement(new AFreshmanSeminar("Lego Robots", "COMP"));
	}

	static void printHeader() {
		System.out.println("TITLE		" + "NUMBER	");
	}

	static void print(Course course) {
		System.out.println(course.getTitle() + "	" + course.getDepartment()
				+ course.getNumber());

	}

}
