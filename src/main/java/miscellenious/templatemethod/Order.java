package miscellenious.templatemethod;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private String id;
    private LocalDate date;
    private Map<String, Double> items = new HashMap<>();
    private Double total = 0.0;

    public Order(String id) {
        this.id = id;
        this.date = LocalDate.now();
    }

    public void addItem(String item, Double price) {
        items.put(item, price);
        total += price;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getTotal() {
        return total;
    }
}
