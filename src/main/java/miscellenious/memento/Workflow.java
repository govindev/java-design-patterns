package miscellenious.memento;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Workflow {
    private String name;
    private List<String> steps;

    public Workflow(String name) {
        this.name = name;
        this.steps = new LinkedList<>();
    }

    public Workflow(String name, String... steps) {
        this.name = name;
        this.steps = new LinkedList<>();
        if (steps != null && steps.length > 0) {
            Arrays.stream(steps).forEach(this::addStep);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStep(String step) {
        steps.add(step);
    }

    public void removeStep(String step) {
        steps.remove(step);
    }

    public String[] getSteps() {
        if (steps == null || steps.isEmpty()) return null;
        return steps.toArray(String[]::new);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Workflow : Name = ");
        sb.append(name);
        sb.append("\nSteps : ");
        steps.forEach(step -> {
            sb.append(step);
            sb.append("->");
        });
        sb.append("]");
        return sb.toString();
    }
}
