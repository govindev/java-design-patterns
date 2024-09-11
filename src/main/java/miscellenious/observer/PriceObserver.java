package miscellenious.observer;

public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        double itemsCost = order.getItemsCost();
        if (itemsCost >= 500) {
            order.setDiscount(20);
        } else if (itemsCost >= 200) {
            order.setDiscount(10);
        }
    }
}
