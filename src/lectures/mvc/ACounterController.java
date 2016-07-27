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
			System.out.println ("Please enter counter (positive or negative) increment");
			int nextInput = scanner.nextInt(); // read user input
			if (nextInput == 0) { // either process the input internally
				break;
			}
			counter.add(nextInput);	// or call write methods in the model
			// no output in this class, as that is the job of one or more views
			
			
			// But how does a view know there is new output to display
			// Each controller could keep track of all views.
			// Or each model could keep track of all views and notify them in write methods
			
			
		}
	}
}

