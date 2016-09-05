package lectures.class_dual_roles.instances;
/**
 * Here we will understand the Java Beans standard and the underlying concepts of stateful objects.
 * Java Beans is an industry standard formally defined by these imported classes and others.
 * It defines the notion of  Beans and properties, which are more abstract than  Objects, methods
 * and instance variables.
 * 
 * A Bean is an object with properties,
 * This class helps you define what a property is.
 * 
 * We see here only instance properties - we can similarly define class properties.
 * 
 */
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import lectures.constructors_pointers.ABMISpreadsheet;
/**
 * 
 * The goal of this exercise is to formally getters and setters through the concept of
 * properties, which are not be mistaken with instance variables.
 *
 */
public class PropertiesAnalyzer {
	/*
	 * 	 
	 * The following method uses the imported Bean classes to
	 * extract properties through getters and setters. You do no have to understand how it
	 * works, though the curious may want to look at it at leisure.
	 * 
	 * 	 
	 */
	public static void printProperties (Object anObject) {
		try {
			Class aClass = anObject.getClass();
			BeanInfo aBeanInfo = Introspector.getBeanInfo(aClass);
			PropertyDescriptor[] aPropertyDesciptors = aBeanInfo.getPropertyDescriptors();
			System.out.println ("Properties defined by:" + aClass.getSimpleName());
			for (PropertyDescriptor aPropertyDescriptor:aPropertyDesciptors) {
				String aName = aPropertyDescriptor.getName();
				/*				 
				 * Every object has this inherited property, we want to ignore inheritance issues right now
				 * 
				 */
				if ("class".equals(aName)) { 
					continue;
				}
				String aType = aPropertyDescriptor.getPropertyType().getSimpleName();
				boolean isEditable = aPropertyDescriptor.getWriteMethod() != null;
				String aNameAndType = aName + ":" + aType;
				String anEditable = isEditable?"Editable ":"ReadOnly ";
				System.out.println (anEditable + aNameAndType);
				
			}
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
	}
	/*
	 * This exercise will help you answer the following questions by printing the
	 * names and types of the properties of various versions of this class.
	 * In some runs, there will be no change; in others, there will be.
	 * 
	 * Questions: 
	 * The names and types of the instance properties defined by a class depend on:
	 	* Only public and non public instance methods of the class.
	 	* Only public instance methods of the class.
	 	* Only  instance variables of the class.
	 	* Instance variables and public instance methods of the class.
	 * 	
	 * Run this program multiple times and think about what will happen before you test each change.
	 * 1. Run the program without changes.
	 * 
	 * 2. Change the name of the instance variables, number to n in ALoopingFactorialSpreadsheet
	 *  Does the property description change and if so how?
	 *  
	 * 3. Change the name of the method getNumber to getN. Does the property description change and if so how?
	 * 
	 * 4. Change the name of the method getN to obtainNumber(). Does the property description change and if so how?
	 * 
	 * 5. Comment out the setNumber method? Does the property description change and if so how?
	 * 
	 * 6. Uncomment the method to remove compile errors. 
	 * Comment out the method getFactorial();Does the property description change and if so how?
	 * 
	 * 7. Add an extra parameter, say int i, to getNumber. Does the property description change and if so how?
	 * 
	 * 8. Remove the parameter. 
	 * Now add an extra parameter, say int i, to setNumber. Does the property description change and if so how?
	 * 
	 * 9. Remove both parameters. Does the property description change and if so how?
	 * 
	 * 10. Restore the original parameter, but give it a different name, say n. Does the property description change and if so how?
	 * 
	 * 11. Remove the keyword public from the headers of getNumber() and setNumber(). Does the property description change and if so how?
	 *	
	 */
	public static void main (String[] args) {
		printProperties(new ALoopingFactorialSpreadsheet());
		/*		 
	     * Uncomment the code below.  Click on name and press F3 to visit he the definition
	     * of this pretender. What properties do you expect? What do you get?	
		 */
// 		printProperties(new AFactorialSpreadsheetPretender());
 		/* 				 
	     * Uncomment the the code below. Click on name and press F3 to visit he the definition.
	     * What properties do you expect, what do you get?
	     */
//		printProperties(new AnotherLoopingFactorialSpreadsheet());
	}
}
// Go to
