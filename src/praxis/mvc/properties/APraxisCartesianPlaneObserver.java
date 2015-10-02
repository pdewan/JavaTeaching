package praxis.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class APraxisCartesianPlaneObserver implements PropertyChangeListener{
	PraxisObservableCartesianPlane model;
	public APraxisCartesianPlaneObserver(PraxisObservableCartesianPlane aModel) {
		model = aModel;	
		((PraxisObservableLine) model.getXAxis()).addPropertyChangeListener(this);
		((PraxisObservableLine) model.getXAxis()).addPropertyChangeListener(this);

	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println ("Property change event:" + evt);
	}

}
