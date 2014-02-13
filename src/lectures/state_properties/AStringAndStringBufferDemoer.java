package lectures.state_properties;

import bus.uigen.ObjectEditor;

public class AStringAndStringBufferDemoer {
	public  void demoStringExtension() {
		String s = "hello";
		String hello = s;
		s += " world";
		System.out.println( s == hello);
	}
	public  void demoStringBufferExtension() {
		StringBuffer s = new StringBuffer("hello");
		StringBuffer hello = s;
		s.append(" world");
		System.out.println(s == hello);
	}
	public static void main(String[] args) {
		ObjectEditor.edit(new AStringAndStringBufferDemoer());
	}

}
