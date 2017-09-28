package lectures.arrays;

import util.misc.Console;

public class NamesReaderAndPrinter {
	static String[] getStrings() {
		System.out.println("Number of Strings:");
		int numElements = Console.readInt();
		System.out.println("Please enter " + numElements + " strings");
		String[] strings = new String[numElements];
		for (int elementNum = 0; elementNum < numElements; elementNum++)
			strings[elementNum] = Console.readString();
		return strings;
	}

	static void print(String[] strings) {
		System.out.println("******************");
		for (int elementNum = 0; elementNum < strings.length; elementNum++)
			System.out.println(strings[elementNum]);
		System.out.println("******************");
	}

	public static void main(String[] args) {
		String[] names = getStrings();
		String command = Console.readString();
		while (command.length() > 0 && command.charAt(0) != 'q') {
			if (command.charAt(0) == 'p')
				print(names);
			command = Console.readString();
		}
	}

}
