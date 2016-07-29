package lectures.documentations.assertions;

import bus.uigen.ObjectEditor;
// What do you think externally checkable could mean?
public class AnExternallyCheckableBMISpreadsheet extends AnErroneousAssertingSpreadsheet  {
	double initialHeight, initialWeight; // will allow initial state to be restored in this version
	public AnExternallyCheckableBMISpreadsheet(double anInitialHeight,
			double anInitialWeight) {
		super(anInitialHeight, anInitialWeight);
		initialHeight = anInitialHeight;
		initialWeight = anInitialWeight;
	}
	@Override
	//Increasing visibility of pre so external modules - in particularly OE- can call it
	public boolean preGetBMI() {
		return super.preGetBMI();
	}
	// prcondition method for restoreHeightAndWeight, again public
	// If the initial state has not changed, nothing to restore so no point calling restoreHeightAndWeight
	public boolean preRestoreHeightAndWeight() {
		return getHeight() != initialHeight || getWeight() != initialWeight; 
	}
	public void restoreHeightAndWeight() { 
		assert preRestoreHeightAndWeight();
		setHeight(initialHeight);
		setWeight(initialWeight);		
	}	
	public static void main (String[] args) {
		ObjectEditor.edit(new AnExternallyCheckableBMISpreadsheet(1.77, 75));
	}
	
	// What is the naming condition we are using for public precondition methods.
	// Given a method M, its precondition is checked by a method with what header/signature?
	
	// Run the program. Look at the  AnExternallyCheckableBMISpreadsheet->restoreHeightAndWeight. Should
	// the item be grayed out? Is it? If not execute it. What happens.
	// Change the height or weight to 0. What happens to the display?
	// Look at the menu item AnExternallyCheckableBMISpreadsheet->restoreHeightAndWeight again.
	// Should the item be grayed out? Is it? If not execute it. What happens.
	// Do you have a theory about how ObjectEditor is interacting with the public precondition methods?
	
}
