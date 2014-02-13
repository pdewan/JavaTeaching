package lectures.animation.threads_commands;

import lectures.generics_adapters.History;

public interface CompositeCommand  extends History<Runnable>, Runnable{

}
