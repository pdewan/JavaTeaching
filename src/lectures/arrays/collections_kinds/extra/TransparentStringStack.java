package lectures.arrays.collections_kinds.extra;

public interface TransparentStringStack {
	public int size();
	public String get(int index);
	public void push(String element);
	public String pop();	
}