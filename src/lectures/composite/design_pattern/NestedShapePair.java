package lectures.composite.design_pattern;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;

@StructurePattern(StructurePatternNames.BEAN_PATTERN)
public interface NestedShapePair {
//	public static final int RELATIVE_SIZE = 2;
	public ScalableShape getInner();
	public ScalableShape getOuter() ;
	public void scale(double fraction);

}
