package lectures.mvc;
import java.util.Scanner;

import lectures.main_consoleinput.Console;
public class ACounterController implements CounterController {
    Scanner scanner = new Scanner(System.in);
	ObservableCounter counter;
	public void setModel (ObservableCounter theCounter) {
		counter = theCounter;
	}	
	public void processInput() {
		while (true) {
			int nextInput = scanner.nextInt();
			if (nextInput == 0) return;
			counter.add(nextInput);			
		}
	}
}
