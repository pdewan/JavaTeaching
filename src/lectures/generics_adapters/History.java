package lectures.generics_adapters;
/*
 GENERIC INTERFACE
 */
public interface History<T> { // T is a type parameter rather than a fixed type
	public void addElement(T element);
	public T elementAt (int index); 
	public int size();
}
