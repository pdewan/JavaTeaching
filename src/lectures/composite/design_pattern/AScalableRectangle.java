package lectures.composite.design_pattern;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
@StructurePattern(StructurePatternNames.RECTANGLE_PATTERN)
public class AScalableRectangle extends AScalableShape {
	public AScalableRectangle(int theX, int theY, int theWidth, int theHeight) {
		super(theX, theY, theWidth, theHeight);
	}
}
