package miscellenious.observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String id;

    public Order(String id) {
        this.id = id;
    }


    private Double itemsCost = 0.0;
    private Double shippingCost = 0.0;
    private Integer quantity = 0;
    private Double discount = 0.0;

    public Double getItemsCost() {
        return itemsCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    private final List<OrderObserver> observers = new ArrayList<>();

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void addItem(Double itemCost) {
        itemsCost += itemCost;
        quantity++;
        observers.forEach(observer -> observer.updated(this));
    }

    public Double getTotal() {
        return (itemsCost + shippingCost - discount);
    }

    @Override
    public String toString() {
        return "Order with id : " + id + " has order total of " + getTotal() + " [Discount : " + discount + ", Quanitity : " + quantity + ", Shipping Cost : " + shippingCost + "]";
    }
}
