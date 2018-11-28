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
 *  SOme parsers do not create any data structue, they simply indicate if a sentence is legal or not.
 *  In this program, we are trying to convert the input into a course list, which is the tree that
 *  will be processed. Each token is assumed to appear on a separate line to make our scanning easy.
 *  
 *  Thus, a parser takes as input tokens produced by a scanner and may produces as output a data
 *  structure called a parse tree. A token read from the scanner is called a consumed token. In
 *  general, a parser keeps a pointer separating the sequence of consumed tokens from those
 *  that are unconsumed.
 * 
 *  Recursive descent parsing is a structured way of writing a parser in which a separate
 *  parsing method is created for each non terminal, which can recursively
 *  call parsing methods for non terminals defining or deriving smaller parts of the sentence.
 *  
 *  In this class, each parsing method has a comment indicating which non terminal it is processing
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
	// As there is alternation, we have if statements and a different behavior for each alternation
	// The first terminal in each alternative is used to determine the path.
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
 * (T/F> A parsing method is associated with each non-terminal.
 * 
 * (T/F> A parsing method is associated with each terminal.
 * 
 * (T/F> A parsing method is associated with a root.
 *  
 * (T/F) The parsing method for <CourseList> directly calls the parsing method for <RegularCourse>.
 * 
 * (T/F) The parsing method for <CourseList> directly calls the parsing method for <Course>.
 *  
 * (T/F) The parsing method for <Course> directly calls the parsing method for <RegularCourse>.
 * 
 * (T/F) The parsing method for <Course> directly calls the parsing method for <FreshmanSeminar>.
 * 
 * (T/F) The parsing method for <Course> directly calls the parsing method for <CourseList>. 
 * 
 *
 * (T/F) The course title is syntactic sugar. (A terminal that is entered by the user but not stored in the parse tree is called syntactic
 * sugar.)
 * 
 * (T/F) The course number is syntactic sugar.
 * 
 * (T/F) The literal "FS" is syntactic sugar.
 * 
 * (T/F) The literal "RC" is syntactic sugar.
 * 
 * (T/F) The parsing method of <Course> consumes tokens. A method
 * consumes a token if it reads it from the scanner (in this case the Scanner
 * instance).
 * 
 * (T/F) The parsing method of <FreshmanSeminar> consumes tokens.
 * 
 * (T/F) The parsing method of <Course> processes tokens. A method processes a 
 * token if it examines its value.
 * 
 * (T/F) The parsing method of <FreshmanSeminar> processes tokens.
 * 
 * (T/F) All tokens consumed by a parsing method are passed as parameters to the method.
 *
 * (T/F) All tokens processed by a parsing method are passed as parameters to the method.
 * 
 * 
 * (T/F) All tokens processed by a parsing method that are not consumed by it are
 *  passed as parameters to the method.
 * 
 *   
 * (T/F) All tokens consumed by a parsing method that are not processed by it are
 *  passed as parameters to the method.
 *  
 * If a production P contains non-terminal N1 on its LHS, and non-terminal N2 on its RHS
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
 *  than one grammar.
 *  
 *  <T/F> The same input representation can be defined using more than one set of grammar rules.
 *  
 *  <T/F> A grammar can be parsed by two different parsers, that is, parsers that are not identical.
 * 
 */
