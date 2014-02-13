package lectures.mvc.properties;

import util.models.PropertyListenerRegisterer;

public interface ObservableObjectHolder<ObjectType> extends ObjectHolder<ObjectType>, PropertyListenerRegisterer{

}