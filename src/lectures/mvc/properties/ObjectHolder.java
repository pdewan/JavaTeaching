package lectures.mvc.properties;

public interface ObjectHolder<ObjectType> {
	public ObjectType getObject();
	public void setObject(ObjectType newVal);
}