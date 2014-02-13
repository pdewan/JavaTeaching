package lectures.factories;

import lectures.inheritance.abstract_classes.Course;
import lectures.main_consoleinput.Console;
import lectures.parsing_grammars.ACourseParser;

public class AnAbstractFactoryBasedCourseParser extends ACourseParser {
	// how can we use factory methods to improve reusability
	//<FS>  -> FS  <Title> <Dept>
	public Course parseFreshmanSeminar () {
	 	String title = Console.readString();
	 	String dept = Console.readString();
	 	return CourseFactorySelector.getFreshmanSeminar(title, dept);
	 	
   }
	//<RC>  -> RC  <Title> <Dept> <Number>
	public Course parseRegularCourse () {
	 	String title = Console.readString();
	 	String dept = Console.readString();
	 	int number = Console.readInt();	 	
	 	return CourseFactorySelector.getRegularCourse (title, dept, number); 	
}





}
