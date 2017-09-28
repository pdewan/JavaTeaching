package lectures.generics_adapters.extra;

import java.awt.Color;
import java.awt.Component;

public class AComponentColorer implements Visitor<Component> {
	  Color color;
	  public AComponentColorer(Color aColor) {
	    color = aColor;
	  }
	  public void visit(Component aComponent) {
	    aComponent.setBackground(color);
	  }
	}
