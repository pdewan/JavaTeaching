package lectures.mvc.interactor;

import javax.swing.JOptionPane;

import lectures.main_consoleinput.Console;
import lectures.mvc.Counter;

public class AMultipleUIInteractor implements CounterInteractor {        
        public void edit (Counter counter) {	
	while (true) {
	     int nextInput = Console.readInt();
	     if (nextInput == 0) return;
	     counter.add(nextInput);
	     System.out.println("Counter: " + counter.getValue());
	     JOptionPane.showMessageDialog(null, 
                             "Counter: " + counter.getValue());
	}
      }
}
