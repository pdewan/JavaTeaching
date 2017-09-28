package lectures.documentation.comments;

/** This version recalculates the bmi
 *  when weight or height change, not when
 *  getBMI is called
 */
public class CommentedAnotherBMISpreadsheet implements CommentedBMISpreadsheet{
	// redundant comment
	double height; // height
	// useful comment, bad variable name
	double h; // height
	double weight;
	double bmi; //computed by setWeight and setHeight
    
	public double getHeight() {
        return height;
    }
	
    public void setHeight(double newValue) {
        height = newValue;
        /* recompute dependent properties */
        bmi = weight/(height*height); 
        /*
   	    System.out.println(newValue);  // debugging statement nests in general comment
   	 	*/
    }
   
    public double getWeight() {
        return weight;
    }
 
    public void setWeight(double newValue) {    	
        weight = newValue;
        /* recompute dependent 
   	       properties */
        bmi = weight/(height*height);
//   	    System.out.println(newValue);
   	 	
    }
    /**
     * height and weight should be >=0
     */
    public double getBMI() {
        return bmi;
    }
}

