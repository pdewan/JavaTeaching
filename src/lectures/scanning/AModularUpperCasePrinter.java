package lectures.scanning;
public class AModularUpperCasePrinter {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Illegal number of arguments:" + args.length
					+ ". Terminating program.");
			System.exit(-1);
		}
		AModularConsoleReadingUpperCasePrinter.scanAndPrint(args[0]);
	}
	
	

}
