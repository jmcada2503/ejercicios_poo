package clases;

public class OrderLine {

    public String product;
    public int quantity;
    public double price;

    public String toString() {
        return (this.product + "/" + this.quantity + "/" + this.price);
    }

}
