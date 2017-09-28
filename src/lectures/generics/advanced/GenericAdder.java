package lectures.generics.advanced;

public interface GenericAdder<OperandType> {
	public OperandType sum(OperandType val1, OperandType val2);
}
