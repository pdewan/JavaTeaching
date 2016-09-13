/**
 * We see another kind of interface now - a user interface.
 * We also see the nature of a tool we will use in this class
 * to support user-interfaces.
 * 
 * Copy this package for your praxis.
 * Visit the following classes for this praxis in this order:
 * ManualConsoleBMISpreadsheetUI
 * AutoBMISpreadsheetGUI
 * AUIBMISpreadsheet 
 * 
 * SAKAI QUESTIONS
 * 
 * USER INTERFACE
 * 
 *  (T/F) A programming interface of an object allows another object to
 * interact with it. 
 * 
 * (T/F) A user interface of an object allows a human user to
 * interact with it.
 * 
 * (T/F) Java automatically provides a user-interface to interact with each object.
 * 
 * Based on the ManualConsoleBMISpreadSheetUI example, the UI code is:
 * 	   (a) an order of magnitude (about ten times) smaller than the computation code.
 * 	   (b) an order of magnitude larger than the computation code.
 *     (c) about the same size as the computation code.
 *     
 * 
 * (T/F) It is possible to create a tool that automatically creates a user interface
 * for displaying all properties of an object.
 * 
 * (T/F) It is possible to create a tool for interactively changing all properties of an object.
 * 
 * (T/F) It is possible to create a tool for interactively changing all editable properties of an 
 * object.
 * 
 * When a property is edited (in an ObjectEditor window)
 * 	  (a) the setter for only that property is called.
 *    (b) the setters for all editable properties are called.
 *    
 * When a property is edited (in an ObjectEditor window)
 *     (a) the getter for only that property is called.
 *     (b) the getters for all editable properties are called.	 
 *     (C) the getters for all properties are called.
 *     
 * (T/F) It is possible to create a tool that automatically creates a user
 * interface for invoking the public methods of an object.
 * 
 * When a a method is invoked through an ObjectEditor window:
 *     (a) no getter is called.
 *     (b) the getters for all properties are called
 *     
 * (T/F) When an object is changed from the program, 
 * ObjectEditor knows about this event and calls getters in the object to update 
 * the display of the object.
 * 
 * (T/F) The Common->Refresh command in ObjectEditor calls all getters in the displayed
 * object to display current property values.
 * 
 * (T/F) The refresh method defined in OEFrame calls all getters in the displayed
 * object to display current property values.
 * 
 * ANNOTATIONS
 * 
 * (T/F) An annotation is:
 * 	  (a) a comment for describing a program construct that is filtered out by the 
 * 	      compiler from the source code. 
 * 	  (b) an instantiation of a special class for describing some program construct.
 * 
 * (T/F) ObjectEditor checks that each property listed in the  @PropertyNames
 *  annotation of a class is actually a property of the class.
 * 
 * (T/F) The Java compiler checks that each property listed in the 
 * @EditablePropertyNames annotation of a class is actually an editable property of
 * the class.
 * 
 * * (T/F) Removing the name of an editable property from the @EditablePropertyNames 
 * annotation makes it uneditable by the user and results in a warning from 
 * ObjectEditor.
 * 
 * (T/F) Removing the name of the name of a property from both
 * @EditablePropertyNames  and @PropertyNames annotation makes it 
 * unviewable and results in a warning from ObjectEditor.
 * 
 * (T/F) Annotations can help specify and document the (editable) properties 
 * of a class.
 
 * (T/F) It is possible to build a tool that checks that a class implements
 * specified properties.
 * 
 * (T/F) Removing @StructurePattern(StructurePatternNames.BEAN_PATTERN) 
 * annotation from a class results in a warning from ObjectEditor if the 
 * class defines one or more properties.
 * 
 * DISCUSSION INFO
 * 
 * What did you learn in this lesson?
 * Why use ObjectEditor for teaching?
 * Why provide annotations in a language?
 */

package lectures.ui;