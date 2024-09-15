package miscellenious.templatemethod;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {
        Order order = new Order("100");

        order.addItem("Pizza", 169.0);
        order.addItem("Pepsi", 60.0);
        order.addItem("Garlic Bread", 120.0);

        OrderPrinter orderPrinter = new HtmlPrinter();
        orderPrinter.print(order, "1001.html");
    }
}
