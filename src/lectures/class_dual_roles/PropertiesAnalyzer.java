package lectures.class_dual_roles;

// Java Beans is an industry standard formally defined by these imported classes and others
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class PropertiesAnalyzer {
	// the following method uses the imported Bean classes. You do no have to understand how it
	// works, though the curious may want to look at it at leisure
	public static void printProperties (Object anObject) {
		try {
			Class aClass = anObject.getClass();
			BeanInfo aBeanInfo = Introspector.getBeanInfo(aClass);
			PropertyDescriptor[] aPropertyDesciptors = aBeanInfo.getPropertyDescriptors();
			System.out.println ("Properties defined by:" + aClass.getSimpleName());
			for (PropertyDescriptor aPropertyDescriptor:aPropertyDesciptors) {
				String aName = aPropertyDescriptor.getName();
				// every object has this inherited property, we want to ignore inheritance issues right now
				if ("class".equals(aName)) { 
					continue;
				}
				String aType = aPropertyDescriptor.getPropertyType().getSimpleName();
				boolean isEditable = aPropertyDescriptor.getWriteMethod() != null;
				String aNameAndType = aName + ":" + aType;
				String anEditable = isEditable?"Editable ":"ReadOnly ";
				System.out.println (anEditable + aNameAndType);
				
			}
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
	}
	// run this program multiple times and think about what will happen before you test each change.
	// 1. as such
	// 2. change the name of the  instance variables, number to n in ALoopingFactorialSpreadsheet
	//  Does the property description change and if so how?
	// 3. Change the name of the method getNumber to getN. Does the property description change and if so how?
	// 4. Change the name of the method getN to obtainNumber(). Does the property description change and if so how?
	// 5. Comment out the setNumber method? Does the property description change and if so how?
	// 6. Uncomment the method to remove compile errors. 
	// 7. Comment out the method getFactorial();Does the property description change and if so how?
	// 8. Add an extra parameter, say int i, to getNumber. Does the property description change and if so how?
	// 9. Remove the parameter. 
	// 10. Now add an extra parameter, say int i, to setNumber. Does the property description change and if so how?
	// 11. Remove both parameters. Does the property description change and if so how?
	// 12. Restore the original parameter, but give it a different name, say n. Does the property description change and if so how? 
	public static void main (String[] args) {
		printProperties(new ALoopingFactorialSpreadsheet());
	// 13. Uncomment the code below.  Click on name and press F3 to visit he the definition
	// of this pretender.
		printProperties(new AFactorialSpreadsheetPretender());
	}

}
