package lectures.animation.threads_commands;

import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.generics_adapters.AHistory;
import lectures.generics_adapters.History;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class CommandsCreator {
	public static void main (String[] args) {
		History<Runnable> commands = new AHistory();
		PlottedShuttle shuttle1 = new AnObservablePlottedShuttle(100, 50);
		ShuttleAnimator shuttleAnimator = new AShuttleAnimator();
		commands.addElement(new AShuttleAnimationCommand(shuttleAnimator, shuttle1, 10, 100));
		commands.addElement(new AShuttleAnimationCommand(shuttleAnimator, shuttle1, 10, 200));
		commands.addElement(new AShuttleAnimationCommand(shuttleAnimator, shuttle1, 10, 300));
		commands.addElement(new AShuttleAnimationCommand(shuttleAnimator, shuttle1, 10, 400));

		ObjectEditor.edit(shuttle1);
		OEFrame oeFrame = ObjectEditor.edit(commands);
		for (int i = 0; i < commands.size(); i++) {
			ThreadSupport.sleep(1000);
			commands.elementAt(i).run();
			oeFrame.select(commands, i);
		}


	}

}
