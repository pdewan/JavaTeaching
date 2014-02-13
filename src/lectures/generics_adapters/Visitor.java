package lectures.generics_adapters;

public interface Visitor<NodeType> {
	  public void visit(NodeType aNode);
	}
