package miscellenious.state;

public class Delivered implements OrderState {
    @Override
    public int handleCancellation() {
        System.out.println("Cancelling the order. Cancellation charges are applicable as the Order is in the DELIVERED state. Sending the delivery agent to collect the order.");
        return 30;
    }
}
