package lectures.arrays.collections_implementation;

public interface StringDatabase {
	//from history
	public int size();
	public void addElement(String element);
	public String elementAt(int index); 

	//additional methods
	 public void removeElement(String element);
	 public boolean member(String element);
	 public void clear();


}
