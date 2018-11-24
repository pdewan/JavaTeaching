package lectures.parsing_grammars;

import lectures.inheritance.abstract_classes.ACourseDisplayer;
import lectures.inheritance.abstract_classes.ACourseDisplayer2;
import lectures.inheritance.abstract_classes.CourseDisplayer;




/**
 * A class illustrating recursive descent parsing. The input consists of two parts: parsed and interpreted. 
 * The (first) parsed part consists of multiple lines ending with a '.'.
 * It is processed to create a list of courses, much as a program is processed to create an
 * internal representation called a syntax tree. 
 * 
 * The course list uses types we saw earlier in our study of abstract methods and classes.
 * We have two kinds of courses - regular courses and freshmen seminars. Each course stored
 * in the list will be called a parsed course. For each parsed course, the user inputs a
 * sequence of lines which we will call the input representation of the course. An input representation
 * is legal if it is processed without any errors.
 * 
 * The (second) interpreted part is processed line by line much as command lines are interpreted by an operating
 * system command interpreter - called the shell by Unix-like OS. These lines are interpreted as
 * queries that ask can the system to display output representations of courses based
 * on input attributes of the course. A query is successful if it displays a course
 * output representation.
 * 
 * Study the program below and then see the discussion below.
 * 
 */
public class AParsingCourseDisplayer extends ACourseDisplayer2 {

	@Override
	public void fillCourses() {
        System.out.println("Please enter course info, terminating with a period:");
        /*
         * Put a break point below and use F5 to step into parseCourseList
         * which is parser for the root non terminal, CourseList. 
         */        
        courses = (new ACourseParser()).parseCourseList();
   }
	protected static CourseDisplayer createCourseDisplayer() {
		return new AParsingCourseDisplayer();
	}

