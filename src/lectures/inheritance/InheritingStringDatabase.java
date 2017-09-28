package lectures.inheritance;


public interface InheritingStringDatabase extends BaseStringHistory {
//	public static final int MAX_SIZE = 10;

	public void removeElement(String element);
    public void clear();
    public boolean member(String element);

}
