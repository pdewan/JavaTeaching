package lectures.mvc.properties;

import java.beans.PropertyChangeEvent;

public class PropertyEventPrinter {
	public static void main (String[] args) {
		System.out.println(new PropertyChangeEvent("test", "this", "old value", "new value"));
	}

}
