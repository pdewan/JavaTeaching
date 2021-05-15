package lectures.class_dual_roles.instances;

import lectures.class_dual_roles.statics.Factorials;
import lectures.interfaces.FactorialSpreadsheet;

/**
 * In general, when you visit a class, you will of course see code performing
 * some function
 * .
 * In addition, you will see comments, which not only describe the code
 * but also the lesson associated with the code.
 * 
 * 
 * This particular class serves the role of being a template for creating multiple 
 * instances with the same behavior, that is, a class with instance variables
 * and methods, rather than static variables and methods.
 * It is assumed you understand those.
 */
public class ALoopingFactorialSpreadsheet 
{
	
	
	/* This multi-line comment is an example of a lesson comment related to
	 * the variable number declared below the comment.
	 * 
	 * It is not so much a comment on the purpose of the variable, 
	 * that information is provided by a comment on the same line as the
	 * variable declaration.
	 * 
	 * It contains a lesson on the nature of a variable declaration that does not
	 * have the word static in it. A lesson comment can provide both definitions
	 * and explanations.
	 * 
	 * Now that we have finished this meta comment about the lesson comment, here is
	 * the lesson comment.
	 * 
	 * Lesson Comment:
	 * 
	 * No static in global variable declaration below, this means these variables are  
	 * created in memory dynamically when we do new ALoopinFactorialSpreadsheet()
	 * to "instantiate" the class. Such a global variable is called an instance variable.	
	 * A static variable is created once the first time the class is accessed by main()
	 * or some method called by main(). It is not by default a final variable,
	 * it value is dynamic (can change) but there is only instance of it is created for a 
	 * particular program.
	 */
	
	int number; //the number whose factorial will be computed
	
	long factorial; // whenever number is changed, this variable will hold its factorial
//	static long factorial; // when asked uncomment this and comment the previous one
	/*
	 * The following is a reproduction of a  question in the Sakai quiz.
	 * At this point you can go to the Sakai quiz and answer it, or you
	 * can note down the answer here and copy it later.
	 * 
	 * In general, questions will be presented after you have had a lesson through
	 * lesson comments and some exercises involving the code.
	 * 
	 * The lesson comment explained instance variables, so you should be able to
	 * answer the following three multiple choice questions.
	 * 
	 * Reproduced Sakai Questions:
	 * 
	 * An instance variable is any variable
	 * 	that does not have the keyword static next to it.
	 *  that is declared outside a method and does not have the keyword static next to it.
	 *	
	 *  
	 * For each instance variable in a class of a program:
	 *   Memory space is allocated at most once.
	 *   Memory space is allocated multiple times,depending on how many times the class 
	 *   is instantiated in the program.
	 * 
	 * For each static variable in a class of a program:
	 *   Memory space is allocated at most once.
	 *   Memory space is allocated multiple times,depending on how many times the 
	 *   class is instantiated in the program.
	 */
	
	/*
	 * No static in method declarations below as these methods access instance variables.
	 * They are called instance methods.
	 * 
	 * In general, a Praxis contains not only lessons but also experiment descriptions.
	 * The following is an example of our first experiment.
	 * 	
	 * Experiment:
	 * 
	 * Make the variable, factorial, static by commenting its declaration
	 * and uncommenting the following line.
	 * 
	 * One convenient way to comment out and comment in a single line is to
	 * click inside the the line and  press CTRL and / together, that is. CTRL-/
	 * 
	 * The same trick can be applied to a block of code if you select the code
	 * and press CTRL-/. 
	 * 
	 * After an experiment, you will need to make observations of the result
	 * of the experiment, and based on these, answer more Sakai questions, that
	 * are not simply deduced from lesson comments, but from the observation
	 * comments.
	 * 
	 * Observation:
	 * 
	 * After you do the commentin-commentout action above, based on your observation
	 * of the result, can this static variable still be accessed by the 
	 * instance methods?
	 * 
	 * Experiment:
	 * 
	 * Now try to determine what happens if you make the method getNumber 
	 * static by doing another commentin-commentout action involving the delaration
	 * of getNumber.
	 * 
	 * Can you still directly access the instance variables? 
	 */	
	
	public int getNumber() { // comment out when asked
//	static public int getNumber() { //uncomment when asked

		return number;
	}
	/*	 
	 * You should now be able to answer the following graded questions based
	 * on your two observations.
	 * 
	 * (T/F) An instance variable can be accessed by only instance methods.
	 * (T/F) A static variable can be accessed by only static methods.
	 */	
	public void setNumber(int newValue) {
		number = newValue ;
		factorial = Factorials.loopingFactorial(number);
	}	
	public long getFactorial() {
		return factorial;
	}
}
/*
 * Now that we understand the concepts of lesson comments, commentout-commentin 
 * experiments, observations and reproduced Sakai direct and
 * observation-based questions, these concepts will not be be accompanied by
 * meta comments in the classes you visit henceforth.
 *
 * 
 * Next visit (use CTRL-click or F3):
 * 
 * {InstantiatingFactorialSpreadsheetUse}
 */


