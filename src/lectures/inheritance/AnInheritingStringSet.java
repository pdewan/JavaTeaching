package lectures.inheritance;
/**
 * This class illustrates the concept of sets, method overriding.
 */
public class AnInheritingStringSet extends AnInheritingStringDatabase // extending an extended class
    // comment out the next line when asked
	implements InheritingStringDatabase // same interface as implemented by the superclass, need not be explicitly mentioned
	{ 
/*
 * Since AnInheritingStringSet extends AnInheritingStringDatabase,
 * and AnInheritingStringDatabase extends ABaseStringHistory,
 * AnInheritingStringSet is a direct/child/immediate subclass/subtype of AnInheritingStringDatabase
 * an indirect/descendant subclass/subtype of ABaseStringHistory, and a subclass/subytype
 * of both AnInheritingStringDatabase and ABaseStringHistory.
 * 
 * 
 * Similarly, AnInheritingStringDatabase is a direct/parent/immediate superclass of 
 * AnInheritingStringSet,  ABaseStringHistory is an indirect/ancestor superclass
 * of AnInheritingStringSet, both AnInheritingStringDatabase and ABaseStringHistory
 * are superclasses/supertypes of AnInheritingStringSet, and AnInheritingStringDatabase
 * is the closer superclass.
 *   
 * 
 * 
 * If class A extends B, and B is a subclass of C then A is a:
 *   (a) subclass of B
 *   (b) direct/child subtype of B.
 *   (c) direct/child subtype of C.
 *   (d) indirect/descendant subtype of B.
 *   (e) indirect/descendant subtype of C.
 *   (f) closer subclass of C (in comparison to B)
 *
 */
/*
 * Look at the interface of this class:
 * 
 * (T/F) If class C1 implementing I1 is a subclass of C2 implementing I2, then I2
 * must be a subtype of I1.	
 */
	
	public AnInheritingStringSet() {
		super(); 
//		super.super();
		uselessVariable = 1;
//		System.out.println("AnInheritingStringSet constructor called");
//		super();	
    }
	
	@Override
	public void addElement(String element) {
		/*
		 * Set break point below when asked.
		 */
		if (isFull()) {
			System.out.println("Adding item to a full history");
		} else if (!member(element)) { // add only if the element is not a member
			
			super.addElement(element);
			/*
			 * what if we called addElement without super?			 * 
			 */
//			addElement(element); 
		}
	}
/*
 *
 * Click on the addElement in super.addElement() and hit Command/CTRL-Click to see 
 * where the call on super is defined.
 *
 * super.addElement() in AnInheritingStringSet refers to an addElement() method 
 * in:
 *    (a)AnInheritingStringSet
 *    (b)the direct/parent superclass of AnInheritingStringSet.
 *    (c)an indirect/ancestor superclass of AnInheritingStringSet.
 * 
 * The addElement() methods in AnInheritingStringSet and ABaseStringHistory
 * have the same:
 * 	   (a) name
 * 	   (b) parameter(s)
 *     (c) header
 * 
 * (T/F) A class can implement two methods with the same header.
 * (T/F) A class and a superclass can implement two methods with the same header.
 * 
 * Uncomment the addElement() method in the direct superclsas of this class.
 * 
 * Click again on the addElement in super.addElement() and hit Command/CTRL-Click to see 
 * where the call on super is defined.
 *
 * Comment out the method again in the direct superclass. 
 * 
 * If a method with header m is implemented in class A, its direct super class
 * B, and its indirect super class, C, then call to super.m() in A calls the
 * implementation of m() in:
 *     (c) A
 *     (b) B
 *     (c) C
 *   
 * (T/F) The call super.m() in class C refers to the implementation of m in the:
 *    (a) closest superclass of C that implements m.
 *    (b) furthest superclass of C that implements m.
 */
	
	 public static void main (String[] args) {		 
    	InheritingStringDatabase aStringSet = new AnInheritingStringSet();
    	System.out.println (aStringSet.size()); // size() is implemented in ABaseStringHistory
   
//    	StringDatabase aStringSet = new AStringDatabase(); 
    	/*
		 * click on manipulateDatabase and hit F3/CTRL/CMD Click to see where 
		 * the call is defined
    	 */
    	/*
    	 * set break point
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
 * INHERITING ANCESTOR METHODS
 *  
 * Based  on the call to size() in main:
 * 
 * If object, O, is an instance of C, then it is possible to invoke on O public 
 * methods declared in:
 *   (a) C,
 *   (b) C's direct superclass
 *   (c) C's indirect superclasses
 *   
 */
/* 
 * 
 * SETS
 * 
 * Run the main method, look at the output, and study the addElement() method
 * defined here.
 * 
 * Adding an item a second time to an instance of AnInheritingStringDatabase
 * results in:  
 * 	(a) an error.
 * 	(b) the addition being ignored.
 * 	(c) a duplicate item. 
 * 
 * Adding an item a second time to an instance of AnInheritingStringSet
 * results in:  
 * 	(a) an error.
 * 	(b) the addition being ignored.
 * 	(c) a duplicate item.
 */
/*
 *  REDECLARING ANCESTOR METHODS
 *  
 * Set the break point in main and use Step Into (F5) and Step Over (F6) to see 
 * which path is taken when main is called for each added element.
 * 
 * If O is an instance of A, and mutltiple implementations of m() exist in the super type
 * hierarchy, then calling m() on O:
 * 
 * (a) gives a compile time error.
 * (b) gives a runtime error.
 * (c) calls all implementations of m() - the one in A and the ones in A's superclasses.
 * (d) calls the implementation of m() in the furthest superclass of A.
 * (e) calls the implementation of m() in A, if it exists, or the 
 * implementation of m() in the closest superclass of A
 * 
 * (T/F) A subclass can control the nature of inheritance by overriding an
 * inherited method, that is, replacing the implementation of an inherited with
 * its own one.
 * 
 * 
 * If O is an instance of A, and a method with header m() is implemented in
 * A and one or more of its superclasses, then it *not* possible for a method in A to call the
 * implementation of m() in:
 * 
 * (a) A
 * (b) any superclass of A.
 * (c) none of the above
 * 
 * 
 * Comment out the implements clause in this class. Does the line:
 * 
 *    InheritingStringDatabase aStringSet = new AnInheritingStringSet();
 *    
 *  in the main method give an error?
 *  
 * (T/F) A class is implicitly considered to implement the interfaces implemented by its superclasses.
 * (T/F) A subclass can control the nature of inheritance by disabling the invocation
 *  of an inherited method declared in an interface of a superclass.
 * 
 */

/*
 * ROOT SUPERCLASS
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
 * Stepping into super.toString() in ABaseStringHistory
 *   (a) gives an error
 *   (b) executes the toString() method in class Object
 *   (c) does nothing
 *   
 * (T/F) The method toString() is implemented in the class Object.
 * 
 * A class that has no superclass is a root superclass.
 * 
 * Which is true:
 * 	(a) The predefined class, Object, is the immediate superclass of any class
 * 			that does not explicitly extend a class. 
 *  (c) A class that does not explicitly extend any class is a root superclass.
 * 
 * 
 * Look at the stack of calls in the Debug window. 
 * 
 * You can keep doing step-return (F7) until you hit the main class.
 * 
 * Which statement in the main class led to the call of toString()? (If you were doing
 * step-return the whole way, you will land at the line following that statement)
 * 
 * System.out.println(o) calls 
 * 	  the toString() method on o. 
 *    the println() method on o.
 *    getter() methods of o.
 *    none of the above
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
 * Now we have two declarations of this variable, one in AnInheritingStringDatabase
 * and one in its superclass.
 * 
 * Run that program again and look at the output.
 * 
 * Redeclaring the size variable in AnInheritingStringDatabase causes the following
 * methods to not work:
 *    a) member()
 *    b) removeElement()
 *    c) addElement()
 *    d) none of the above.
 *
 * Set a break point at the start of the addElement() method in ABaseStringHistory.
 * 
 * Set a breakpoint also on at the start of the shiftUp method in AnInheritingStringDatabase.

 * When the program stops at the addElement() method, hover over the 
 * value of the size variable referenced in the method.
 * 
 * What value does it have when the method finishes?
 * 
 * (T/F) At the end of the addElement() method of ABaseStringHistory, the 
 * value of the size variable referenced by the method is 0.  
 * 
 * Press F8 to resume the program, until you hit the breakpoint in shiftUp().
 * 
 * When the program stops in the shiftUp() method, hover over the size
 * variable in the method body. 
 * 
 * What value is it at the start of  the method? 
 * 
 * (T/F) At the start of the shiftUp() method of AnInheritingStringDataabsese the
 * value of the size variable referenced by the method is  0 when 
 * AnInheritingStringDatase redeclares the variable.
 * 
 * Look at the variables window in the debugger
 * at the variables of the instance of AnInheritingStringDatabase (under "this").
 * 
 * How many size variables does it have and what are their values? 
 * 
 *  The physical structure of AnInheritingStringDatabase has:
 *  (a) only one size variable,
 *  (b) two size variables, whose values are always the same.
 *  (c) two size variables, whose values can diverge.
 *  
 *  (T/F) The physical structure of an object cannot have
 *  two variables with the same name.
 *  
 *  (T/F) Methods declared in class C can refer to variables declared in its subclasses.
 *  
 *  
 *  
 * Comment out the duplicate size variable declaration.   
 *
 * Will you ever re-declare a variable again in a subclass?
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
 */
/*
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
 * (T/F) A constructor in a class can determine which overloaded
 *  constructor of its superclass is called by providing appropriate parameters to
 *  a super call.
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
 */
/*
 * 
 * ORDER OF INITIALIZATION
 * 
 * To really understand what is going on, put a break point on the first statement of 
 * the constructor in AStringSet and use F5 (Step into) to trace the path to the constructor
 * in ABaseStringHistory noting the order in which the variables and constructors are called.
 * 
 * Step over (F6) any println calls so that you do not get pulled into that code (if you
 * accidentally step into a println call, just step return- F8).
 * 
 * if you reach class Object, Step return (F7)
 * 
 * If you reach an initializing variable declaration such as 
 *       int uselessVariable2 = 0;
 * Step over (F6)
 * 
 * Which are true:
 * 
 * The initialization declaration of AnInheritingStringDatabase
 * 	AnInheritingStringDatabase is executed:
 *     (a) before the initializing declarations in 
 *     		ABaseStringHistory is executed.
 *     (b) before the constructor of  AnInheritingStringDatabase is executed
 *     (c) before the constructor of ABaseStringHistory is executed.  
 * 
 * (T/F) Java executes the constructor of a class after before executing the constructors of its superclasses.
 * (T/F) Java executes the initialization declaration of a class before executing its constructors.
 * (T/F) Java executes the initialization declaration of a class before executing the initialization
 * declarations of its superclassses.
 * (T/F) Java executes the initialization declaration of a class before executing the constructors of its superclasses.
 * 
 * Look carefully at the initialization declarations of anotherUselessVariable
 * 
 * (T/F) The initialization declaration of a class can refer to a variable
 * declared in a superclass.
 * 
 * (T/F) The initialization declaration of a class should be executed after the variables of its
 * superclasses have been initialized by the superclass declarations or constructors.
 */
/*
 * Next class StringHistoryFactory
 */

