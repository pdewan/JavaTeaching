package lectures.iterator;


public class IteratedStringPrinter {
	public static void print(StringIterator aStringIterator) {
		while (aStringIterator.hasNext())
			System.out.println(aStringIterator.next());
	}
}
