package lectures.reflection_action_objects;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;
import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;

public class ReflectionExamples {
	public static void main(String[] args) {
		BMISpreadsheet bmi = new ABMISpreadsheet(1.77, 75);
		printProperties(bmi);
		Point point = new ACartesianPoint(50, 34);
		printProperties(point);
	}
	
	public static void printProperties(Object object) {
		   System.out.println("Properties of:" + object);
		   Class objectClass = object.getClass();
		   Method[] methods = objectClass.getMethods();
		   Object[] nullArgs = {};
		   for (int index = 0; index < methods.length; index++) {
			Method method = methods[index];
		       if (isGetter(method)) {
			    Object retVal = methodInvoke(object, method, nullArgs);
			    System.out.println(propertyName(method) + ":" + retVal);
		       }
		   }
			System.out.println();
		}
	
	public static String GETTER_PREFIX = "get";
	public static boolean isGetter (Method method) {
		return  method.getParameterTypes().length == 0 && 
			 method.getReturnType() != Void.TYPE &&
			 method.getName().startsWith(GETTER_PREFIX);
	}
	
	public static String propertyName(Method getter) {
		  return getter.getName().substring(GETTER_PREFIX.length());
		}
	
	public static Object  methodInvoke(Object object, Method method, Object[] args ) {
		try {
			return  method.invoke(object, args);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return null;
		} catch (InvocationTargetException e ) {
			e.printStackTrace();
			return null;
		}
	}






}
