package lectures.exceptions.extra;

public interface WeightSetterWithFinallyAndAssertions {
	public void setWeight(double newValue);
	public boolean preSetWeight();
	public boolean preSetWeight(double newValue);
}
