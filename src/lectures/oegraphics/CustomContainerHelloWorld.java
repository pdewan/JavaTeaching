package lectures.oegraphics;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import shapes.FlexibleShape;

import bus.uigen.ObjectEditor;
import bus.uigen.controller.AComponentInputter;
import bus.uigen.controller.ComponentInputter;
import bus.uigen.models.ComponentDrawer;
import bus.uigen.widgets.swing.DelegateJPanel;

public class CustomContainerHelloWorld {
	protected static FlexibleShape helloShape;
	protected static Component shapeDrawerComponent; 
	public static JFrame createFrame() {
		JFrame frame = new JFrame();
		frame.setSize(360, 240);
		return frame;
	}
	public static void displayHello(Container aContainer) {
		ComponentDrawer helloWorldDrawer = ObjectEditor.createComponentDrawer(aContainer);
		helloShape = helloWorldDrawer.drawString("Hello World", 100, 100);
		shapeDrawerComponent =  aContainer.getComponent(0);
		shapeDrawerComponent.setBackground(Color.WHITE);
	}
	
	public static void processHelloDrags() {
		ComponentInputter inputter = new AComponentInputter(shapeDrawerComponent);
		while (true) {
			MouseEvent nextInput = inputter.getMouseDraggedEvent();
			helloShape.setX(nextInput.getX());
			helloShape.setY(nextInput.getY());		
		}	
	}
	
	public static void main (String[] args) {
		JFrame frame = createFrame();
		displayHello(frame.getContentPane());
		frame.setVisible(true);
		processHelloDrags();			
	}
}
