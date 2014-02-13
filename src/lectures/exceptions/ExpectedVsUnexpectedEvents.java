package lectures.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExpectedVsUnexpectedEvents {
	static BufferedReader input = new BufferedReader(new InputStreamReader(
			System.in));

	public static void efficientReader() {
		try {
			for (;;) {
				System.out.println(Integer.parseInt(input.readLine()));
			}
		} catch (Exception e) {
		}
	}
	
	public static void wellProgrammedReader() {
		try {
			for (;;) {
				String nextLine = input.readLine();
				if (".".equals(nextLine)) break;
				System.out.println(Integer.parseInt(nextLine));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
