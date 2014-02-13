package lectures.mvc.toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import lectures.mvc.AnObservableCounter;
import lectures.mvc.CounterController;
import lectures.mvc.CounterObserver;
import lectures.mvc.ObservableCounter;



public class SingleFrameAWTMenuItemTextFieldComposer {
	public static void main (String args[]) {
		// compose AWT components
		JFrame frame = new JFrame("AWT Controller and View");
		JMenuItem menuItem = new JMenuItem("Increment");
		JMenu menu = new JMenu("Counter");
		JMenuBar menuBar = new JMenuBar();
		JTextField textField = new JTextField();
		frame.add(textField);
		menu.add(menuItem);
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		frame.setSize(250, 125);
		frame.setVisible(true);
		
		//compose model view and controller
		ObservableCounter model = new AnObservableCounter(); 
		CounterObserver view = new ACounterJTextFieldView(textField);
		model.addObserver(view);
		CounterController controller = new ACounterJMenuItemController(menuItem);
		controller.setModel(model);	
	}
	
	

}
