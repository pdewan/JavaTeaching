package lectures.iterator_scanning;

public class ReusableCharPrinter {
	public static void printChars (CharIterator charIterator) {
        while (charIterator.hasNext()) 
            System.out.print(charIterator.next ());
   } 
}
