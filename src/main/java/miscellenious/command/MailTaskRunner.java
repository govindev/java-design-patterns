package miscellenious.command;

import java.util.ArrayList;
import java.util.List;

public class MailTaskRunner implements Runnable {


    private final Thread runner;
    private Boolean stop = false;

    private final List<Command> pendingCommands;
    private static final MailTaskRunner mailTaskRunner = new MailTaskRunner();
    private MailTaskRunner() {
        pendingCommands = new ArrayList<>();
        runner = new Thread(this);
        runner.start();
    }

    public static MailTaskRunner getInstance() {
        return mailTaskRunner;
    }

    @Override
    public void run() {
        while(true) {
            Command cmd = null;
            synchronized (pendingCommands) {
                if (pendingCommands.isEmpty()) {
                    try {
                        pendingCommands.wait();
                    } catch (InterruptedException ex) {
                        System.out.println("Running interrupted");
                        if (stop) {
                            System.out.println("Running stopping");
                            return;
                        }
                    }
                } else {
                    cmd = pendingCommands.remove(0);
                    if (cmd == null) return;
                    cmd.execute();
                }
            }
        }
    }

    public void addCommand(Command cmd) {
        synchronized (pendingCommands) {
            pendingCommands.add(cmd);
            pendingCommands.notifyAll();
        }
    }

    public void shutdown() {
        this.stop = true;
        this.runner.interrupt();
    }
}

