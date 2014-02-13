package lectures.casting_vs_conversion;

import lectures.graphics.ACartesianPoint;
import lectures.graphics.APolarPoint;
import lectures.graphics.Point;

public class CastingVsConversionExamples {	
	public static void convertingObjects() {
		Point point =  new ACartesianPoint (50, 100);
		point = (APolarPoint) point; // runtime error
		ConvertiblePoint point2 =  
            new AConvertibleCartesianPoint (50, 100);
        point2 = point2.asPolarPoint();
		
	}
	public static void castingObjects() {
		Point point =  new ACartesianPoint (50, 100);
		point = (APolarPoint) point;
		
	}	
	public static void castingAndConvertingPrimitives() {
		int intVal = 5;
		long longVal = intVal;
		double doubleVal = intVal;
		longVal = Long.MAX_VALUE;
		intVal =  (int) longVal;		
	}
	public static void wrappingUnwrapping() {
		"Joe Doe".toString();
//		5.toString();
		"Joe Doe".equals(5);
		"Joe Doe".equals(new Integer(5));
		int i = 5 + new Integer(5);
		i = 5 + (new Integer(5)).intValue();		
	}

}
