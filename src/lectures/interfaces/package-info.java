/**
 * We saw earlier that one of the roles of a class is to allow programmers
 * to create new types of values. However, we should not type variables
 * using classes. We should type them using interfaces, the subject of this section.,
 * and every class should implement at least one interface.
 * 
 * PACKAGE INFO
 * Code associated with the constructors and pointers teaching unit in
 * http://www.cs.unc.edu/~dewan/comp401/current
 * The word and PPT documents created for the unit describe the purpose and motivation for this unit in
 * great depth.
 * As always, make a copy of the package.
 *   
 * Visit the following classes for this praxis. 
 * {@link ConceptualType}
 * {@link PolymorphicType}
 * {@link FactorialSpreadsheet}
 * {@link ALoopingFactorialSpreadsheet}
 * {@link ARecursiveFactorialSpreadsheet} *  

 * 
 * SAKAI QUESTION INFO
 * 
 * INTERFACES
 * 
 * (T/F) It s possible for two types in two different languages
 * to implement the same conceptual type.
 * (T/F) The Java type of an object variable determines which operations (methods) can be performed on it.
 * (T/F) If two Java classes implement the same conceptual type, then it is not possible  to distinguish between them based on their external use.
 * (T/F) The Java type of an object variable determines which instances can be assigned to it.
 * (T/F) If Java classes C1 and C2 implement the same conceptual type, and a variable c is declared to be of Java type C1,
 * then c can be assigned an instance of C2.	
 * Which is true:
 * 	An interface contains only bodies of methods 
 * 	    (the code between curly braces after a method header)
 * 	An interface contains both headers and bodies of methods.	
 * (T/F) An interface provides a Java type to unite classes that implement the same conceptual type.
 * (T/F If class C implements interface I, then an instance of C can be assigned to a variable
 * of type I.
 * T/F A polymorphic variable can be assigned instances of 
 * different classes.
 * (T/F) The operations that are allowed on a polymorphic variable by 
 * the compiler depend on the type of the variable 
 * (e.g FactorialSpreadsheet) rather than the class of the object 
 * assigned to it (e.g. ALoopingFactorialSpreadsheet)
 * (T/F) If class C implements I, then C must have a method matching 
 * every method in I.
 * (T/F) If class C implements I, then I must have a method matching 
 * every method in C.
 * (T/F) A polymorphic method has one or more parameters that can be assigned 
 * instances of multiple classes.
 * (T/F) If C implements I, then an instance of C is also considered an 
 * instance of I.
 * INITIALIZATION
 * 
 * 
 * 
 * DISCUSSION INFO
 * 
 * 	If a class is  a factory, what is an interface?
 *  Why are interfaces useful?
 *  What do you think of the rule - every class should implement at least 
 *  one interface?
 *  What do you think of the rule - every object variable should be typed
 *  using an interface rather than a class.
 * 
 *
 */

package lectures.interfaces;