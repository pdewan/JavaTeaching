package lectures.animation.threads_commands.extra;

import bus.uigen.OEFrame;

public class CompositeCommandDriver extends CommandsDriver{
	public static void main (String[] args) {
		CompositeCommand commands = new ACompositeCommand();
		OEFrame oeFrame = createAndDisplayCommands(commands);
		commands.run();		
	}

}
