package lectures.parsing_grammars;

import lectures.inheritance.abstract_classes.CourseDisplayer;
// This is a variation of the CourseDisplayer we saw earlier except that it
// has two phases. The first phase allows users to enter new courses until a "."
// is pressed. The second phase is as in the previous version, in which one can
// queries for courses.

// Here is an example legal interaction - the prompts are
// the output, the other lines are input.
//Please enter course info, terminating with a period:
//RC
//Intro. Prog.
//COMP
//14
//FS
//Random Thoughts
//COMP
//.
//Please enter course title:
//Random Thoughts
//TITLE		NUMBER	
//Random Thoughts	COMP6
//Please enter course title:
//Meaning of Life
//Sorry, this course is not offered.
//Please enter course title:
//.

// Do you see the pattern for inputting freshman seminars and course numbers?
// Can you describe in English this pattern?

// Such a pattern can be described formally by the following grammar:
//<CourseList> -> <Course> *.
//<Course> -> <RC> | <FS>
//<RC> -> RC <Title> <Dept> <Number>
//<FS> -> FS <Title> <Dept>
//<Title> -> String
//<Dept> -> String
//<Number> -> Integer

// The grammear consists of a series of production rules.
// This grammar says that the input lines consist of a <CourseList>
// A <CourseList>, in turn consists of an unlimited number of <Course> input lines followed by a period.
// * means repetition.
// A <Course> can either be a <RC> (regular course) or <FS> (Freshman seminar)
// | means alernation
// An <RC> is followed by the terminal or literal RC followed by a <Title> <Dept> <Number>
// <Title> and <Dept> are string values.
// <Number> is an arbitrary integer.
// A terminal or literal does not appear on the left hand side (LHS) of a production and thus
// does not need elaboration. (We know what strings and integers are). It is not enclosed in angle brackets.
// A non terminal must appear on the LHS and can appear in the right
// hand side also. It is enclosed in angle brackets. The root non terminal appears only on the LHS.

// A grammar provides us with a structured way to parse input, that is, convert scanned tokens into
// into a form called the parse tree that can be processed by the program.
// In this program, we are trying to convert the input into a course list, which is the tree that
// will be processed.

// This structured way is called recursive descent parsing in which a separate
// parsing method is created for each non terminal.




public class ParsingCourseDisplayer extends CourseDisplayer {

	public static void main(String[] args) {
		fillCoursesInteractively();
		matchTitles();
	}
	static void fillCoursesInteractively() {
        System.out.println("Please enter course info, terminating with a period:");
        // Put a break point below and use F5 to step into parseCourseList
        // which is parser for the root non terminal, CourseList. 
        courses = (new ACourseParser()).parseCourseList();
   }

	
}
