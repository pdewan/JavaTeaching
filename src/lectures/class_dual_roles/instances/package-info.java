/**
 * 
 */
/**
 * @author Dewan
 *
 */
package lectures.class_dual_roles.instances;
/**
 * Visit this package after lectures.class_dual_roles.statics;
 * 
 * PACKAGE INFO
 * Visit the classes:
 * {@link ALoopingFactorialSpreadsheet}
 * {@link InstantiatingFactorialSpreadsheetUse}
 * {@link PropertiesAnalyzer}
 * {@link AFactorialSpreadsheetPretender}
 * {@link AnotherLoopingFactorialSpreadsheet}
 * 
 * 
 * QUESTION INFO
 * 
 * Instance Variables and Methods
 * 
 * An instance variable is any variable
 * 	that does not have the keyword static next to it.
 *  that is declared outside a method and does not have the keyword static next to it.
 * For each instance variable in a class of a program:
 *   Memory space is allocated at most once.
 *   Memory space is allocated multiple times,depending on how many times the class is instantiated in the program.
 * For each static variable in a class of a program:
 *   Memory space is allocated at most once.
 *   Memory space is allocated multiple times,depending on how many times the class is instantiated in the program.
 * (T/F An instance variable can be directly accessed (without using a dot in the access) by only instance methods.
 * (T/F) A static variable can be directly accessed (without using a dot in the access) by only static methods.
 * (T/F) It is possible to call a static method directly on a class without instantiating it.
 * (T/F) It is possible to call an instance method directly on a class without instantiating it.  	
 * (T/F) A primitive value such as 5 is not an instance of any class.
 * (T/F) One of the roles of a class is to define a new type and an infinite set of values (called instances) of that type.
 * 
 * Properties
 * 
 * The names and types of the instance properties defined by a class depend on:
 * 	Only public and non public instance methods of the class.
 *  Only public instance methods of the class.
 *  Only  instance variables of the class.
 *  Instance variables and public instance methods of the class.
 
 *  
 *  If a class has an instance property P of type T, then it must have:
 *    An instance getter, that is, an instance method with name getP taking no parameter and returning a value of type T.
 *    An instance variable named P of type T.
 *    All of the above
 *    None of the above

 *  If a class has a stored instance property P of type T, then it must have:
 *    An instance getter, that is, an instance method with name getP taking no parameter and returning a value of type T.
 *    An instance variable of type T that directly stores the value of the property.
 *    All of the above
 *    None of the above
 *    
 *  If a class has an editable property P of type T, then it must have:
 *    An instance setter, that is, an instance method with name setP taking a parameter of type T and returning a void.
 *    A non final instance variable named P of type T.
 *    All of the above
 *    None of the above
 *    
 *  
 * 
 * DISCUSSION INFO
 * Think of operations that you can perform on a 
 * car (howManyMilesDriven) and on a car factory (howManyCarsProduced). 
 * Draw analogies between these operations and static and instance methods.
 * Draw analogies between a car/factory and class/instance.
 * Does it make sense to allow instance methods to access static variables?
 * Does it make sense to allow static methods to access instance variables?
 * What are the pros and cons of making a property computed instead of stored?
 * 
 */
