package lectures.extra.oldgraphics;

import lectures.graphics.extra.Point;

public interface ShuttleImage {	
    public Point getLocation();
    public void setLocation(Point newValue);
    public int getWidth();
    public int getHeight() ;
    //public String getText();
    public String getImageFileName();
}
