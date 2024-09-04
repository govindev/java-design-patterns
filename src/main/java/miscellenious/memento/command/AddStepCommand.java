package miscellenious.memento.command;


import miscellenious.memento.WorkflowDesigner;

public class AddStepCommand extends AbstractWorkflowCommand {
    String step;

    public AddStepCommand(WorkflowDesigner receiver, String step) {
        super(receiver);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();

        this.receiver.addStep(step);
    }

}
