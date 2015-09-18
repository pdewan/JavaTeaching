package praxis.inheritance;

import bus.uigen.ObjectEditor;

public class InheritanceDriver {
	public static void main (String[] args) {
		String[] anArray = new String[10];
		anArray[0] = "Jane Doe";
		anArray[1] = "John Smith";
		anArray[2] = "John Smith";
		// comment this out
		// later comment it
		ObjectEditor.edit(anArray);
		
		
		// comment this out
		// later uncomment this
    	PraxisStringHistory aCollection = new APraxisStringHistory();
//		PraxisStringSet aCollection = new APraxisStringHistory();
		
		// uncomment this
//    	PraxisStringSet aCollection = new APraxisStringSet();
    	
    	
    	// uncomment this
//    	PraxisStringHistory aCollection = new APraxisStringSet();
    	// uncomment this
//    	Object anObject = new APraxisStringHistory();
    	aCollection.add("Jane Doe");
    	aCollection.add("John Smith");
    	aCollection.add("John Smith");
    	// uncomment this
//		ObjectEditor.edit(aCollection);
    	
    }

}
