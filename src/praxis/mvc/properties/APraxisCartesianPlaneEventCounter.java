package praxis.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.annotations.Tags;
@Tags({"Observer"})
public class APraxisCartesianPlaneEventCounter implements PropertyChangeListener{
	PraxisObservableCartesianPlane model;
	int numEvents;
	public APraxisCartesianPlaneEventCounter(PraxisObservableCartesianPlane aModel) {
		model =  aModel;
		registerWithModel();		
	}
	void registerWithModel() {
		model.addPropertyChangeListener(this);	
//		((PraxisObservableLine) model.getXAxis()).addPropertyChangeListener(this);
//		((PraxisObservableLine) model.getYAxis()).addPropertyChangeListener(this);	
//		((PraxisObservableStringShape) model.getXLabel()).addPropertyChangeListener(this);	
//		((PraxisObservableStringShape) model.getYLabel()).addPropertyChangeListener(this);	


	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// put break here
		numEvents++;
	}
	public int getNumEvents() {
		return numEvents;
	}

}
