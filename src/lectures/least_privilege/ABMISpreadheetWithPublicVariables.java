package lectures.least_privilege;

import lectures.interfaces.BMISpreadsheet;
import util.trace.TraceableLog;
import util.trace.TraceableLogFactory;
import bus.uigen.ObjectEditor;

public class ABMISpreadheetWithPublicVariables implements BMISpreadsheet {
	public double height, weight, bmi; // BAD IDEA!!
	public double getWeight() {
		return weight;
	}
	public void setWeight(double newWeight) {
		weight = newWeight;
	}	
	public double getHeight() {
		return height;
	}
	public void setHeight(double newHeight) {
		height = newHeight;
	}	
	public double getBMI() {
		return weight/(height*height);
	}
	public static void main (String[] args) {

		ObjectEditor.edit(new ABMISpreadheetWithPublicVariables());
		TraceableLog log = TraceableLogFactory.getTraceableLog();		
		System.out.println(log.getLog());

	}

}
