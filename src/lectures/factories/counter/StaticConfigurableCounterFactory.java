package lectures.factories.counter;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import java.util.Scanner;

import lectures.mvc.Counter;

public class StaticConfigurableCounterFactory {
	public static final String CONFIGURATION_FILE_NAME = "config.txt";
	static Class counterClass = AShortCounter.class;
	static Constructor counterConstructor;
	public static Counter createCounter (short initValue) {
		try {
			counterConstructor = counterClass.getConstructor(short.class);
			return (Counter) counterConstructor.newInstance(initValue);

		} catch (NoSuchMethodException | InstantiationException | IllegalAccessException | 
				IllegalArgumentException | InvocationTargetException  e) {
			e.printStackTrace();
			return new AShortCounter((short) 0);
		}
	}
	public static Counter createCounter () {
		return createCounter((short) 0);
	}
	static { // executed once for each class before it is used
		try {
			Scanner aScanner = new Scanner (new File(CONFIGURATION_FILE_NAME));
			counterClass = Class.forName(aScanner.nextLine());		
		} catch (FileNotFoundException | NoSuchElementException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}
