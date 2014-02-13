package lectures.state_properties;
public class ABMISpreadsheetTester {	
	public void test (double theHeight, double theWeight, double theCorrectBMI) {		
		ABMISpreadsheet bmiSpreadsheet = new ABMISpreadsheet();
		bmiSpreadsheet.setHeight(1.77);
		bmiSpreadsheet.setWeight(75);
		double computedBMI = bmiSpreadsheet.getBMI();
		System.out.println("------------");
		System.out.println("Height:" + theHeight);
		System.out.println("Weight:" + theWeight);
		System.out.println("Expected BMI:" + theCorrectBMI);
		System.out.println("Computed BMI:" + computedBMI);
		System.out.println("Error:" + (theCorrectBMI - computedBMI));
		System.out.println("------------");
	}
	public void test2 (double theHeight, double theWeight, double theCorrectBMI) {		
		ABMISpreadsheet bmiSpreadsheet = new ABMISpreadsheet();
		bmiSpreadsheet.setHeight(theHeight);
		bmiSpreadsheet.setWeight(theWeight);
		double computedBMI = bmiSpreadsheet.getBMI();
		System.out.println("------------");
		System.out.println("Height:" + theHeight);
		System.out.println("Weight:" + theWeight);
		System.out.println("Expected BMI:" + theCorrectBMI);
		System.out.println("Computed BMI:" + computedBMI);
		System.out.println("Error:" + (theCorrectBMI - computedBMI));
		System.out.println("------------");
	}
	
	public void test () {
		test (1.65, 55, 20.0);
		test (1.55, 60, 25);
		test (1.80, 65, 20);
	}
	public static void main (String[] args) {
		ABMISpreadsheetTester tester = new ABMISpreadsheetTester();
		
	}
}
