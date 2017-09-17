package lectures.class_dual_roles.instances;


import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import lectures.constructors_pointers.ABMISpreadsheet;

/**
 * Here we will understand the Java Beans standard and the underlying concepts of 
 * stateful objects.
 * Java Beans is an industry standard formally defined by the imported classes 
 * and others.
 * It defines the notion of  Beans and properties, which are more abstract than 
 * Objects, methods and instance variables.
 * 
 * A Bean is an object with properties,
 * This class helps you define what a property is.
 * 
 * We see here only instance properties - we can similarly define class properties.
 * The goal of this class is to formally getters and setters through the concept of
 * properties, which are not be mistaken with instance variables. 
 *
 */
public class NextTimePropertiesAnalyzer {	
	/** 	 
	 * The following method uses the imported Bean classes to
	 * extract properties of the object passed to it.
	 * It used getters and setters of the object to determine
	 * the properties. You do no have to understand how it
	 * works, though the curious may want to look at it at leisure.	 
	 * Extracting properties is an example of introspection. 	 
	 */
	public static void printProperties (Object anObject) {
		try {
			Class aClass = anObject.getClass();
			BeanInfo aBeanInfo = Introspector.getBeanInfo(aClass);
			PropertyDescriptor[] aPropertyDesciptors = aBeanInfo.getPropertyDescriptors();
			System.out.println ("Properties defined by:" + aClass.getSimpleName());
			for (PropertyDescriptor aPropertyDescriptor:aPropertyDesciptors) {
				String aName = Character.toUpperCase(
						aPropertyDescriptor.getName().charAt(0)) +
						aPropertyDescriptor.getName().substring(1);
				/*				 
				 * Every object has the (inherited) property, Class",
				 * we want to ignore inheritance issues right now
				 * 
				 */
				if ("Class".equals(aName)) { 
					continue;
				}
				System.out.println ("Read method:" + aPropertyDescriptor.getReadMethod());
				System.out.println ("Write method:" + aPropertyDescriptor.getWriteMethod());
				String aType = aPropertyDescriptor.getPropertyType().getSimpleName();
				boolean isEditable = aPropertyDescriptor.getWriteMethod() != null;
				printComponent(aName, aType, isEditable);
				
			}
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
	}
	/** 	 
	 * The following method uses the imported Java reflection classes to
	 * You do no have to understand how it
	 * works, though the curious may want to look at it at leisure.	  	
	 * Extracting variables is an example of reflection.  
	 */
	public static void printVariables (Object anObject) {
		Class aClass = anObject.getClass();
		Field[] aFields = aClass.getDeclaredFields();			
		System.out.println ("Variables defined by:" + aClass.getSimpleName());
		for (Field aField:aFields) {
			String aName = aField.getName();				
			String aType = aField.getType().getSimpleName();
			boolean isEditable = !Modifier.isFinal(aField.getModifiers());
			printComponent(aName, aType, isEditable);			
		}
	}
	public static void printComponent (String aName, String aType, boolean isEditable) {
		String aNameAndType = aName + ":" + aType;
		String anEditable =  isEditable?"Editable ":"Readonly ";;
		System.out.println (anEditable + aNameAndType);
	}
	
	/**
	 * The main method prints the names and types of properties of instancesof
	 * various classes.
	 */
	
	public static void main (String[] args) {
		printVariables(new ALoopingFactorialSpreadsheet());
		printProperties(new ALoopingFactorialSpreadsheet());
		
		/*	     
	     * Run the main method and study the output.	
	     * 
	     * The set of global variables a method accesses  
	     * includes each variable the method reads or writes.
	     * 	  
	     * (T/F) If we ignore case, for each property in ALoopingFactorialSpreadsheet 
	     * there is an (instance) variable with the same name. 
	     * 
	     * (T/F) The number of properties in 
	     * ALoopingFactorialSpreadsheet is the same as the number of variables in it.	
	     * 
	     * The set of global variables a method accesses  
	     * includes each variable the method reads or writes.
	     * 
	     * (T/F) Each read method of ALoopingFactorialSpreadsheet accesses 
	     * a different set of instance variables. 
	     * 	  
	     * (T/F) Each write method of ALoopingFactorialSpreadsheet changes
	     * a different set of instance variables.
		 */
		/* 				 
	     * Uncomment the the code below. Study
	     * the definition of the AnotherLoopingFactorialSpreadsheet.
	     * What output  do you expect, what do you get?	     
	     */
//		printVariables(new AnotherLoopingFactorialSpreadsheet());
//		printProperties(new AnotherLoopingFactorialSpreadsheet());
		/*	   .
	     * (T/F) If we ignore case, for each property in AnotherLoopingFactorialSpreadsheet 
	     * there is a variable with the same name.	     *  
	     * (T/F) The number of properties in 
	     * AnotherLoopingFactorialSpreadsheet is the same as the number of variables in it.
	     * (T/F) Each read method of AnotherLoopingFactorialSpreadsheet accesses
	     * a different set of instance variables.	     * 
	     * (T/F)Each write method of ALoopingFactorialSpreadsheet changes a single 
	     * global variable. 
	     * (T/F) AnotherLoopingFactorialSpreadsheet and ALoopingFactorialSpreadsheet
	     * have the same public behavior, that is behavior defined by their public
	     * methods. If they have the same public behavior, then they can be
	     * interchanged without their users noticing any change in the actions
	     * taken by them.
	     */
		/* 				 
	     * Uncomment the the code below, commenting the prints above.
	     * Visit the definition of AFactorialSpreadsheetPretender.
	     * What properties do you expect, what do you get?
	     * 
	     */
//		printVariables(new AFactorialSpreadsheetPretender());
// 		printProperties(new AFactorialSpreadsheetPretender());
		/*
	     * (T/F) For each property of ALoopingFactorialSpreadsheet there
	     * exists a property with the same name and type in 
	     * AFactorialSpreadsheetPretender .
	     * 
	     * (T/F) For each variable of ALoopingFactorialSpreadsheet  there
	     * exists a variable with the same name and type in AFactorialSpreadsheetPretender. 
	     * .
	     * 	   	
	     * (T/F) AFactorialSpreadsheetPretender and ALoopingFactorialSpreadsheet
	     * have the same public behavior, that is behavior defined by the execution of
	     * public methods.     
	     */
		/* 				 
	     * Uncomment the the code below, commenting the prints above.
	     * Visit the definition of AnotherFactorialSpreadsheetPretender.
	     * What properties do you expect, what do you get?
	     */
 		
//		printVariables(new AnotherFactorialSpreadsheetPretender());
//		printProperties(new AnotherFactorialSpreadsheetPretender());
		/*
	     * (T/F) For each property of ALoopingFactorialSpreadsheet  there
	     * exists a property with the same name and type in AnotherFactorialSpreadsheetPretender.
	     * .
	     * 
	     * (T/F) For each variable of ALoopingFactorialSpreadsheet  there
	     * exists a variable with the same name and type in AnotherFactorialSpreadsheetPretender.
	     * .	  	     
	     */
		/* 				 
	     * Uncomment the the code below, commenting the prints above.
	     * Visit the definition of ANonBeanLoopingFactorialSpreadsheet.
	     * What properties do you expect, what do you get?
	     */
//		printVariables(new ANonBeanLoopingFactorialSpreadsheet());
//		printProperties(new ANonBeanLoopingFactorialSpreadsheet());
		/*	
		 * (T/F) ANonBeanLoopingFactorialSpreadsheet and ALoopingFactorialSpreadsheet
	     * have the same behavior except that they use different method names.	
	     * 
		 * (T/F) For each property of ALoopingFactorialSpreadsheet  there
	     * exists a property with the same name and type in ANonBeanLoopingFactorialSpreadsheet. 
	     * .
	     *  
	        
	     */
		/* 				 
	     * Uncomment the the code below, commenting the prints above.
	     * Visit the definition of ANonBeanLoopingFactorialSpreadsheet.
	     * What properties do you expect, what do you get?
	     */
//		printVariables(new ALoopingFactorialSpreadsheetWithNonPublicMethods());
//		printProperties(new ALoopingFactorialSpreadsheetWithNonPublicMethods());
		/*	
		 * (T/F) ALoopingFactorialSpreadsheetWithNonPublicMethods and ALoopingFactorialSpreadsheet
	     * have the same behavior except that they give different access to their methods.	    
		 * (T/F) For each property of ALoopingFactorialSpreadsheet  there
	     * exists a property with the same name and type in ALoopingFactorialSpreadsheetWithNonPublicMethods. 
	     *	     
	     */		
	}
}
/*
 * By printing the names and types of the properties and variables of 
 * instances of different classes,
 * the various runs of the main method help you answer the following
 * general questions. 
 * In other words, your answers to these should be consistent with
 * the output you see in the various runs.
 * (T/F) The names of variables begin with lowercase letters.
 * (T/F) The names of properties begin with lowercase letters. 
 * (T/F) Each editable property has a public read method.
 * (T/F) Each editable property has a public write method. 
 * (T/F) Each readonly property has a public read method.
 * (T/F) Each readonly property has a public write method. 
 * A read method of a property named P of type T has the name getP and:
 *    takes a parameter of type T, and returns a value of type T.
 *    takes a parameter of type T, and returns no value.
 *    takes no parameter, and returns a value of type T.   
 *
 * A write method of a property named P of type T has the name setP and:
 *    takes a parameter of type T, and returns a value of type T.
 *    takes a parameter of type T, and returns no value.
 *    takes no parameter, and returns a value of type T.   
 * The names and types of the  properties defined by a class depend on:
* 		Only methods of the class.
* 		Only variables of the class.
* 		Both variables and methods of the class.
 */

// Go to
