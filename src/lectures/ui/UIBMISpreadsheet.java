package lectures.ui;


public interface UIBMISpreadsheet {	
	double getWeight();
	void setWeight(double newValue);	
	double getHeight();
	void setHeight(double newValue);	
	double getBMI();
	void incrementWeight(double anIncrement);
	void incrementHeight(double anIncrement);
}
