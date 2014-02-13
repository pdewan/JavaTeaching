package lectures.undo_commands;
public interface UndoableCommand {
    public  void execute();
    public  void  undo();
}