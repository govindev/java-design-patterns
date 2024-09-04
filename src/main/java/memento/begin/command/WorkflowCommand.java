package memento.begin.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
