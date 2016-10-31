package lectures.animation.threads_commands.extra;

import lectures.generics_adapters.History;

public interface CompositeCommand  extends History<Runnable>, Runnable{

}
