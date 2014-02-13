package lectures.mvc.collections;
import lectures.arrays.collections_implementation.AStringHistory;
import lectures.arrays.collections_implementation.StringHistory;
public class AStringHistoryDemoer {
	public static void main (String[] args) {
		createAndDisplayHistory(new AStringHistory());
		createAndDisplayHistory(new AnObservableStringHistory());
	}	
	public static void createAndDisplayHistory(StringHistory stringHistory) {
		bus.uigen.ObjectEditor.edit(stringHistory);
		stringHistory.addElement("James Dean");
		stringHistory.addElement("Joe Doe");
		stringHistory.addElement("Jane Smith");
		stringHistory.addElement("John Smith");		
	}
	
}
