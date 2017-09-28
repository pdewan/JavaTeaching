package lectures.animation.mvc;

import java.awt.Component;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import lectures.animation.loops.ShuttleAnimationDriver;
import lectures.animation.threads_commands.AShuttleAnimator;
import lectures.animation.threads_commands.ShuttleAnimator;
import lectures.mvc.graphics.APlottedShuttleView;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import lectures.mvc.properties.ObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class MultipleViewShuttleAnimationDriver extends  ShuttleAnimationDriver {	
	public static void main(String[] args) {
		ObservablePlottedShuttle shuttle = new AnObservablePlottedShuttle(50, 100);
		OEFrame oeFrame = ObjectEditor.edit(shuttle);
		oeFrame.hideMainPanel();
		oeFrame.setSize (400, 400);
		oeFrame.setLocation(400, 0);
		PropertyChangeListener view = new APlottedShuttleView(shuttle);
		shuttle.addPropertyChangeListener(view);
		JFrame frame = new JFrame("Plotted Shuttle");
		frame.add((Component) view);
		frame.setSize(400, 400);
		frame.setVisible(true);
		ShuttleAnimator shuttleAnimator = new AShuttleAnimator();
		demoShuttleAnimation(shuttleAnimator, shuttle, oeFrame);
	}
}
