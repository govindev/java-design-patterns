package miscellenious.memento.command;

import miscellenious.memento.WorkflowDesigner;

public class CreateCmmand extends AbstractWorkflowCommand{
    String name;

    public CreateCmmand(WorkflowDesigner receiver, String name) {
        super(receiver);
        this.name = name;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();

        receiver.createWorkflow(name);
    }
}
