package lectures.inheritance;
/**
 * Again first study and run the program and try to understand what 
 * it does on your own.
 * 
 * It declares and defines a method that is already inherited from its superclass's
 * superclass: addElement(). The @Override annotation indicates this fact.
 * 
 * As the name indicates, this method overrides (replaces) the inherited method 
 * for its instances. 
 * 
 * However, the overridden method can still be accessed using the "super" prefix.
 * 
 */
public class AnInheritingStringSet extends AnInheritingStringDatabase // extending an extended class
	implements InheritingStringDatabase { // same interface as implemented by the superclass

	public AnInheritingStringSet() {
		super(); 
//		super.super();
		uselessVariable = 1;
//		System.out.println("AnInheritingStringSet constructor called");
//		super();
    }
	/*
	 * Redeclaration of inherited addElement()
	 */
	@Override
	public void addElement(String element) {
		/*
		 * Set break point below.
		 */
		if (isFull()) {
			System.out.println("Adding item to a full history");
		} else if (!member(element)) { // add only if the element is not a member
			/*
			 * click on addElement below and hit F3 to see where the call
			 * on super is defined.
			 */
			super.addElement(element);
			/*
			 * what if we called addElement without super?			 * 
			 */
//			addElement(element); 
		}
	}
	
	 public static void main (String[] args) {		 
    	InheritingStringDatabase aStringSet = new AnInheritingStringSet();
    	System.out.println (aStringSet.size()); // size() is implemented in ABaseStringHistory
   
//    	StringDatabase aStringSet = new AStringDatabase(); 
    	/*
		 * click on manipulateDatabase and hit F3 to see where the call is defined
    	 */
    	manipulateDatabase(aStringSet); 
    	/*
    	 * What if we called the static manipulateDatabase with "super"? 
    	 * Is that legal in Java? Try uncommenting this to see.
    	 */
//    	super.manipulateDatabase(aStringSet);
	  }
	 
}
/*
.
 */
/*
 * 
 * Set a break point at the start of addElement and Step Over (F6) the 
 * statements to see which path is taken when main is called for each added
 * element.
 * 
 * COLLECTIONS
 * 
 * Adding an item a second time to an instance of AnInheritingStringSet
 * results in:  
 * 	(a) an exception.
 * 	(b) the addition being ignored.
 * 	(c) a duplicate item.
 * 
 * INHERITING ANCESTOR METHODS
 *  
 * Look at the call to size() in main.
 * 
 * If object a is an instance of class C, and C is a subclass of E, and E
 * is a subclass of F, then it is  possible to invoke on a:
 * 	(a) only the methods implemented in C.
 * 	(b) only the methods implemented in  C and E.
 * 	(c) only the methods implemented in E. 
 * 	(d) methods implemented in C, E and F.
 *
 * REDECLARING ANCESTOR METHODS
 * 
 * In the following 8 questions, assume c is an instance of C, 
 * e is an instance of E, C is a subclass of E,
 * and both C and E define a method header m.
 * 
 * (T/F) It is illegal to call m on c.
 * 
 * (T/F) It is illegal to call m on e.
 *  
 * (T/F) Calling m on c results in call of the implementation of m in C.
 * 
 * (T/F) Calling m on c results in call of the implementation of m in E.
 * 
 * (T/F) Calling m on e results in call of the implementation of m in C.
 * 
 * (T/F) Calling m on e results in call of the implementation of m in E.
 * 
 * (T/F) Class C can call the implementation of m in E.
 * 
 * (T/F) Class E can call the implementation of m in C.
 * 
 */
