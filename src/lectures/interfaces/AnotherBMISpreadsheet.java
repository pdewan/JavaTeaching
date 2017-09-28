package lectures.interfaces;

public class AnotherBMISpreadsheet implements BMISpreadsheet{    
	double height, weight, bmi;    
	public double getHeight() {
        return height;
    }
    public void setHeight(double newValue) {
        height = newValue;
        bmi = weight/(height*height);
    }
    
    public double getWeight() {
        return weight;
    }
    public void setWeight(double newValue) {
        weight = newValue;
        bmi = weight/(height*height);
    }    
    public double getBMI() {
        return bmi;
    }
}

