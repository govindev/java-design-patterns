package miscellenious.prototype;

public class General extends GameUnit {
    private String state = "idle";


    public void boostMorale() {
        this.state = "BoostMorale";
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset operation is not supported");
    }

    @Override
    public String toString() {
        return "General " + state + " @ " + getPosition();
    }
}
