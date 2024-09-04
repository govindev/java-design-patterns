package memento.end.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
