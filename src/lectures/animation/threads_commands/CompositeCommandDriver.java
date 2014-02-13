package lectures.animation.threads_commands;

import lectures.animation.loops.AShuttleAnimator;
import lectures.animation.loops.ShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.generics_adapters.AHistory;
import lectures.generics_adapters.History;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class CompositeCommandDriver extends CommandsDriver{
	public static void main (String[] args) {
		CompositeCommand commands = new ACompositeCommand();
		OEFrame oeFrame = createAndDisplayCommands(commands);
		commands.run();		
	}

}