/*
 * 
 * CLASS OBJECT
 * 
 * Go to the definition of toString() in ABaseStringHistory.
 * 
 * Comment out the current return statement and uncomment the one below it,
 * which uses super.toString().
 * 
 * ABaseStringHistory does not explicitly extend any class.
 *  
 * To which class is super referring?
 * 
 * Set a breakpoint at the new return statement.
 * 
 * Debug-Run the program again. When you stop at the break point,
 * and step into (F5) the super call in the return statement.
 * 
 * In which class do you land? (You may not be able to see the source code of 
 * the class if you do not have a jdk installed, but you should be able
 * to see the name of the class in Eclipse.) 
 * 
 * Which is true:
 * 	(a) The predefined class, Object, is the immediate superclass of any class
 * 			that does not explicitly extend a class.
 * 	(b) The predefined class, Class, is  the immediate superclass of any class
 * 			that does not explicitly extend a class.
 * 
 * (T/F) The method toString() is implemented in the class Object.
 * 
 * Look at the stack of calls in the Debug window. 
 * 
 * You can keep doing step-return (F7) until you hit the main class.
 * 
 * Which statement in the main class led to the call of toString()? (If you were doing
 * step-return the whole way, you will land at the line following that statement)
 * 
 * (T/F) System.out.println(o) calls the toString() method on o.  
 * 
 * Comment out the super.toString() call and uncomment the original when you are done.
 * 
 */
/*
 * 
 * REDECLARING VARIABLES
 * 
 * Uncomment the declarations of the "size" variable in AnInheritingStringDatabase.
 * 
 * Now we have two declarations of this variable,
 * 
 * Run that program again and look at the output - the member() and removeElement() no
 * longer work properly. 
 * 
 * Can you explain why?
 * 
 * Set a break point at the start of the addElement() method in ABaseStringHistory.
 * 
 * Set a breakpoint also on at the start of the indexOf method in AnInheritingStringDatabase.

 * When the program stops at the addElement() method, hover over the 
 * value of the size variable referenced in the method.
 * 
 * What value does it have when the method finishes? 
 * 
 * Press F8 to resume the program, until you hit the breakpoint in indexOf().
 * 
 * When the program stops in the indexOf() method, hover over the size
 * variable in the method declaration. 
 * 
 * What value is it at the start of  the method? 
 * 
 * Can you explain why it is different? Look at the variables window in the debugger
 * at the variables of the instance of AnInheritingStringDatabase (under "this").
 * 
 * How many size variables does it have and what are their values?
 * 
 * Comment out the duplicate size variable declaration and
 * debug-run the program again.
 *  
 * When the program stops at indexOf, hover over the size 
 * variable declaration again in the method
 * and look at its value again.

 * Will you ever re-declare a variable again in a subclass?
 * 
 * In the following 6 questions, assume c is an instance of C, 
 * e is an instance of E, C is a subclass of E,
 * and both declare a variable v. 
 * 
 * (T/F) It is illegal for C to declare v.
 * 
 * (T/F) c has a single variable named v.
 * 
 * (T/F) c has multiple variables named v.
 * 
 * (T/F) Methods declared in class C refer to the variable defined in C.
 * 
 * (T/F) Methods declared in class C refer to the variable defined in E. 
 *  
 * (T/F) Methods declared in class E refer to the variable defined in E. 
 * 
 */
