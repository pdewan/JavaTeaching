package praxis.composite.tree_dag_graph_objects_windows;

import lectures.composite.objects_shapes.LineWithObjectProperty;
import lectures.composite.tree_dag_graph_objects_windows.DAGCartesianPlane;

public interface PraxisLineWithObjectProperty extends LineWithObjectProperty {	
    public DAGCartesianPlane getGraph();
    public void setGraph (DAGCartesianPlane aParent);
    
}