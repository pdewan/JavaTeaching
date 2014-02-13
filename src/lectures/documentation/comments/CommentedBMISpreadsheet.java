package lectures.documentation.comments;

/**
 * @author Prasun Dewan 
 * For more info  see: 
 * {@link http://www.oracle.com/technetwork/java/javase/documentation/index-137868.html#exampleresult}
 */
public interface CommentedBMISpreadsheet {	
	double getWeight();   
	/**
     * @param newValue is the new value of variable weight
     * not only sets  values of weight,
     * but also computes new value bmi and 
     * assigns it to variable bmi
     */
	void setWeight(double newValue);
	double getHeight();
	void setHeight(double newHeight);	
	double getBMI();
}
