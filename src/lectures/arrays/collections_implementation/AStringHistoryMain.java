package lectures.arrays.collections_implementation;

import util.misc.Console;

public class AStringHistoryMain {
	public static void main(String[] args) {
		StringHistory names = new AStringHistory();
		while (true) {
			String input = Console.readLine();
			if (input.length() > 0)
				if (input.charAt(0) == 'q')
					break;
				else if (input.charAt(0) == 'p')
					print(names);
				else
					names.addElement(input);
		}
	}

	static void print(StringHistory strings) {
		System.out.println("******************");
		for (int elementNum = 0; elementNum < strings.size(); elementNum++)
			System.out.println(strings.elementAt(elementNum));
		System.out.println("******************");
	}

}
