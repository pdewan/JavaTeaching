package lectures.state_properties;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
@StructurePattern(StructurePatternNames.NO_PATTERN)
public class AStringEqualsEqualsDemoer {
	public void demoAssignment () {
		String s1 = "hello world";
		String s2 = s1;
		System.out.println(s1 == s2);
	}
	public void demoLiteralAllocation () {
		String s1 = "hello world";
		String s2 = "hello world";
		System.out.println(s1 == s2);

	}
	public void demoNewObjectCreation () {
		String s1 = new String ("hello world");
		String s2 =  new String ("hello world");
		System.out.println(s1 == s2);
	}
	
}
