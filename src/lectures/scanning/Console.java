package lectures.scanning;
import java.util.Scanner;
public class Console {
	static Scanner scanner = new Scanner(System.in);
	public static int readInt() {
		return scanner.nextInt();
	}
	public static boolean readBoolean() {
		return scanner.nextBoolean();
	}
	public static double readDouble() {
		return scanner.nextDouble();
	}
	public static String readString() {
		return scanner.nextLine();
	}	
}
