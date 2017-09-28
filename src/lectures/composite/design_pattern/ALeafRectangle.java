package lectures.composite.design_pattern;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
@StructurePattern(StructurePatternNames.RECTANGLE_PATTERN)
public class ALeafRectangle extends ALeafShape {
	public ALeafRectangle(int theX, int theY, int theWidth, int theHeight) {
		super(theX, theY, theWidth, theHeight);
	}
}
