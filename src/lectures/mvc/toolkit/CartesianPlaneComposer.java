package lectures.mvc.toolkit;

import java.awt.Component;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import lectures.mvc.properties.AnObservableCartesianPlane;
import lectures.mvc.properties.ObservableCartesianPlane;
import lectures.mvc.properties.ObservableLine;
import lectures.mvc.properties.ObservableStringShape;
import bus.uigen.ObjectEditor;

public class CartesianPlaneComposer {
	public static void main(String[] args) {		
		ObservableCartesianPlane cartesianPlane = new AnObservableCartesianPlane(50, 100, 100);		
		PropertyChangeListener view = new ACartesianPlaneView(cartesianPlane);
		// why not add it in the composer
		cartesianPlane.addPropertyChangeListener(view);
		((ObservableLine) cartesianPlane.getXAxis()).addPropertyChangeListener(view);
		((ObservableLine) cartesianPlane.getYAxis()).addPropertyChangeListener(view);
		((ObservableStringShape) cartesianPlane.getXLabel()).addPropertyChangeListener(view);
		((ObservableStringShape) cartesianPlane.getYLabel()).addPropertyChangeListener(view);
		JFrame frame = new JFrame("Cartesian Plane");
		// can we get rid of the cast somehow?
		frame.add((Component) view);
		frame.setSize(300, 300);
		frame.setVisible(true);
		ObjectEditor.edit(cartesianPlane);			
	}
}
