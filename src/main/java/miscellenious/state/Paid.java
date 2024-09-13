package miscellenious.state;

public class Paid implements OrderState {
    @Override
    public int handleCancellation() {
        System.out.println("Cancelling the order. Cancellation charges are applicable as the order is in the PAID state. Contacting payment gateway for transaction rollback.");
        return 10;
    }
}
