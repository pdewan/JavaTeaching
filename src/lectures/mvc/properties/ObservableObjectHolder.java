package lectures.mvc.properties;

import util.models.PropertyListenerRegistrar;

public interface ObservableObjectHolder<ObjectType> extends ObjectHolder<ObjectType>, PropertyListenerRegistrar{

}