package lectures.main_consoleinput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AnInputPrinter {
	public static void main(String[] args) {
		System.out.println("Please enter the line to be printed");
		System.out.println("The input was: " + readString());
	}

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

}
