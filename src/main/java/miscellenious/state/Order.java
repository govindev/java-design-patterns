package miscellenious.state;

public class Order {
    private OrderState orderState;

    public Order() {
        this.orderState = new New();
    }

    public int cancel() {
        int charges = orderState.handleCancellation();
        this.orderState = new Cancelled();
        return charges;
    }

    public void pay() {
        this.orderState = new Paid();
    }

    public void dispatch() {
        this.orderState = new Dispatched();
    }

    public void deliver() {
        this.orderState = new Delivered();
    }
}
