package lectures.class_dual_roles.statics;
/*
 * In general, when you visit a class, you will of course see code performing
 * some function
 * .
 * In addition, you will see comments, which not only describe the code
 * but also the lesson associated with the code.
 */
/**
 * LOOPING and RECURSIVE FACTORIAL
 * This class shows how one can compute a factorial, both
 * in a loop and recursively. 
 * There is no main method here.
 * The methods in this class are meant to be called directly or indirectly
 * by a main method in some other class.
 * As this class does not have a main method, do not try to run it.
 */

public class Factorials // public class access
//class Factorials // default class access, no access keyword
/*
 * Lesson Comment
 * 
 * ACCESS
 * We study here the kind of access classes have to each other when they are in 
 * different packages.
 * 
 * PUBLIC vs. DEFAULT ACCESS
 * The public keyword before a class or method (or variable) declaration gives 
 * it public access. If we omit the keyword, then we give it default access 
 * (which is different from private access).
 */
/*
 * Experiment
 * In this class declaration, what happens if you remove the keyword public 
 * to specify default class access rather than public access. 
 * Perform this experiment by commenting out the first line of the class
 * declaration and uncommenting out the second line.
 * 
 * (Please do not put the keyword protected, it is banned from discussion until
 * we learn inheritance.) 
 *
 */

/*
 * Obervations?
 *  
 * Do you get any compile errors in this file or in the classes
 * {StaticLoopingFactorialSpreadsheet}, which is the same package 
 * as this class and
 * {lectures.class_dual_roles_users.TwoStaticFactorialSpreadsheetUse},
 * which is in a separate package. 
 * You can hover over an error marker to see the corresponding message
 * and click on it to see a possible fix. 
 */
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
 */
/*
 * 
 *  
 * T/F If classes C1 and C2 are in different packages, a method in C1 can call 
 * public methods in C2 if C2 has public access.
 * 
 * T/F If classes C1 and C2 are in different packages, a method in C1 can call 
 * public methods in C2 if C2 has default access.
 * 
 * T/F If classes C1 and C2 are in the same package, a method in C1 can call 
 * public methods in C2 if C2 has default access
 * 
 * T/F One of the roles of a package is to create walls around its component 
 * classes to restrict accesses to these classes (and its members) from 
 * classes in other packages.
 * 
 */
{
	/**
	 * Experiment:
	 * 
	 * In the following method declaration, what happens if you remove the 
	 * keyword public to give default access to the method loopingFactorial.
	 * What happens if you choose private instead?
	 * Again choose the commentout-commentin mechanism to do the experiment
	 * 	
	 */	
	public static long loopingFactorial(int aNumber)
//	static long loopingFactorial(int aNumber) // default access to loopingFactorial
//	private static long loopingFactorial(int aNumber) // default access to loopingFactorial
	
	/**	 
	 * Do you get any compile errors in this file or in the class
	 * {StaticLoopingFactorialSpreadsheet} which is in the same pacdkahe?
	 * You can hover over an error marker to see the corresponding message.	
	 * 
	 * T/F If classes C1 and C2 are in the same package 
	 * a method in C1 can call methods in C2 with default access. 
	 * 
	 * T/F If classes C1 and C2 are in the same package 
	 * a method in C1 can call  methods in C2 with private access.
	 * 
	 * T/F One of the roles of a class is to create walls around its component 
	 * methods to restrict accesses to these methods from 
	 * classes in the same package.
	 */	

	{
		long aFactorial = 1;
		while (aNumber > 0) {
			aFactorial *= aNumber;
			aNumber -= 1;
		}
		return aFactorial;

	}
	public static long recursingFactorial(int aNumber) {
		/*
		 * Base case, this means no recursive call takes place.
		 * There can be multiple base cases in a recursive method
		 */
		if (aNumber <= 1) {
			return 1;
		}
		/*
		 * Recursive case
		 */
		return aNumber*recursingFactorial(aNumber-1);		
	}
}
// Go next to: {@Permutations} (F3 or CTRL/Command Click on its name)

