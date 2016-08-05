package lectures.exceptions;

import java.io.IOException;
/**
 * PROGRAMMER-DEFINED EXCEPTION EXAMPLE
 * 
 * Why extend IOException and not (a) Exception or (b) RuntimeException
 */
public class AMissingArgumentException extends IOException{
	public AMissingArgumentException(String message) {
		super(message);
	}
}
