
/**
 * We now see ways and motivation for creating a program with multiple classes.
 * While only one class will be runnable - have a main method - there will be
 * many supporting classes, and we will see a principle for decomposing
 * code into multiple classes and another for protecting the variables and methods in
 * them from external scrutiny. While decomposition has many benefits, it has
 * the disadvantage that the code is distributed. This means the program becomes
 * like the elephant in the story of the blind men and an elephant 
 * (https://en.wikipedia.org/wiki/Blind_men_and_an_elephant),
 * which is understood differently based on which part we focus on. 
 * 
 * Use the F3 (or CTRL/CMD click) to navigate to the mentioned classes and methods and 
 * ALT <- to return back. Such navigation is crucial to understanding multi-component 
 * programs. Better still, you and your partners can have multiple classes
 * open in your editors so that you can view multiple classes simultaneously.
 * Introductory courses tend not to deal large components, so many of you will
 * grow up in this praxis. Expect to struggle, especially if you
 * took Comp 116. Remember, instructors are here to help you. You may want
 * to also have the lecture pdf open.
 * 
 * 
 * PACKAGE INFO   
 * Visit the following classes for this praxis. 
 * 
 * You may want to run 
 * {@link lectures.class_dual_roles.users.StaticFactorialSpreadsheetUse} and look 
 * at all of the classes before following the instructions in them to get an idea of how this
 * multi-class program works.
 *  {@link Factorials}
 *  {@link Permutations}
 *  {@link StaticLoopingFactorialSpreadsheet}
 *  {@link lectures.class_dual_roles.users.StaticFactorialSpreadsheetUse}
 *  {@link lectures.class_dual_roles.users.TwoStaticFactorialSpreadsheetUse}
 *  {@link AnotherStaticLoopingFactorialSpreadsheet}
 * Notice that some of these classes are in the same package and some are not.
 * 
 * SAKAI QUESTION INFO
 * 
 * 
 * A static variable in a class
 * 		must be declared in the main method of a class.
 * 		must not be declared within any method
 * 
 * A static variable in a class
 * 		is a local variable that can be referenced by only the main method
 * 		is a global variable that can be referenced by any method in the class
 * 		is a global variable that can accessed only by public methods in the class
 * A (non final) static variable declared in a class can be changed
 * 		by any method in the class.
 * 		only by certain methods called setters.
 * 		only by the main method.
 * 		only by public methods in the class
 * 
 * T/F A class can import two different classes with the same short name.
 * T/F If public classes C1 and C2 are in the same package, a method in C1 can call methods in C2 with public and default access.
 * T/F If public classes C1 and C2 are in different packages, a method in C1 can call methods in C2 with public and default access.
 * T/F If classes C1 and C2 are in the same package, and class C2 has default access, a method in C1 can call public methods  in C2.
 * T/F If classes C1 and C2 are in different packages, and class C2 has default access, a method in C1 can call public methods in C2.
 * T/F One of the roles of a class is to create walls around its members (variables and methods) 
 * that can restrict access to these members from other classes.
 * T/F One of the roles of a package is to create walls around its component classes to restrict accesses to
 * these classes (and its members) from classes in other packages.
 * 
 * 
 * DISCUSSION INFO
 * What is the principle of least privilege?
 * 
 * What is the principle of separation of concerns?
 * 
 * Why not combine {@link Factorials} and and {@link Permutations}
 * into a single class?
 * 
 * Given the class {@link Factorials}, 
 * what purpose does {@link lectures.class_dual_roles.users.StaticFactorialSpreadsheetUse} serve?
 * Why call it a spreadsheet?
 * Which members (variables and methods) of {@link StaticLoopingFactorialSpreadsheet}
 * should be public?
 * 
 * Why is the purpose of having both classes, StaticLoopingFactorialSpreadsheet 
 * and AnotherStaticLoopingFactorialSpreadsheet, 
 * which are copies of each other?
 * 
 * What is wrong with a copy and paste solution in which we create two copies of code?
 */
package lectures.class_dual_roles.statics.extra;