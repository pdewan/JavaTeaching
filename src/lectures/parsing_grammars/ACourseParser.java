package lectures.parsing_grammars;

import java.util.Scanner;

import lectures.inheritance.abstract_classes.AFreshmanSeminar;
import lectures.inheritance.abstract_classes.ARegularCourse;
import lectures.inheritance.abstract_classes.Course;
import lectures.inheritance.abstract_classes.courselist.ACourseList;
import lectures.inheritance.abstract_classes.courselist.CourseList;
import lectures.main_consoleinput.Console;


/**
 *  An example of a parser.
 *  A parser *usually* converts scanned tokens in a legal sentence into
 *  into a form called the parse tree, which can the be further processed by the program.
 *  In this program, we are trying to convert the input into a course list, which is the tree that
 *  will be processed. Each token is assumed to appear on a separate line to make our scanning easy.

 *  This structured way is called recursive descent parsing in which a separate
 *  parsing method is created for each non terminal that can recursively
 *  call parsing methods for non terminals defining or deriving smaller parts of the sentence.
 *  
 *  Each parsing method has a comment indicating which non terminal it is processing
 *  A non terminal may be the LHS for several productions
 *  
 *  It calls parsing methods for non terminals appearing on the right hand side of each of these
 *  productions
 * 
 * @author dewan
 *
 */
 

public class ACourseParser implements CourseParser {
	Scanner scanner = new Scanner(System.in);
	//<CourseList> -> <Course>*.
	public CourseList parseCourseList() {
		CourseList aCourseList = new ACourseList();
		String nextToken;
		while (true) {
			nextToken = scanner.nextLine();
			if (".".equals(nextToken)) {
				break; // terminate on .
			} else {
				// call the parser for <Course> until a .is input
				// add the return course to the parse tree representing the course list
				aCourseList.addElement(parseCourse(nextToken)); 
			}
		}
		return aCourseList;
	}
	// <Course> -> <RegularCourse> | <FreshmanSeminar>
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
	//<FreshmanSeminar>  -> FS  <Title> <Dept>
	// by the time we reach here, we have already read or consumed the teminal FS
	public Course parseFreshmanSeminar () {
	 	String aTitle = scanner.nextLine();
	 	String aDept = scanner.nextLine();
	 	return new AFreshmanSeminar(aTitle, aDept); // returning a parse tree node
	 	
   }
	//<RegularCourse>  -> RC  <Title> <Dept> <Number>
	public Course parseRegularCourse () {
	 	String aTitle = scanner.nextLine();
	 	String aDept = scanner.nextLine();
	 	String aUniv = scanner.nextLine();
	 	int number = Integer.parseInt(scanner.nextLine());	 	
	 	return new ARegularCourse (aTitle, aDept, number); // returning a different kind of parse tree node
    }

	/*
	 * Alterative parseRegularCourse
	 */
//		public Course parseRegularCourse () {
//		 	int number = Integer.parseInt(scanner.nextLine());	
//		 	String title = scanner.nextLine();
//		 	String dept = scanner.nextLine();
//		 	String univ = scanner.nextLine();
//		 	return new ARegularCourse (title, dept, number); // returning a different kind of parse tree node
//	    }

}
/*
 * (T/F) The parsing method for <CourseList> directly calls the parsing method for <RegularCourse>.
 * 
 * (T/F) The parsing method for <CourseList> directly calls the parsing method for <Course>.
 *  
 * (T/F) The parsing method for <Course> directly calls the parsing method for <RegularCourse>.
 * 
 * (T/F) The parsing method for <Course> directly calls the parser for <FreshmanSeminar>.
 * 
 * (T/F) The parsing method for <Course> directly calls the parsing method for <CourseList>. 
 * 
 * (T/F> Each parsing method is associated with a non terminal.
 * 
 * (T/F> Each parsing method is associated with a terminal.
 * 
 * (T/F> Each parsing method is associated with a root.
 * 
 * <T/F> A root is associated with a parsing method.
 * 
 * If a production P contains non terminal N1 on its LHS, and non terminal N2 on its RHS
 * then:
 * 
 * The parsing method of N1 directly calls the parsing method for N2.
 * The parsing method of N2 directly calls the parsing method for N1.
 * None of the above
 * 
 * Switch the two parse methods. Understand what inputs are accepted by the modified program. 
 * 
 * The new parser parses which of the following definitions of <RegularCourse>
 * 
 *  <RegularCourse> -> RC <Title> <Dept> <Number>
 *  
 *  <RegularCourse> -> RC <Number> <Title> <Dept> <String>
 * 
 *  <RegularCourse> -> RC <Number> <String> <Title> <Dept> 
 *  
 *  <RegularCourse> -> RC <Number> <String> <String> <String> 
 * 
 *  <T/F> A parser can parse more than one grammar, that is, recognize sentences defined by more
 *  than one grammar
 * 
 */
