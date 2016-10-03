package lectures.inheritance.extra;

import lectures.inheritance.is_a.Locatable;

// Stub class to show why no multiple inheritance in Java
public class ALocatable implements Locatable{

	@Override
	public String toString() {
		return "A Locatable";
	}
	@Override
	public int getX() {
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(int newVal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(int newVal) {
		// TODO Auto-generated method stub
		
	}

}
