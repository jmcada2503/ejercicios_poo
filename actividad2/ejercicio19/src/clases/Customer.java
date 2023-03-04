package clases;

import java.util.ArrayList;

public class Customer {

    public String name;
    public String address;
    public String credit_rating;
    public ArrayList<Order> orders = new ArrayList<Order>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

}
