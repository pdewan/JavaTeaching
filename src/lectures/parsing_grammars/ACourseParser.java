package lectures.parsing_grammars;

import java.util.Scanner;

import lectures.inheritance.abstract_classes.ACourseList;
import lectures.inheritance.abstract_classes.AFreshmanSeminar;
import lectures.inheritance.abstract_classes.ARegularCourse;
import lectures.inheritance.abstract_classes.Course;
import lectures.inheritance.abstract_classes.CourseList;
import lectures.main_consoleinput.Console;
// Each parsing method has a comment indicating which Non terminal it is processing
// A non terminal may be the LHS for several productions
// It calls parsing methods for non terminals appearing on the right hand side of each of these
// productions

public class ACourseParser implements CourseParser {
	Scanner scanner = new Scanner(System.in);
	//<CourseList> -> <Course>*.
	public CourseList parseCourseList() {
		CourseList courseList = new ACourseList();
		String nextToken;
		while (true) {
			nextToken = scanner.nextLine();
			if (".".equals(nextToken)) {
				break; // terminate on .
			} else {
				// call the parser for <Course> until a .is input
				// add the return course to the parse tree representing the course list
				courseList.addElement(parseCourse(nextToken)); 
			}
		}
		return courseList;
	}
	// <Course> -> <RC> | <FS>
	// A there is alternation, we have if statements and a different behavior for each alternation
	// The first terminal in each alternative is used to determine the path
	public Course parseCourse (String firstToken) {
	 	if ("FS".equals(firstToken.toUpperCase())) {
	 		return parseFreshmanSeminar(); 
	 	} else if ("RC".equals(firstToken.toUpperCase())) {
	 		return parseRegularCourse();
	 	} else {
	 		return null; // in case the user makes an error, this program is not really error resilient
	 	} 	 	
    }
	//<FS>  -> FS  <Title> <Dept>
	// by the time we reach here, we have already read or consumed the teminal FS
	public Course parseFreshmanSeminar () {
	 	String title = scanner.nextLine();
	 	String dept = scanner.nextLine();
	 	return new AFreshmanSeminar(title, dept); // returning a parse tree node
	 	
   }
	//<RC>  -> RC  <Title> <Dept> <Number>
	public Course parseRegularCourse () {
	 	String title = scanner.nextLine();
	 	String dept = scanner.nextLine();
	 	int number = Integer.parseInt(scanner.nextLine());	 	
	 	return new ARegularCourse (title, dept, number); // returning a different kind of parse tree node
}





}
