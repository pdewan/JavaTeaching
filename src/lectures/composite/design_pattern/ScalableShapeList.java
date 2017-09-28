package lectures.composite.design_pattern;

public interface ScalableShapeList extends Scalable {
	public int size();
	public LeafShape get(int index);
	public void add(LeafShape aLeafShape);
}
