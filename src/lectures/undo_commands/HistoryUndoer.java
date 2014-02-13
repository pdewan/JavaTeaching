package lectures.undo_commands;
import java.util.ArrayList;
import java.util.List;
public class HistoryUndoer implements Undoer {
    List<UndoableCommand> historyList = new ArrayList();	
    int nextCommandIndex = 0;
	public void execute (UndoableCommand c) {
		while(nextCommandIndex < historyList.size()) {
		      historyList.remove(nextCommandIndex); // clear redo chain
		}		
		c.execute();
		historyList.add(c);	
		nextCommandIndex++;
    }
    public void undo() {
    	if (nextCommandIndex == 0)return;
    	nextCommandIndex--;
    	UndoableCommand c = historyList.get(nextCommandIndex);
    	c.undo();    	
    }
    public void redo() {
        if (nextCommandIndex == historyList.size()) return;
        UndoableCommand c = historyList.get(nextCommandIndex);
        c.execute();
        nextCommandIndex++;			
    }
}