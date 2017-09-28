package lectures.loops;

import java.io.DataInputStream;
public class SentinelBasedFoldingNumberMultiplier {
	static DataInputStream dataIn = new DataInputStream (System.in);
	
	public static void main (String args[]) {
		int intNum = 1;
		int nextNum = readNumber();
	      	while (nextNum >= 0) {
	      		intNum *= nextNum;
	      		nextNum = readNumber();
		}
		print(intNum);
		pause();
	}
	
	public static int readNumber() {	
		return readInt();
	}
	
	public static int readInt() {
		try {
			return Integer.parseInt(dataIn.readLine());
		} catch (Exception e) {
			return 0;
		}	
	}
	
	public static void print(int total) {
		System.out.println(total);
	}
	
	public static void pause() {
		try {
			System.in.read();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
