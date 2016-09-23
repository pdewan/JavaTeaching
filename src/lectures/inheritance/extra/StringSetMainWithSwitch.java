package lectures.inheritance.extra;

import lectures.arrays.collections_implementation.StringHistory;
import lectures.inheritance.AnInheritingStringSet;
import lectures.inheritance.BaseStringHistory;
import lectures.inheritance.InheritingStringDatabase;
import lectures.main_consoleinput.Console;

public class StringSetMainWithSwitch {

	public static void main(String args[]) {
    	InheritingStringDatabase names = new AnInheritingStringSet();
    	while (true) {
    		String input = Console.readString();
    		if (!(input.length() == 0))
				if (input.charAt(0) == 'q') 
					break;
				else 
					switch (input.charAt(0)) {
					case 'p':
						print(names);
						break; 
					case 'd':
						names.removeElement(
								input.substring(2, input.length()));
						break;
					case 'm':
						System.out.println(names.member(
								input.substring(2, input.length())));
						break;
					case 'c':
						names.clear();
						break;
					default:
						names.addElement(input);
					}
    	}
    }

    static void print(BaseStringHistory strings) {
        System.out.println("******************");
        for ( int elementNum = 0; elementNum < strings.size(); elementNum++) 
        	System.out.println(strings.elementAt(elementNum));
        System.out.println("******************");
    }
	
}
