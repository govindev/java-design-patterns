package miscellenious.state;

public class New implements OrderState {

    @Override
    public int handleCancellation() {
        System.out.println("Cancelling the order. No charges are applicable as Order is in NEW state.");
        return 0;
    }
}
