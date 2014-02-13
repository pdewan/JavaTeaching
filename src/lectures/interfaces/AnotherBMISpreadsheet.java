package lectures.interfaces;

public class AnotherBMISpreadsheet implements BMISpreadsheet{    
	double height, weight, bmi;    
	public double getHeight() {
        return height;
    }
    public void setHeight(double newHeight) {
        height = newHeight;
        bmi = weight/(height*height);
    }
    
    public double getWeight() {
        return weight;
    }
    public void setWeight(double newWeight) {
        weight = newWeight;
        bmi = weight/(height*height);
    }    
    public double getBMI() {
        return bmi;
    }
}

