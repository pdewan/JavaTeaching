package lectures.generics_adapters;
/**
 * This is example declaration of a generic interface  that declares a type
 * parameter named T within angle brackets.
 * 
 * In general, a generic can have a list of comma-separated type parameters
 * 
 */
public interface History<T> { // T is a type parameter rather than a fixed type
	public void addElement(T element);
	public T elementAt (int index); 
	public int size();
}
/*
 * (T/F) The type parameter of a generic interface is declared in its header.
 * 
 * (T/F) A type parameter can be used instead of an an actual (literal) type to
 * declare a parameter of a method in a generic interface.
 * 
 * (T/F) A type parameter can be used instead of an an actual (literal) type to
 * declare the return value of of a method in a generic interface.
 * 
 * (T/F) A type parameter *must* be used instead of an actual type to 
 * declare each method parameter and return value.
 * 
 * Next visit: AHistory
 */
