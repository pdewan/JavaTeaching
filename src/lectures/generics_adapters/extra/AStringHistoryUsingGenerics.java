package lectures.generics_adapters.extra;

import lectures.generics_adapters.AHistory;
import lectures.generics_adapters.History;


public class AStringHistoryUsingGenerics extends AHistory<String> implements StringHistoryUsingGenerics {
	public static void main (String[] args) {
		History<String> history = new AStringHistoryUsingGenerics();		
//		StringHistory stringHistory2 = new AHistory();
//		history = stringHistory2;
//		stringHistory = history;
		
		StringHistoryUsingGenerics stringHistory = new AStringHistoryUsingGenerics();
		stringHistory.addElement("James Dean");
		stringHistory.addElement("Joe Doe");
		stringHistory.addElement("Jane Smith");
		stringHistory.addElement("John Smith");
		bus.uigen.ObjectEditor.edit(stringHistory);
		
	}

}
