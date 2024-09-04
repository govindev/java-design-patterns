package miscellenious.memento.command;

import miscellenious.memento.WorkflowDesigner;

public class RemoveStepCommand extends AbstractWorkflowCommand {
    String step;

    public RemoveStepCommand(WorkflowDesigner receiver, String step) {
        super(receiver);

        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();

        receiver.removeStep(step);
    }
}
