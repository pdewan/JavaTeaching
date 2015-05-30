package lectures.oegraphics;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import shapes.FlexibleShape;
import bus.uigen.ObjectEditor;
import bus.uigen.controller.AComponentInputter;
import bus.uigen.controller.ComponentInputter;
import bus.uigen.models.ComponentDrawer;

public class TwoWindowTranslatedHelloWorld extends CustomContainerHelloWorld {
	static Container helloContainer = new Container();
	static Container translationContainer = new Container();
	protected static FlexibleShape translationShape;
	public static void displayTranslation(Container aContainer) {
		ComponentDrawer translationDrawer = ObjectEditor.createComponentDrawer(aContainer);
		translationShape = translationDrawer.drawString("Ni hao shijie", 100, 100);	
	}
	public static void addContainers (JFrame aFrame) {
		aFrame.setLayout(new GridLayout(2, 1));
		aFrame.add(helloContainer);
		aFrame.add(translationContainer);
	}
	public static void processHelloDrags() {
		ComponentInputter inputter = new AComponentInputter(shapeDrawerComponent);
		while (true) {
			MouseEvent nextInput = inputter.getMouseDraggedEvent();
			helloShape.setX(nextInput.getX());
			helloShape.setY(nextInput.getY());	
			translationShape.setX(nextInput.getX());
			translationShape.setY(nextInput.getY());
		}	
	}
	
	public static void main (String[] args) {		
		JFrame frame = createFrame();
		addContainers(frame);
		displayHello(helloContainer);
		displayTranslation(translationContainer);
		frame.setVisible(true);
		processHelloDrags();
	}
}
