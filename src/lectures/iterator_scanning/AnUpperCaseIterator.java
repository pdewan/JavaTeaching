package lectures.iterator_scanning;

public class AnUpperCaseIterator implements CharIterator{
    String string;
    int nextElementPos = 0;
    public AnUpperCaseIterator(String theString) {
        string = theString;
        skipNonTokenCharacters();
    }	 
    public boolean hasNext() { return nextElementPos < string.length();}
    public char next () {
        char retVal = getToken();
        movePastCurrentToken();
        skipNonTokenCharacters();
        return retVal;
    }    
    void movePastCurrentToken() {nextElementPos++;} 
    void skipNonTokenCharacters() {
        while (hasNext() &&  !Character.isUpperCase(string.charAt(nextElementPos)))
            nextElementPos++;        
    }
    char getToken() { return string.charAt(nextElementPos);}

}
