package lectures.loops.advanced;

import java.io.DataInputStream;
public class CounterBasedNumberMultiplier {
	static DataInputStream dataIn = new DataInputStream (System.in);
	
	public static void main (String args[]) {
		int product = 1;
		int n = readNumElements();
		int counter = 0;
		while (counter < n) {
			int nextNum = readNum();
			product *= nextNum; 			
			counter += 1;
		}
		print(product);
	}
	
	public static int readNumElements() {
		System.out.println("List Length?");
		return readInt();
	}
	
	public static int readNum() {
		System.out.println("Next Number?");
		return readInt();
	}
	
	public static int readInt() {
		try {
			return Integer.parseInt(dataIn.readLine());
		} catch (Exception e) {
			return 0;
		}	
	}
	
	public static void print(int product) {
		System.out.println("List Product:");
		System.out.println(product);
	}
	
	public static void pause() {
		try {
			System.in.read();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
