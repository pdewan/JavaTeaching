package lectures.mvc.monolithic;

import java.util.Scanner;

import lectures.main_consoleinput.Console;


public class MonolithicConsoleUI {
        static int counter = 0;	
        static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
			while (true) {
	        	System.out.println("Counter: " + counter); 
				int nextInput = scanner.nextInt();
				if (nextInput == 0) return;
					counter += nextInput;
		}
	}
}



