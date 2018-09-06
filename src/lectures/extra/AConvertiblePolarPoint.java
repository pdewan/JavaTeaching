package lectures.extra;

import lectures.casting_vs_conversion.AConvertibleCartesianPoint;
import lectures.casting_vs_conversion.ConvertiblePoint;
import lectures.graphics.extra.APolarPoint;

public class AConvertiblePolarPoint extends APolarPoint implements ConvertiblePoint {
	public AConvertiblePolarPoint(double theRadius, double theAngle) {
		super (theRadius, theAngle);
	}	
	public ConvertiblePoint asPolarPoint() {
		return this;
	}
	public ConvertiblePoint asCartesianPoint() {
		return new AConvertibleCartesianPoint(getX(), getY());		
	}
//	public Object clone() {
//		try {
//			return super.clone();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
	
}
