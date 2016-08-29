
/**
 * PACKAGE INFO
 * Code associated with the class dual roles teaching unit in
 * <a href="http://www.cs.unc.edu/~dewan/comp401/current</a>
 * The word and PPT documents created for the unit describe the purpose and motivation for this unit in
 * great depth.
 * Make a copy of this package and also lectures.class_dual_roles.statics
 * and also lectures.class_dual_roles.instances and lectures.class_dual_roles.users. *  
 * Visit the following classes for this praxis in this order:
 *  {@link lectures.class_dual_roles.statics.StaticLoopingFactorialSpreadsheet}
 *  {@link lectures.class_dual_roles.statics.Factorials}
 *  {@link lectures.class_dual_roles.users.StaticFactorialSpreadsheetUse}
 *  {@link lectures.class_dual_roles.users.TwoStaticFactorialSpreadsheetUse}
 *  {@link lectures.class_dual_roles.statics.AnotherStaticLoopingFactorialSpreadsheet}
 * Change the name of the package in the names above to the one in which you are working, e.g. change
 * and use F3 to visit each referenced class.
 * Notice that some of these classes are in the same package and some are not.
 * 
 * SAKAI QUESTION INFO
 * In this praxis we will understand static variables, getters, setters and properties.
 * 
 * Global Variable Access
 * A static variable declared in a class can be changed
 * 			by any method in the class.
 * 			only by certain methods called setters.
 * 
 * Class and Method Access
 * T/F If public classes C1 and C2 are in the same package, a method in C1 can call methods in C2 with public and default access.
 * T/F If public classes C1 and C2 are in different packages, a method in C1 can call methods in C2 with public and default access.
 * T/F If classes C1 and C2 are in the same package, and class C2 has default access, a method in C1 can call public methods  in C2.
 * T/F If classes C1 and C2 are in different packages, and class C2 has default access, a method in C1 can call public methods in C2.
 * T/F A class can import two different classes with the same short name.
 * 
 * DISCUSSIOn INFO
 * Does it makes sense for a class to be private?
 * Given the class {@link lectures.class_dual_roles.statics.Factorials}, 
 * what purpose does {@link lectures.class_dual_roles.users.StaticFactorialSpreadsheetUse} serve?
 * What is the principle of least privilege?
 * Which members (variables and methods) of 
 * {@link lectures.class_dual_roles.statics.StaticLoopingFactorialSpreadsheet}
 * should be public?
 * Why is the purpose of having both classes, StaticLoopingFactorialSpreadsheet and AnotherStaticLoopingFactorialSpreadsheet, 
 * which are copies of each other?
 * What is wrong with a copy and paste solution in which we create two copies of code?
 */
package lectures.class_dual_roles.statics;