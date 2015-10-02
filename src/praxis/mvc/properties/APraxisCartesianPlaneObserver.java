package praxis.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import praxis.composite.objects_shapes.PraxisCartesianPlane;

public class APraxisCartesianPlaneObserver implements PropertyChangeListener{
	PraxisObservableCartesianPlane model;
	public APraxisCartesianPlaneObserver(PraxisCartesianPlane aModel) {
		if (aModel instanceof PraxisCartesianPlane) {
		model = (PraxisObservableCartesianPlane) aModel;
		model.addPropertyChangeListener(this);	
		((PraxisObservableLine) model.getYAxis()).addPropertyChangeListener(this);
		}

	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println ("Property change event:" + evt);
	}

}
