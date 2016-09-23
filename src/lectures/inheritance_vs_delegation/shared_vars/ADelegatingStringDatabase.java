package lectures.inheritance_vs_delegation.shared_vars;

import lectures.inheritance.InheritingStringDatabase;

public class ADelegatingStringDatabase 	implements InheritingStringDatabase {	
		ADelegateStringHistory stringHistory = new ADelegateStringHistory();			
		public int indexOf (String element) {
			int index = 0;
			while ((index < stringHistory.size()) && !element.equals(stringHistory.elementAt(index)))
				   index++;
			return index;
		}
		void shiftUp(int startIndex) {
		    for (int index = startIndex; index + 1 < stringHistory.size(); index++) {
		    	stringHistory.contents[index] = stringHistory.elementAt(index + 1);
		    }
		    stringHistory.size--;
		}
		public void removeElement(String element) {
			shiftUp(indexOf(element));
		}
		public boolean member(String element) {
			return indexOf (element) < stringHistory.size();
		}	
		public void clear() {
			stringHistory.size = 0;
		}
		public int size() {
			return stringHistory.size();
		}
		public String elementAt(int index) {
			return stringHistory.elementAt(index);
		}
		public void addElement(String element) {
			stringHistory.addElement(element);
		}
		public void deleteElement (String element) {
			shiftUp(indexOf(element));
		}	
		


}
