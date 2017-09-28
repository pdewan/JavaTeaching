package lectures.equals_polymorphism_overloading;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import bus.uigen.ObjectEditor;
@StructurePattern(StructurePatternNames.NO_PATTERN)
public class AStringEqualsDemoer {
	public void demoAssignment () {
		String s1 = "hello world";
		String s2 = s1;
		printComparison (s2, s1);		
	}
	public void demoLiteralAllocation () {
		String s1 = "hello world";
		String s2 = "hello world";
		printComparison (s2, s1);		
	}
	public void demoNewObjectCreation () {
		String s1 = new String ("hello world");
		String s2 =  new String ("hello world");
		printComparison (s2, s1);		
	}
	
	public void printComparison (String s1, String s2) {
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
	public static void main (String[] args) {			;
		ObjectEditor.edit(new AStringEqualsDemoer());		
		
	}
}
