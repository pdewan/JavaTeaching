package lectures.graphics;

public class APolarPoint implements Point {
	double radius, angle;
	public APolarPoint(double theRadius, double theAngle) {
		radius = theRadius;
		angle = theAngle;
	}
	public APolarPoint(int theX, int theY) {
		radius = Math.sqrt(theX*theX + theY*theY);
		angle = Math.atan((double) theY/theX);
	}
	public int getX() { return (int) (radius*Math.cos(angle)); }
	public int getY() { return (int) (radius*Math.sin(angle)); }
	public double getAngle() { return angle; } 
	public double getRadius() { return radius;}	
}
