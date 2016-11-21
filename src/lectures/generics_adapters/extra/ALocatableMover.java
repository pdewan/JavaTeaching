package lectures.generics_adapters.extra;


public class ALocatableMover implements Visitor<Locatable> {
	  int x, y;
	  public ALocatableMover(int anX, int aY) {
	    x = anX;
	    y = aY;
	  }
	  public void visit(Locatable aLocatable) {
	     aLocatable.setX(x);
	     aLocatable.setY(y);
	  }
	  
	  public static void main (String[] args) {
		  Visitor visitor = new ALocatableMover(0, 0);
		 
	  }
	}
