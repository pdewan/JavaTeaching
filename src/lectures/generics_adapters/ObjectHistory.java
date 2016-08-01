package lectures.generics_adapters;

public interface ObjectHistory {
	public void addElement(Object element);
	public Object elementAt (int index); 
	public int size();
}
