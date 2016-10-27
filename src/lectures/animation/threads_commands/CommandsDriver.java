package lectures.animation.threads_commands;

import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.generics_adapters.AHistory;
import lectures.generics_adapters.History;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class CommandsDriver {	
	public static OEFrame createAndDisplayCommands (History<Runnable> commands) {
		PlottedShuttle shuttle = new AnObservablePlottedShuttle(50, 100);
		ShuttleAnimator shuttleAnimator = new AShuttleAnimator();
		commands.addElement(new AShuttleAnimationCommand(shuttleAnimator, shuttle, 10, 100));
		commands.addElement(new AShuttleAnimationCommand(shuttleAnimator, shuttle, 10, 200));
		commands.addElement(new AShuttleAnimationCommand(shuttleAnimator, shuttle, 10, 300));
		commands.addElement(new AShuttleAnimationCommand(shuttleAnimator, shuttle, 10, 400));
		OEFrame shuttleFrame =ObjectEditor.edit(shuttle);
		shuttleFrame.hideMainPanel();
		OEFrame commandsFrame = ObjectEditor.edit(commands);
		commandsFrame.setLocation(350, 0);
		return commandsFrame;
	}
	public static void main (String[] args) {
		History<Runnable> commands = new AHistory();
		OEFrame oeFrame = createAndDisplayCommands(commands);
		for (int i = 0; i < commands.size(); i++) {
			ThreadSupport.sleep(1000);
			commands.elementAt(i).run();
			oeFrame.select(commands, i);
		}
	}

}
