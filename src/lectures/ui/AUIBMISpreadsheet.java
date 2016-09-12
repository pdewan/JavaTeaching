package lectures.ui;

import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;

/**
 * This class demonstrates annotations and manipulation by object editor.
 *
 */
/*
 * Annotations
 * 
 * (T/F) An annotation is a:
 * 	  comment for describing a program construct that is filtered out by the compiler
 * 	  from the source code.
 * 
 * 	an instantiation of a special class for describing some program construct.
 * 
 *   
 * An annotation is an instantiation of an annotation class that describes some 
 * program construct such as a class, method or variable that follows it.
 * As we see above, an annotation class is imported like a regular class.
 * It is not instantiated using new.
 * Instead, the @symbol precedes its constructor call, which can
 * take arguments. We see three annotation classes instantiated below,
 * which describe the class declared below the instantiations. 
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

public class AUIBMISpreadsheet implements UIBMISpreadsheet {
	static final double SAMPLE_HEIGHT = 1.77;
	static final double SAMPLE_WEIGHT = 75;
	double height;
	double weight;	
	public AUIBMISpreadsheet() {

	}	
	public AUIBMISpreadsheet(
			double anInitialHeight, double anInitialWeight) {
		setHeight(anInitialHeight);
		setWeight(anInitialWeight);
	}
	public double getWeight() {
		System.out.println ("getWeight called:");
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
		setWeight(getHeight() +anIncrement );
	}
}
