package lectures.generics_adapters;

public interface History<T> {
	public void addElement(T element);
	public T elementAt (int index); 
	public int size();
}
