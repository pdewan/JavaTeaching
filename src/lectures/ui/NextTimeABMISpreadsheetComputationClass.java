package lectures.ui;

import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;

/**
 * This class demonstrates annotations and manipulation by object editor.
 * Process the annotation instructions only when asked to do so in the
 * main class.
 *
 */
/*
 * Annotations
 * 
 * (T/F) An annotation is:
 * 	  (a) a comment for describing a program construct that is filtered out by the 
 * 	      compiler from the source code. 
 * 	  (b) an instantiation of a special class for describing some program construct.
 * 
 *   
 * An annotation is an instantiation of an annotation class that describes some 
 * program construct such as a class, method or variable that follows it.
 * 
 * As we see above, an annotation class is imported like a regular class.
 * 
 * It is not instantiated using new.
 * 
 * Instead, the @ symbol precedes its constructor call, which can
 * take arguments. 
 * 
 * We see three annotation classes instantiated below,
 * which describe the class declared below the instantiations. 
 * 
 * (T/F) ObjectEditor checks that each property listed in the  @PropertyNames
 *  annotation of a class is actually a property of the class.
 * 
 * (T/F) The Java compiler checks that each property listed in the 
 * @EditablePropertyNames annotation of a class is actually an editable property of
 * the class.
 * 
 * Uncomment the commented property name in  @PropertyNames. Do you get a warning or 
 * error from the compiler?
 * 
 * If not, run the main program. Do you get a warning or error from the ObjectEditor
 * in the console?
 * 
 * Uncomment the commented property name in @EditablePropertyNames. Do you get a 
 * warning or error from the compiler?
 * 
 * If not, run the program. Do you get a warning or error from the ObjectEditor
 * in the console?

 * 
 * (T/F) Removing the name of an editable property from the @EditablePropertyNames 
 * annotation makes it uneditable by the user and results in a warning from 
 * ObjectEditor.
 * 
 * (T/F) Removing the name of the name of a property from both
 * @EditablePropertyNames  and @PropertyNames annotation makes it 
 * unviewable and results in a warning from ObjectEditor.
 * 
 * Comment out the height property from the editable property names annotation.
 * 
 * Run the program. Do you see a warning from OE? Can you edit the property?
 * 
 * Now comment out this property also from the property names annotation.
 * 
 * Run the program. Do you see a warning from OE? Can you view the property?
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
 * Now comment out the @StructurePattern annotation in AUIBMISpreadsheet and run 
 * the program
 *        
 * 
 */
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({ 
	"Weight", 
	"Height",
//	"WeightGainRate",
	"BMI"
	})
@EditablePropertyNames({
	"Height", 
	"Weight",
//	 "BMI"
})

public class NextTimeABMISpreadsheetComputationClass implements UIBMISpreadsheet {
	static final double SAMPLE_HEIGHT = 1.77;
	static final double SAMPLE_WEIGHT = 75;
	double height;
	double weight;	
	public NextTimeABMISpreadsheetComputationClass() {

	}	
	public NextTimeABMISpreadsheetComputationClass(
			double anInitialHeight, double anInitialWeight) {
		setHeight(anInitialHeight);
		setWeight(anInitialWeight);
	}
	public double getWeight() {
//		System.out.println ("getWeight called:");
		return weight;
	}
	public void setWeight(double newValue) {
		System.out.println ("SetWeight called:" + newValue);
		weight = newValue;
	}	
	public double getHeight() {
		System.out.println ("getHeight called:");
		return height;
	}
	public void setHeight(double newValue) {
		System.out.println ("setHeight called:" + newValue);
		height = newValue;
	}	
	public double getBMI() {
		System.out.println ("getBMI called:");
		return weight/(height *height);
	}
	
	public void incrementWeight(double anIncrement) {
		System.out.println ("incrementWeight called:" + anIncrement);
		setWeight(getWeight() +anIncrement );
	}
	public void incrementHeight(double anIncrement) {
		System.out.println ("incrementHeight called:" + anIncrement);
		setHeight(getHeight() +anIncrement );
	}
}
