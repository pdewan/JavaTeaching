package lectures.composite.objects_shapes;

import lectures.mvc.properties.ObjectHolder;


public class AnObjectHolder implements ObjectHolder {
	Object object;
	public Object getObject() {
		return object;
	}
	public void setObject(Object newVal) {
		object = newVal;		
	}	
}
