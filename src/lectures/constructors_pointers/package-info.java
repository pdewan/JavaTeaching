/**
 * In lectures.class_dual_roles.instances we saw a way to create an 
 * instantiatable class - a spreadsheet that calculates factorials. 
 * We will see another spreadsheet, a spreadsheet that computes BMIs.
 * We will use this example to illustrate the concept of special methods
 * called constructors.
 * This package also elaborates on the difference between
 * uninitialized objects and primitives.
 * 
 * 
 * PACKAGE INFO
 * Code associated with the constructors and pointers teaching unit in
 * http://www.cs.unc.edu/~dewan/comp401/current
 * The word and PPT documents created for the unit describe the purpose and motivation for this unit in
 * great depth.
 * As always, make a copy of the package.
 *   
 * Visit the following classes for this praxis. 
 *  {@link lectures.constructors_pointers.UsingConstructors}
 *  {@link lectures.constructors_pointers.ABMISpreadsheet}
 *  {@link lectures.constructors_pointers.PrintingConstructors}
 *  {@link lectures.constructors_pointers.UninitializedVariables}

 * Change the name of the package in the names above to the one in which you are working, 
 * 
 * SAKAI QUESTION INFO
 * 
 * CONSTRUCTORS
 * 
 * (T/F) The syntax of a constructor header is the same as the syntax of an instance-method header.
 * 
 * (T/F) A constructor cannot take parameters.
 * 
 * (T/F) A constructor must take parameters.
 * 
 * (T/F) The source code of a class (written by the programmer) may not contain a constructor.
 * 
 * (T/F) The compiled object code of a class may not contain a constructor.
 * 
 * (T/F) The source code of a class may contain multiple constructors.
 * 
 * (T/F) The object code of a class may contain multiple constructors.
 * 
 * (T/F)  During the life time of an object, multiple constructors can be called  to operate on it.
 * 
 * (T/F) A constructor is executed before a regular instance method of a class.
 * 
 * (T/F) A constructor is executed before the instance variables of a class are initialized.
 * 
 * (T/F) A constructor "constructs" the object, that is, allocates space for the instance  variables of the object in memory?
 
 * INITIALIZATION
 * 
 * (T/F) All operations that can be performed on an initialized primitive variable can also
 * be performed on an uninitialized primitive variable.
 * 
 * (T/F) All operations that can be performed on an initialized object variable can also
 * be performed on an uninitialized object variable.
 * 
 * (T/F) It is not possible to define an uninitialized local variable.
 * 
 * (T/F) It is not possible to access (use) the value of an uninitialized local variable.
 * 
 * (T/F) It is not possible to define an uninitialized global (instance/static) variable.
 * 
 * (T/F) It is not possible to access (use) the value of an uninitialized (instance/static) global variable.
 *  
 * 
 * DISCUSSION INFO
 * What is a named constant?
 * What is a magic number?
 * Can one have a magic string?
 * Why provide constructors in a language?
 * What is an overloaded method/constructor?
 * What are the parameters and body of a constructor inserted by a compiler in object code?
 * Why allow uninitialized static or instance variables?
 * Why do the initialization rules distinguish between local and global variables? 
 * What does a null pointer exception mean exactly?
 * 
 */
package lectures.constructors_pointers;