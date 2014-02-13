package lectures.exceptions;

import java.io.IOException;

public class AMissingArgumentException extends IOException{
	public AMissingArgumentException(String message) {
		super(message);
	}
}
