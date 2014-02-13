package lectures.parsing_grammars;

import lectures.inheritance.abstract_classes.ACourseList;
import lectures.inheritance.abstract_classes.AFreshmanSeminar;
import lectures.inheritance.abstract_classes.ARegularCourse;
import lectures.inheritance.abstract_classes.Course;
import lectures.inheritance.abstract_classes.CourseList;
import lectures.main_consoleinput.Console;

public class ACourseParser implements CourseParser {
	//<CourseList> -> <Course>*
	public CourseList parseCourseList() {
	       CourseList courseList = new ACourseList();
	       String nextToken;
	       while (true) {
		 nextToken = Console.readString();
		 if (nextToken.equals("."))
		 	break;
		 else
	 	               courseList.addElement(parseCourse(nextToken));
	       }
	       return courseList;
	   }
	// <Course> -> <RC> | <FS>
	public Course parseCourse (String firstToken) {
	 	if (firstToken.toUpperCase().equals("FS"))
	 		return parseFreshmanSeminar();
	 	else if (firstToken.toUpperCase().equals("RC"))
	 		return parseRegularCourse();
	 	else {
	 		return null;
	 	} 	 	
    }
	//<FS>  -> FS  <Title> <Dept>
	public Course parseFreshmanSeminar () {
	 	String title = Console.readString();
	 	String dept = Console.readString();
	 	return new AFreshmanSeminar(title, dept);
	 	
   }
	//<RC>  -> RC  <Title> <Dept> <Number>
	public Course parseRegularCourse () {
	 	String title = Console.readString();
	 	String dept = Console.readString();
	 	int number = Console.readInt();	 	
	 	return new ARegularCourse (title, dept, number); 	
}





}
