package lectures.composite.visitors;

import java.awt.Component;
import java.awt.Dimension;

public class AComponentMagnifier implements ComponentVisitor {
	int magnification;
	public AComponentMagnifier (int aMagnification) {
		magnification = aMagnification;
	}
	public void visit(Component aComponent) {
		Dimension aComponentSize = aComponent.getSize();
		aComponent.setSize(aComponentSize.width*magnification, 
				aComponentSize.height*magnification);
	}
}
