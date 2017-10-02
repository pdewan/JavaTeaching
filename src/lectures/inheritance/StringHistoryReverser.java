package lectures.inheritance;

import bus.uigen.ObjectEditor;

public class StringHistoryReverser {
	public static final String ELEMENT_1 = "Joe Doe";
	public static final String ELEMENT_2 = "Jane Doe";
	
	public static BaseStringHistory reverse(BaseStringHistory anOriginal) {
		BaseStringHistory retVal = StringHistoryFactory.createStringHistory();
		for (int aHistoryIndex = anOriginal.size() -1; aHistoryIndex >= 0; aHistoryIndex--) {
			retVal.addElement(anOriginal.elementAt(aHistoryIndex));			
		}
		return retVal;
	}
/*
 * The reverse method in StringHistoryReverser can reverse instances of: 
 *     (a) ABaseStringHistory
 *     (b) AnInheritingStringDatabase
 *     (c) AnInheritingStringStringSet
 *     (d) String
 */

	
	public static void main (String[] args) {
		BaseStringHistory aHistory = StringHistoryFactory.createStringHistory();
		aHistory.addElement(ELEMENT_1);
		aHistory.addElement(ELEMENT_1);
		aHistory.addElement(ELEMENT_2);
		aHistory.addElement(ELEMENT_2);
		BaseStringHistory aReversedHistory= reverse(aHistory);
		ObjectEditor.edit(aHistory);
		ObjectEditor.edit(aReversedHistory);		
	}
/*
 * Run the program and see the two displays created.
 * Go back to StringHistoryFactory and switch to the alternate return statement
 * in the factory method.
 * Run main again and observe the displays.
 *  
 * 
 * Which tasks is class StringHistoryFactory responsible for:
 * 
 * (a) Creating an implementation a BaseStringHistory.
 * (b) Choosing an implementation of BaseStringHistory.
 * (c) Reversing a BaseStringHistory
 * 
 * Which tasks is class StringHistoryReverser responsible for:
 * (a) Creating an implementation a BaseStringHistory.
 * (b) Choosing an implementation of BaseStringHistory.
 * (c) Reversing a BaseStringHistory.
 * 
 * Which tasks is class ABaseStringHistory responsible for:
 * (a) Creating an implementation a BaseStringHistory.
 * (b) Choosing an implementation of BaseStringHistory.
 * (c) Reversing a BaseStringHistory
 * 
 * (T/F) Implementing an interface and using (operating on) the interface are separate
 * concerns
 * 
 * (T/F) Operating on an interface and choosing which implementation of the interface is
 * used are separate concerns.
 * 
 * (T/F) Factory methods support separation of concerns.
 */
/*
 * THE END
 */

}
