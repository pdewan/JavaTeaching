package lectures.extra;

import lectures.arrays.collections_implementation.StringHistory;
import bus.uigen.ObjectEditor;

public class ABigStringHistoryOld extends AnAbstractStringHistoryOld {
	public static final int MAX_SIZE = 50;
	@Override
	int maxSize() {
		return MAX_SIZE;
	}
	
    public static void main(String[] args) {
		ObjectEditor.edit(new ABigStringHistoryOld());
	}



	@Override
	public boolean equals(StringHistory otherStringHistory) {
		// TODO Auto-generated method stub
		return false;
	}

}
