package lectures.iterator;

public class ReusableCharPrinter {
	public static void printChars (CharIterator charIterator) {
        while (charIterator.hasNext()) 
            System.out.print(charIterator.next ());
   } 
}
