package lectures.state_properties;

import lectures.constructors_pointers.ABMISpreadsheet;

public class PointerDemoer {
	public void demoPointersGarbageCollection() {
		ABMISpreadsheet bmiSpreadsheet1 = new ABMISpreadsheet();
		ABMISpreadsheet bmiSpreadsheet2 = new ABMISpreadsheet();
		bmiSpreadsheet1.setHeight(1.77);
		bmiSpreadsheet2 = bmiSpreadsheet1; // garbage collection
		bmiSpreadsheet1.setWeight(75);
		System.out.println(bmiSpreadsheet1.getWeight() == bmiSpreadsheet1.getWeight());
	}

}