	public static void main(String[] args) {
		CourseDisplayer aCourseDisplayer = createCourseDisplayer();
		aCourseDisplayer.fillCourses();
		aCourseDisplayer.matchTitles();
	}
	/* 
	 *  Run the program and provide input based on the example I/O below:
	 * 
	 *  The prompts are the output, the other lines are input.	   
	 *  
	 * Please enter course info, terminating with a period:
	 * RC
	 * Intro. Prog.
	 * COMP
	 * 14
	 * FS
	 * Random Thoughts
	 * COMP
	 * .
	 * Please enter course title:
	 * Random Thoughts
	 * TITLE		NUMBER	
	 * Random Thoughts	COMP6
	 * Please enter course title:
	 * Intro. Prog.
	 * TITLE		NUMBER	
	 * Intro. Prog.	COMP14
	 * Please enter course title:
	 * Meaning of Life
	 * Sorry, this course is not offered.
	 * Please enter course title:
	 * 
	 *  
	 *  How many input representations in the parsed part of the
	 *  example interaction?
	 *  
	 *  1
	 *  2
	 *  3
	 *  4
	 *  
	 *  How many queries in the second, interpreted part?
	 *  1
	 *  2
	 *  3
	 *  4
	 *  5
	 *  
	 *  How many successful queries in the interpreted part?
	 *  1
	 *  2
	 *  3
	 *  4
	 *  5
	 *  
	 *  The program allows a user to display the following information about each parsed course:
	 *  (a) Department
	 *  (b) Title
	 *  (c) Number
	 *  (d) University
	 *  (e) Instructor
	 *  
	 *  
	 *  In the parsed part, for *each course*, the user must enter the following as part of its
	 *  internal representation:
	 *  (a) Department
	 *  (b) Title
	 *  (c) Number
	 *  (d) University
	 *  (e) Instructor
	 *  
	 * (T/F) An input representation of a course *can* contains information not displayed as part of
	 * its output representation.
	 * 
	 * (T/F) An output representation of a course *can* contain entered as part of its input representation.
	 *  
	 *  You can run the program to answer the following questions. A legal input representation is one
	 *  that does not lead to an error when it is being parsed. Run the program if in doubt.
	 *  
	 *  The following is a legal input representation of a course:
	 *  RC
	 *  Meaning of Life
	 *  COMP
	 *  42
	 *  
	 *  The following is a legal input representation of a course:
	 *  RC
	 *  COMP
	 *  Meaning of Life
	 *  42
	 * 	   
	 *  The following is a legal input representation of a course:
	 *  FS
	 *  Meaning of Life
	 *  COMP
	 *  42
	 *  
	 *  The following is a legal input representation of a course:
	 *  RC
	 *  Meaning of Life
	 *  COMP
	 *    
	 *  The following is a legal input representation of a course:
	 *  FS
	 *  Meaning of Life
	 *  COMP
	 *   
	 *  Do you see the pattern for inputting freshman seminars and regular courses?
	 *
	 *  Can you describe in English this pattern?
	 *  
	 *  Each legal parsed part is called a sentence.
	 *  It is not necessarily a legalEnglish sentence, it is simply a sentence described
	 *  by out pattern for input.
	 *  
	 *  The sentences parsed by our program can be described formally by the following grammar:
	 *  
	 * <CourseList> -> <Course> *. 
	 * <Course> -> <RegularCourse> | <FreshmanSeminar>
	 * <RegularCourse> -> RC <Title> <Dept> <Number>
	 * <FreshmanSeminar> -> FS <Title> <Dept>
	 * <Title> -> String
	 * <Dept> -> String
	 * <Number> -> Integer

	 *  The grammar consists of a series of production rules which define or derive legal sentences.
	 *  This grammar says that the input lines consist of a <CourseList>
	 *  
	 *  A <CourseList>, in turn consists of or derives an unlimited number of <Course> input lines followed by a period.
	 *  * stands for repetition.
	 *  
	 *  A <Course> can either be a <RegularCourse> (regular course) or <FreshmanSeminar> (Freshman seminar)
	 *  | stands for alternation.
	 *  
	 *  An <RegularCourse> is followed by the the literal "RC" followed by a <Title> <Dept> <Number>
	 *  <Title> and <Dept> are string values. <Number> is an arbitrary integer.
	 *  A terminal or literal does not appear on the left hand side (LHS) of a production and thus
	 *  does not need elaboration. (We know what strings and integers are). It is not enclosed in angle brackets.
	 *  A non terminal must appear on the LHS of at least one production and can appear in the right
	 *  hand side also. It is enclosed in angle brackets. The root non terminal appears only on the LHS.
	 *
	 * (T/F) <Course> is a non terminal
	 * 
	 * (T/F) RC is a non terminal
	 * 
	 * (T/F) <RegularCourse> is a terminal
	 * 
	 * (T/F> <FreshmanSeminar> is a non terminal
	 * 	
	 * <T/F> <CourseList> is a non terminal
	 * 
	 * <T/F> <CourseList> is a root.
	 * 
	 * <T/F> <Course> is a root.
	 * 
	 * <T/F> A non terminal must appear on the LHS of at least one production.
	 * 
	 * <T/F> A terminal must appear on the LHS of at least one production. 
	 *
	 * <T/F> A non terminal must appear on the RHS of at least one production.
	 * 
	 * <T/F> A terminal must appear on the RHS of at least one production. 
	 * 
	 * <T/F> A non terminal can appear on the RHS of a production.
	 * 
	 *  <T/F> A  terminal can appear on the LHS of a production.
	 *  
	 * Suppose we change:
	 * 
	 *  <RegularCourse> -> RC <Title> <Dept> <Number>
	 *  
	 *  to 
	 *  
	 *  <RegularCourse> -> RegularCourse <Number> <Title> <Dept> <Univ>
	 *  
	 *  and added the following production
	 *  
	 *  <Univ> -> <String>
	 *  
	 *  The following is a legal input representation of a course, that is, a representation
	 *  that is processed without an error:
	 *  
	 *  
	 *  RegularCourse
	 *  Meaning of Life
	 *  COMP
	 *  42
	 *  
	 *  RegularCourse
	 *  Meaning of Life
	 *  UNC
	 *  COMP
	 *  42
	 *  
	 *  RegularCourse
	 *  42
	 *  Meaning of Life
	 *  COMP
	 *  UNC
	 *
	 *  RegularCourse
	 *  42
	 *  UNC
	 *  Meaning of Life
	 *  COMP	 
	 *
	 *
	 *  A grammar provides us with a structured way to write a parser.
	 *  Put the break point as instructed above and step into the parser to follow its
	 *  structure.
	 *  
	 *  Next Class ACourseParser
	 *  
	 *  A parser *usually* converts scanned tokens in a legal sentence into
	 *  into a form called the parse tree, which can the be further processed by the program.
	 *  In this program, we are trying to convert the input into a course list, which is the tree that
	 *  will be processed. Each token is assumed to appear on a separate line to make our scanning easy.

	 *  This structured way is called recursive descent parsing in which a separate
	 *  parsing method is created for each non terminal that can recursively
	 *  call parsing methods for non terminals defining or deriving smaller parts of the sentence.
	 * 
	 */


	
}
