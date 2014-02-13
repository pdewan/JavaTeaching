package lectures.graphics;
import util.annotations.Explanation;
//@StructurePattern(StructurePatternNames.POINT_PATTERN)
@Explanation("Location in Java coordinate System.")
public interface Point {
	public int getX(); 
	public int getY(); 	
	public double getAngle(); 
	public double getRadius(); 
}