/*
 * PRIVATE VS PROTECTED VS DEFAULT ACCESS
 *
 * For this part, you need to know to look for compile errors in classes
 * in this package and the package lectures.inheritance.extra.  
 * 
 * You will play with the access of the variable "uselessVariable" declared in
 * class ABaseStringHistory by commenting and uncommenting appropriate
 * alternate declarations.
 * 
 * In reaction to changes to this access, you will determine in which classes
 * (in these two packages) compile errors arise, indicating that the variable
 * is no longer visible.
 * 
 * You can go to the declaration of uselessVariable and press CTRL SHIFT G
 * to see all of its references, or place your cursor in it, right-click and
 * select References->Workspace.
 * 
 * The variable is accessed in the several places. It is accessed in the three
 * classes we have seen so far, all of which are in this package. 
 * 
 * It is also accessed in AnIndependentClassInSamePackage, declared in this
 * package, which is not a subclass of ABaseStringHistory.
 * 
 * In addition, it is accessed in 
 * lectures.inheritance.extra.AnObservableStringHistory and
 * lectures.inheritace.extra.AnIndependentClassInAnotherPackage. The former is 
 * a subclass of AABaseStringHistory while the latter is not.
 * 
 * Currently the access is public, which makes the variable visible in all
 * classes in which it is accessed. 
 * 
 * Change the access to private, protected, and default, and observe the errors.
 * After each change, save the file so that Java rebuilds the project and you see
 * the errors.
 * 
 * A class C can access private variables of class D only if: 
 *  (a) C and D are the same.
 *  (b) C is a subclass of D (directly or indirectly).
 *  (c) C is in the same package as D.
 *  (d) none of the above
 *  
 * A class C can access protected variables of class D only if:  
 *  (a) C is a subclass of D (directly or indirectly).
 *  (b) C is in the same package as D.
 *  (c) C is a subclass of D (directly or indirectly) or C is in
 *      the same package as D
 *  (d) C and D are the same
 *  
 * A class C can access variables declared in class D with default access only if:  
 *  (a) C and D are the same.
 *  (b) C is a subclass of D (directly or indirectly).
 *  (c) C is in the same package as D.
 *  (d) C is a subclass of D (directly or indirectly) or C is in
 *      the same package as D.
 *  
 * Return the variable to public access once you're done.
 *
 * CONSTRUCTORS AND SUBCLASSING
 * 
 * Uncomment the println() calls in the parameterless constructor in 
 * ABaseStringHistory, AnInheritingStringDatabase, and AnInheritingStringSet
 * and run this program and observe the output.
 * 
 * If C is a subclass of E, and an object c of type C is instantiated, then:
 *  (a) a constructor of only C is called.
 *  (b) a constructor of only E is called.
 *  (c) a constructor of C and E are called. 
 * 
 * Comment out the first call to super() and uncomment the first call to
 * super(2) in the constructor of AnInheritingStringDatabase.
 * 
 * Run the program or use F3 to go to the definition of super(2).
 * 
 * (T/F) A constructor in a class can  determine which overloaded
 *  constructor of its superclass is called by providing appropriate parameters to
 *  a super call that does not specify a method name.
 *  
 *  Comment out the first call to super(2) and uncomment the second one. 
 *  What happens?
 *  
 *  Comment out the super(2) call.
 *  
 * (T/F) A super() call can be invoked anywhere in a constructor.
 * 
 * Uncomment the super(2) call in the clear() method. What happens? 
 * 
 * (T/F) A superclass constructor can be called from any method of a subclass.
 * 
 * Comment out this super(2) call.
 * 
 * Now you have no super calls in AnInheritingStringDatabase.
 * 
 * Run the program.
 * 
 * Is the constructor of ABaseStringHistory called? If so, which one?
 * 
 * Comment out the parameterless constructor in ABaseStringHistory and go to
 * AnInheritingStringDatabase. What happened?
 * 
 * If no super() call is made in a constructor:
 * 	(a) an exception is thrown.
 * 	(b) no superclass constructor is called.
 *  	(c) a call to the parameterless super constructor is automatically added as
 *  the first statement in the constructor. 
 *  
 *  Uncomment the parameterless constructor in ABaseStringHistory.
 *  
 * Comment out the entire constructor in AnInheritingStringDatabase so
 * we have no constructor in this class.
 * 
 * Run the program. Is the superclass constructor called?
 * 
 * (T/F) If a class has no constructor, then Java inserts into its object code
 * a constructor with no parameters that makes a call to a constructor with
 * no parameters in its superclass.
 * 
 * 
 * ORDER OF INITIALIZATION
 * 
 * To really understand what is going on, put a break point on the first statement of 
 * the constructor in AStringSet and use f5 (Step into) to trace the path to the constructor
 * in ABaseStringHistory noting the order in which the variables and constructors are called.
 * Step over (F6) any println calls so that you do not get pulled into that code (if you
 * accidentally step into a println call, just step return- F8).
 * 
 * What is the order of initialization in this process?
 * 
 */
