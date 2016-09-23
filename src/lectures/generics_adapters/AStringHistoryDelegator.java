package lectures.generics_adapters;

import java.util.ArrayList;
import java.util.List;

import lectures.arrays.collections_implementation.AStringHistory;
import lectures.inheritance.InheritingStringDatabase;
/* 
 DELEGATION AND ADAPTATION
 We see here that the interface List and the class ArrayList are both
 generic types.
 
 Study this code.
 
 Why do we need this class given that we have a generic List and ArrayList.
 Look at the two static methods.
 Why do we need this class given that we have List and ArrayList?
 
 The two static methods try to answer this question. They justify this
 class.
 
 Let us now try to understand why the term delegation is being used here.
 
 What is the relationship between this class and the class ArrayList? 
 
 This class is called a delegator and ArrayList a delegate. 
 Can you justify this nomenclature?
 
 Does this class implement new functionality?
 Such a delegator is also called an adaptor to make an analogy with
 a 220V to 110 V voltage converter a European to US plug adapter.
 Can you justify this nomenclature?

 
 l

 */

public class AStringHistoryDelegator implements History<String>{
	List<String> contents = new ArrayList<String>();
	public void addElement (String s) {
		contents.add (s);
	}
	public String elementAt (int index) {
		return contents.get(index); 
	}
	public int size() {
		return contents.size();
	}
	
	
	/*
	 LEAST PRIVELEGE
	 This principle says that the users of an object should not be able to perform
	 unauthorized operations - operations not needed to their tasks. 
	 Which of these two examples supports least privilege?
	 
	 */
	final static String EXAMPLE_STRING = "0";
	public static void useListDirectly() {
		List<String> aStringHistory = new ArrayList<String>();
		aStringHistory.add(EXAMPLE_STRING);
		/*
		 Is the following allowed? Should it be allowed for a "history"?
		 */
//		aStringHistory.remove("0");
	}
	public static void useStringHistory() {
		History<String> aStringHistory = new AHistory<String>();
		aStringHistory.addElement(EXAMPLE_STRING);
		/*
		 Is the following allowed? Should it be allowed for a "history"?
		 */
//		aStringHistory.removeElement(EXAMPLE_STRING));
//		((StringDatabase) aStringHistory).removeElement(EXAMPLE_STRING);
	}
}
