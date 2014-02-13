package lectures.mvc.toolkit;

import java.awt.Component;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import lectures.mvc.properties.AnObservablePlottedShuttle;
import lectures.mvc.properties.ObservablePlottedShuttle;
import bus.uigen.ObjectEditor;

public class PlottedShuttleComposer {
	public static void main(String[] args) {		
		ObservablePlottedShuttle plottedShuttle = new AnObservablePlottedShuttle(50, 100);
		PropertyChangeListener view = new APlottedShuttleView(plottedShuttle);
		plottedShuttle.addPropertyChangeListener(view);		
		MouseListener mouseController = new APlottedShuttleMouseController(plottedShuttle, (Component) view);
		KeyListener keyController = new APlottedShuttleKeyController(plottedShuttle, (Component) view);
		JFrame frame = new JFrame("Plotted Shuttle");
		frame.add((Component) view);
		frame.setSize(300, 300);
		frame.setVisible(true);
		ObjectEditor.edit(plottedShuttle);	
		plottedShuttle.setShuttleY(100);
		plottedShuttle.setShuttleX(50);
	}
}
