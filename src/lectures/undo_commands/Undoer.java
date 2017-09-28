package lectures.undo_commands;



public interface Undoer {   
    public void undo();
    public void execute(UndoableCommand command);
    public void redo();
}