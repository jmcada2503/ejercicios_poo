package clases;

import java.util.ArrayList;

public class Order {

    public String date_received;
    public boolean is_prepaid;
    public int number;
    public double price;
    public ArrayList<OrderLine> order_lines = new ArrayList<OrderLine>();

    public void dispatch() {
        System.out.println("Dispatching");
    }

    public void close() {
        System.out.println("Closing");
    }

    public void addLine(String product, int quantity, double price) {
        OrderLine order_line = new OrderLine();
        order_line.product = product;
        order_line.quantity = quantity;
        order_line.price = price;

        this.order_lines.add(order_line);
    }

    public String toString() {
        return (this.date_received + "/" + this.is_prepaid + "/" + this.number + "/" + this.price + "/OrderLines:(" + this.order_lines + ")");
    }

}
