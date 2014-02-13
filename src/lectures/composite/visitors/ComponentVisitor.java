package lectures.composite.visitors;

import java.awt.Component;

public interface ComponentVisitor {
	public void visit(Component aComponent);
}
