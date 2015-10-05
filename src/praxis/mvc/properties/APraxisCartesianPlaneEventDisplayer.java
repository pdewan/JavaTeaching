package praxis.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.annotations.Tags;
@Tags({"Observer", "View"})
public class APraxisCartesianPlaneEventDisplayer implements PropertyChangeListener{
	PraxisObservableCartesianPlane model;
	public APraxisCartesianPlaneEventDisplayer(PraxisObservableCartesianPlane aModel) {
		model =  aModel;
		registerWithModel();		
	}
	void registerWithModel() {
		model.addPropertyChangeListener(this);	
		((PraxisObservableLine) model.getXAxis()).addPropertyChangeListener(this);
		// comment in this code, one line at a time and see the effect
//		((PraxisObservableLine) model.getYAxis()).addPropertyChangeListener(this);	
//		((PraxisObservableStringShape) model.getXLabel()).addPropertyChangeListener(this);	
//		((PraxisObservableStringShape) model.getYLabel()).addPropertyChangeListener(this);	


	}
	@Override
	// notification method
	public void propertyChange(PropertyChangeEvent evt) {
		// put break here
		System.out.println ("Property change event:" + evt);
	}

}
