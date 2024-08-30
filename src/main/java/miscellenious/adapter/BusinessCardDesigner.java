package miscellenious.adapter;

public class BusinessCardDesigner {

    public String getCard(Customer customer) {
        return customer.getName() +
                "\n" + customer.getDesignation() +
                "\n" + customer.getAddress();
    }
}
