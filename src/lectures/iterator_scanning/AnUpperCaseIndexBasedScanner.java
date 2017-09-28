package lectures.iterator_scanning;

public class AnUpperCaseIndexBasedScanner {
	static final int MAX_TOKENS = 5;
	String[] upperCaseLetters = new String[MAX_TOKENS];
	int numberOfUpperCaseLetters;
	public AnUpperCaseIndexBasedScanner(String theScannedString) {
		scan(theScannedString);
	}
	void scan (String s) {
		 // store all scanned tokens in upperCaseLetters
		int index = 0;
		while (index < s.length()) {
			if (Character.isUpperCase(s.charAt(index))) {
				upperCaseLetters[numberOfUpperCaseLetters] = s.charAt(index) + "";
				numberOfUpperCaseLetters++;
			}
			index++;
		}	
	}
	public String[] getTokenArray () {
		return upperCaseLetters;
	}
	public int getNumberOfTokens() {
		return numberOfUpperCaseLetters;
	} 
}
