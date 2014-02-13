package lectures.main_consoleinput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {
	static BufferedReader inputStream = new BufferedReader(
			new InputStreamReader(System.in));
	public static String readString() {
		try {
			return inputStream.readLine();
		} catch (Exception e) {
			System.out.println(e);
			return "";
		}
	}
	public static int readInt() {
		try {
			return Integer.parseInt(inputStream.readLine());
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}	
	public static double readDouble() {
		try {
			return Double.valueOf(inputStream.readLine()).doubleValue();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	public static boolean readBoolean() {
		try {
			return new Boolean(inputStream.readLine()).booleanValue();
		} catch (Exception e) {
			System.out.println(e);
			return true;
		}
	}

	public static void waitForUserInput() {
		try {
			System.in.read();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
