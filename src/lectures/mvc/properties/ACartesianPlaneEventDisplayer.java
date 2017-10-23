package lectures.mvc.properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lectures.mvc.graphics.ObservableCartesianPlane;
import lectures.mvc.properties.atomic.ObservableLine;
import util.annotations.Tags;
@Tags({"Observer", "View"})
public class ACartesianPlaneEventDisplayer implements PropertyChangeListener{
	ObservableCartesianPlane model;
	public ACartesianPlaneEventDisplayer(ObservableCartesianPlane aModel) {
		model =  aModel;
		registerWithModel();		
	}
	void registerWithModel() {
		model.addPropertyChangeListener(this);	
		((ObservableLine) model.getXAxis()).addPropertyChangeListener(this);
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
