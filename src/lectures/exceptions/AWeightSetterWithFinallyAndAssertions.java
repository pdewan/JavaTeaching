package lectures.exceptions;
/**
 * FINALLY FOR METHOD POST CONDITION
 * 
 * A method post condition is a condition that holds when the method terminates.
 * An invariant is a condition that hold true at the start and end of the method.
 * 
 * This example ties finally with establishment of post conditions.assertions
 */
public class AWeightSetterWithFinallyAndAssertions implements WeightSetterWithFinallyAndAssertions {
	double weight;
	public boolean preSetWeight(double newValue) {
		return newValue > 0;
	}
	public boolean preSetWeight() {
		return preSetWeight(weight);
	}
	/**
	 * Use of finally to not replicate shared postcondition assertion code.
	*/
	public void setWeight(double newValue) {
		assert preSetWeight(); // precondition
		try {
			if (!preSetWeight(newValue)) {
				System.out.println("Ignoring illegal weight");
				return;
			}
			weight = newValue;
			System.out.println("Assigning legal weight");

		} finally {
			System.out.println("Asserting precondition/assertion");
			assert preSetWeight(); // post condition
		}
	}
	
	public static void main (String[] args) {
		WeightSetterWithFinallyAndAssertions aWeightSetter = new AWeightSetterWithFinallyAndAssertions();
		aWeightSetter.setWeight(1);
		aWeightSetter.setWeight(-1);

	}
}
