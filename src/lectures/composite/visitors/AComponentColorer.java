package lectures.composite.visitors;

import java.awt.Color;
import java.awt.Component;

public class AComponentColorer implements ComponentVisitor {
	Color color;
	public AComponentColorer(Color aColor) {
		color = aColor;
	}
	public void visit(Component aComponent) {
		aComponent.setBackground(color);
	}
}
