package miscellenious.memento.command;

import miscellenious.memento.WorkflowDesigner;

public abstract class AbstractWorkflowCommand implements WorkflowCommand {

    public WorkflowDesigner receiver;
    protected WorkflowDesigner.Memento memento;

    public AbstractWorkflowCommand(WorkflowDesigner receiver) {
        this.receiver = receiver;
    }

    @Override
    public void undo() {
        receiver.setMemento(memento);
    }
}
