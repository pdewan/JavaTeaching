package lectures.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.composite.objects_shapes.ACartesianPoint;
import lectures.composite.objects_shapes.Point;
import lectures.mvc.properties.atomic.APropertyListenerSupport;
import bus.uigen.ObjectEditor;


public class AnObservableObjectHolder<ObjectType> implements ObservableObjectHolder<ObjectType> {
	ObjectType object;
	PropertyListenerSupport propertyListenerSupport = new APropertyListenerSupport();	
	@Override
	public ObjectType getObject() {
		return object;
	}
	public void foo() {
		
	}
	@Override
	public void setObject(ObjectType newVal) {
		ObjectType oldVal = object;
		object = newVal;
		propertyListenerSupport.notifyAllListeners(
				new PropertyChangeEvent(this, "Object", oldVal, newVal));		
	}	
	@Override
	public void addPropertyChangeListener(PropertyChangeListener aListener) {
		propertyListenerSupport.add(aListener);
	}
	public static void main (String[] args) {
//		ObjectEditor.edit("Hello");
		AnObservableObjectHolder<String> objectHolder = new AnObservableObjectHolder<String>();
		objectHolder.setObject( "Hello World");
		ObservableObjectHolder<Point>  objectHolder2 = new AnObservableObjectHolder<Point>();
		objectHolder2.setObject(new ACartesianPoint(50, 50));
		ObjectEditor.editWithPromotedChild(objectHolder2);
//		Hashtable table = new Hashtable();
//		table.put(AttributeNames.PROMOTE_ONLY_CHILD, true);
//		ObjectEditor.editWithPromotedChild(objectHolder);
//		AnObservableObjectHolder objectHolder2 = new AnObservableObjectHolder();
//	objectHolder2.setObject(objectHolder);
////		objectHolder.setObject( new APlottedShuttle(50, 100));
//		ObjectEditor.edit(objectHolder2);
	}
}
