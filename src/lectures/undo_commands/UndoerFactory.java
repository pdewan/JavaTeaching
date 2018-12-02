package lectures.undo_commands;

public class UndoerFactory {
//	static Undoer undoer = new LastCommandUndoer();
	static Undoer undoer = new HistoryUndoer();


	public static Undoer getUndoer() {
		return undoer;
	}

	public static void setUndoer(Undoer anUndoer) {
		UndoerFactory.undoer = anUndoer;
	}
	

}
