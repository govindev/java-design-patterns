package miscellenious.state;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();

        order.pay();
        order.dispatch();
        order.deliver();

        order.cancel();
    }
}
