package miscellenious.observer;

public class Client {
    public static void main(String[] args) {
        Order order = new Order("100");

        order.attach(new PriceObserver());
        order.attach(new QuantityObserver());

        System.out.println(order);

        order.addItem(100.00);

        System.out.println(order);

        order.addItem(100.00);

        System.out.println(order);

        order.addItem(100.00);
        order.addItem(100.00);
        order.addItem(100.00);
        order.addItem(100.00);

        System.out.println(order);
    }
}
