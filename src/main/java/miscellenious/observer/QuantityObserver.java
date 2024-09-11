package miscellenious.observer;

public class QuantityObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        int quantity = order.getQuantity();
        if (quantity <= 5) {
            order.setShippingCost(10);
        } else {
            order.setShippingCost(10 + (quantity - 5) * 1.5);
        }
    }
}
