package miscellenious.state;

public class Dispatched implements OrderState {
    @Override
    public int handleCancellation() {
        System.out.println("Cancelling the order. Cancellation charges are applicable as the Order is in the DISPATCHED state. Contacting delivery agent to stop the delivery.");
        return 20;
    }
}
