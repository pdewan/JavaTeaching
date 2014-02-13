package lectures.arrays.collections_implementation;

import lectures.extra.AStringSet;
import util.misc.Console;

public class AStringSetMain {
	public static void main(String args[]) {
		StringDatabase names = new AStringSet();
		String input = Console.readLine();
		while (input.length() == 0 || !(input.charAt(0) == 'q')) {
			if (!(input.length() == 0))
				if (input.charAt(0) == 'p')
					print(names);
				else if (input.charAt(0) == 'd')
					names.removeElement(input.substring(2, input.length()));
				else if (input.charAt(0) == 'm')
					System.out.println(names.member(input.substring(2, input
							.length())));
				else if (input.charAt(0) == 'c')
					names.clear();
				else
					names.addElement(input);
			input = Console.readLine();
		}
	}

	static void print(StringDatabase strings) {
		System.out.println("******************");
		for (int elementNum = 0; elementNum < strings.size(); elementNum++)
			System.out.println(strings.elementAt(elementNum));
		System.out.println("******************");
	}

}
