package lectures.types.char_string;

public class ACharAndStringDemoer {
	void charOrder() {
		System.out.println('a' > 'b');
		System.out.println('B' > 'A');
		System.out.println('4' > '0');
		System.out.println('a' > 'A');
		System.out.println('a' > '0');
	}
	
	void charToInt() {
		System.out.println((int) 'c' - (int) 'a');
		System.out.println('c' - 'a');
		System.out.println((char) ('c' - 2));
		System.out.println((char) ('A' + 2));
		System.out.println((char) ('C' - 'A' + 2));
	}
	
	void isLetter() {	
		System.out.println(Character.isLetter('c'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isLetter(' '));
		char c = '?';
		System.out.println(Character.isLetter(c));

	}
	
	void chartAtAndLength() {
		String s = "hello world";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(11));
		System.out.println(s.length());
		System.out.println(" ".length());
		System.out.println("".length());		
	}
	void stringConstants() {
		String s = "hello";
		s = "123";
		s = "hello 123";
//		s = 'a';
		s = "";
		s = "hello\n\n 123";
//		s = "\";
		s = "\\";
	}
	void subString() {
		 System.out.println("hello world".substring(4, 7));
		 System.out.println("hello world".substring(4, 4));
		 System.out.println("hello world".substring(7, 4));
	}
	void stringToUpperLowerCase() {
		System.out.println("Hello World".toLowerCase());
		System.out.println("Hello World".toUpperCase());


	}

}
