package lectures.composite.objects_shapes;

import lectures.graphics.Point;

public interface LineWithObjectProperty {	
    public Point getLocation();
    public void setLocation(Point newVal);
    public int getWidth();
    public void setWidth(int newVal);
    public int getHeight();
    public void setHeight(int newVal);
}