package lectures.extra.oldgraphics;

import lectures.composite.objects_shapes.Point;

public interface Shuttle {	
    public Point getLocation();
    public void setLocation(Point newValue);
    public int getWidth();
    public int getHeight() ;
    //public String getText();
    public String getImageFileName();
}
