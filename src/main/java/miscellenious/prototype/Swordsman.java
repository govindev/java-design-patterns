package miscellenious.prototype;

public class Swordsman extends GameUnit {
    private String state = "idle";

    @Override
    public void reset() {
        this.state = "idle";
    }

    public void attack() {
        state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman " + state + " @ " + getPosition();
    }
}
