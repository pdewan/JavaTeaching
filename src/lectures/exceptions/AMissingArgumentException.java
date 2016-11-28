package lectures.exceptions;

import java.io.IOException;
/**
 * PROGRAMMER-DEFINED EXCEPTION EXAMPLE
 * 
 * 
 */
public class AMissingArgumentException extends IOException{
	public AMissingArgumentException(String message) {
		super(message);
	}
}
/*
 *(T/F) It is possible to create our own Exception class by subclassing an
 * existing Exception class
 * 
 * Return back to LinesReaderAndPrinterUsingProgrammerDefinedException
 */ 
