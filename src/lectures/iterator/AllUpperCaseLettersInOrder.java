package lectures.iterator;
public class AllUpperCaseLettersInOrder implements CharIterator {
	char nextLetter = 'A';
	public boolean hasNext() {
		return nextLetter <= 'Z';
	}
	public char next() {
		char retVal = nextLetter;
		nextLetter = (char) (nextLetter + 1);
		return retVal;
	}
}
