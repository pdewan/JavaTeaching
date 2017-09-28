package lectures.inheritance.multiple;

import lectures.inheritance.abstract_classes.Course;
import lectures.inheritance.abstract_classes.courselist.ACourseList;
import lectures.inheritance.abstract_classes.courselist.CourseList;
import util.misc.Console;

public class LoggedCourseDisplayer {
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
		courses.addElement(new ALoggedRegularCourse("Intro. Prog.", "COMP", 14));
		courses.addElement(new ALoggedRegularCourse("Found. of Prog.", "COMP", 114));
		courses.addElement(new ALoggedFreshmanSeminar("Comp. Animation", "COMP"));
		courses.addElement(new ALoggedFreshmanSeminar("Lego Robots", "COMP"));
	}

	static void printHeader() {
		System.out.println("TITLE		" + "NUMBER	");
	}

	static void print(Course course) {
		System.out.println(course.getTitle() + "	" + course.getDepartment()
				+ course.getNumber());

	}

}
