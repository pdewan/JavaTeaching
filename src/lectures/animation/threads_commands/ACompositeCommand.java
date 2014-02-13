package lectures.animation.threads_commands;

import lectures.generics_adapters.AHistory;

public class ACompositeCommand extends AHistory<Runnable> implements CompositeCommand{

	@Override
	public void run() {
		for (int i = 0; i < size(); i++) {
			elementAt(i).run();
		}
		
	}

}
