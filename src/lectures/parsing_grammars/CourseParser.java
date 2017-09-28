package lectures.parsing_grammars;

import lectures.inheritance.abstract_classes.Course;
import lectures.inheritance.abstract_classes.courselist.CourseList;

public interface CourseParser {
	public CourseList parseCourseList();
	public Course parseCourse (String firstToken) ;
	public Course parseFreshmanSeminar () ;
	public Course parseRegularCourse () ;

}
