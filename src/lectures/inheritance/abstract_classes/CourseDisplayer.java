package lectures.inheritance.abstract_classes;

import util.misc.Console;

public class CourseDisplayer {
	protected static CourseList courses = new ACourseList();

	public static void main(String[] args) {
		fillCourses();
		matchTitles();
	}
	
	protected static void matchTitles() {
		while (true) {
			System.out.println("Please enter course title:");
			String inputLine = Console.readString();
			if (inputLine.equals("."))
				break;
			else {
				Course matchedCourse = courses.matchTitle(inputLine);
				if (matchedCourse == null)
					System.out.println("Sorry, this course is not offered.");
				else {
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
