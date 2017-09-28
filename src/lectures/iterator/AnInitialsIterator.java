package lectures.iterator;

public class AnInitialsIterator implements StringIterator {
	CharIterator charIterator;
	public AnInitialsIterator(CharIterator aCharIterator) {
		charIterator = aCharIterator;
	}
	@Override
	public String next() {
		return "" + charIterator.next() + charIterator.next() + charIterator.next();
	}
	@Override
	public boolean hasNext() {
		return charIterator.hasNext();
	}
	public static void main (String[] args) {
		CharIterator charIterator = new AnUpperCaseIterator(args[0]);
		StringIterator stringIterator = new AnInitialsIterator(charIterator);
		while (stringIterator.hasNext()) {
			System.out.println(stringIterator.next());
		}
	}
}
