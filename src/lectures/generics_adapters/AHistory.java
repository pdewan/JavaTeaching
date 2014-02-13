package lectures.generics_adapters;

import java.util.ArrayList;
import java.util.List;

import lectures.graphics.Point;




public class AHistory<T> implements History<T> {
	public final int MAX_SIZE = 50;
	Object[] contents = new Object[MAX_SIZE];
	int size = 0;
	public int size() {return size;	}	
	public T elementAt (int index) {
		return (T) contents[index];
	}
	boolean isFull() {return size == MAX_SIZE;	}

	public void addElement(T element) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else {
			contents[size] = element;
			size++;
		}
	} 
	
	public static void main (String[] args) {
		String foo = (new ArrayList<String>().get(0));
		History<String> stringHistory = new AHistory();
		Object[] objects = new Object[50];
		String[] strings = new String[50];
		objects = strings;
		//objects[3] = new Object();
		List<Object> objectList = new ArrayList();
		List<String> stringList = new ArrayList();
		stringList.add("hello");
		//objectList = stringList;
		//List<String> stringListClone = (new ArrayList()).subList(0,3);
		List<String> stringListClone = (new ArrayList<String>(stringList));
		//List<Point> pointListClone = (new ArrayList<Point>(stringList));
		//History h = historyListClone.get(0);
		//historyListClone.add(new AHistory());
		stringHistory.addElement("James Dean");
		stringHistory.addElement("Joe Doe");
		stringHistory.addElement("Jane Smith");
		stringHistory.addElement("John Smith");
		bus.uigen.ObjectEditor.edit(stringHistory);
		
	}
	public static void shapeReader (History<? extends Point> history) {
		history.elementAt(0).getX();
	}
}
