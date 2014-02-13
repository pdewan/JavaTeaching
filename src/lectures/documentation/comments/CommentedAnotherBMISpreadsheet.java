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
	
    public void setHeight(double newHeight) {
        height = newHeight;
        /* recompute dependent properties */
        bmi = weight/(height*height); 
        /*
   	    System.out.println(newHeight);  // debugging statement nests in general comment
   	 	*/
    }
   
    public double getWeight() {
        return weight;
    }
 
    public void setWeight(double newWeight) {    	
        weight = newWeight;
        /* recompute dependent 
   	       properties */
        bmi = weight/(height*height);
//   	    System.out.println(newHeight);
   	 	
    }
    /**
     * height and weight should be >=0
     */
    public double getBMI() {
        return bmi;
    }
}

