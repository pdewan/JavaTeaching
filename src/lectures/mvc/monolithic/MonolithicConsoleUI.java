package lectures.mvc.monolithic;

import lectures.mvc.Counter;

public interface MonolithicConsoleUI {
	public void edit (Counter counter);
}

//public class ConsoleUI {
//        static int counter = 0;	
//        public static void main(String[] args) {
//        	System.out.println("Counter: " + counter); 	
//			while (true) {
//				int nextInput = Console.readInt();
//				if (nextInput == 0) return;
//					counter += nextInput;
//				System.out.println("Counter: " + counter);
//		}
//	}
//}


//import javax.swing.JOptionPane;
//public class ConsoleUI {
//	static int counter = 0;	
//	public static void main(String[] args) {	
//		while (true) {
//			int nextInput = Console.readInt();
//			if (nextInput == 0) return;
//				counter += nextInput;
//			JOptionPane.showMessageDialog(
//				null, "Counter: " + counter);
//		}
//	}
//}

//import javax.swing.JOptionPane;
//public class ConsoleUI {
//	static int counter = 0;	
//	public static void main(String[] args) {
//		System.out.println("Counter: " + counter);
//		while (true) {
//			int nextInput = Console.readInt();
//			if (nextInput == 0) return;
//				counter += nextInput;
//			System.out.println("Counter: " + counter);
//			JOptionPane.showMessageDialog(
//				null, "Counter: " + counter);
//		}
//	}
//}


