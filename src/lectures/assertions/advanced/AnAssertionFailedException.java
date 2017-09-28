package lectures.assertions.advanced;

public class AnAssertionFailedException extends RuntimeException {
	public AnAssertionFailedException() {
	};

	public AnAssertionFailedException(String initValue) {
		super(initValue);
	}

}