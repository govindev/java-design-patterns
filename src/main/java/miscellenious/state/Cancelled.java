package miscellenious.state;

public class Cancelled implements OrderState {
    @Override
    public int handleCancellation() {
        throw new IllegalStateException("Can't cancel the order which is in CANCELLED state. Illegal state.");
    }
}
