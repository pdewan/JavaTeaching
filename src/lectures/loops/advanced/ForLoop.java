package lectures.loops.advanced;

public class ForLoop {
	

	public static void printEachChacracterOnASeperateLineWithWhile(String s) {
		int i = 0; 
		while (i < s.length()) {
			System.out.println(s.charAt(i));		 
			i++; 
		}
	}
	
	public static void printEachChacracterOnASeperateLineWithFor(String s) {
		for (int i=0; i<s.length(); i++)
			System.out.println(s.charAt(i));
	}

}
