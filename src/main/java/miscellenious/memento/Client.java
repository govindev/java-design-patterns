package miscellenious.memento;

import miscellenious.memento.command.AddStepCommand;
import miscellenious.memento.command.CreateCmmand;
import miscellenious.memento.command.WorkflowCommand;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        WorkflowDesigner designer = new WorkflowDesigner();
        LinkedList<WorkflowCommand> commands = getCommands(designer);

        designer.print();
        undoLastCommand(commands);
        designer.print();

    }

    private static void undoLastCommand(LinkedList<WorkflowCommand> commands) {
        if (!commands.isEmpty()) commands.removeLast().undo();
    }

    private static LinkedList<WorkflowCommand> getCommands(WorkflowDesigner designer) {
        LinkedList<WorkflowCommand> commands = new LinkedList<>();

        WorkflowCommand cmd = new CreateCmmand(designer, "Leave workflow");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer, "Create Leave Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer, "Submit Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer, "Application approved");
        commands.addLast(cmd);
        cmd.execute();

        return commands;
    }
}
