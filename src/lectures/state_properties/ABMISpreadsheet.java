package lectures.state_properties;
public class ABMISpreadsheet  {
	double height;
	double weight;	
	public ABMISpreadsheet() { }	
	public ABMISpreadsheet(
			double theInitialHeight, double theInitialWeight) {
		setHeight(theInitialHeight);
		setWeight(theInitialWeight);
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double newValue) {
		weight = newValue;
	}	
	public double getHeight() {
		return height;
	}
	public void setHeight(double newValue) {
//		System.out.println("setHeight() Called");
		height = newValue;
	}	
	public double getBMI() {
//		System.out.println("getBMI() Called");
		return weight/(height*height);
	}
	
}
