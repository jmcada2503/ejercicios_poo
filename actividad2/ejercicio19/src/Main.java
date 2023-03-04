import clases.*;

public class Main {

    public static void main(String[] args) {

        CorporateCustomer unal = new CorporateCustomer();
        PersonalCustomer manuela = new PersonalCustomer();

        unal.name = "Universidad Nacional de Colombia";
        unal.address = "Facultad de Minas medellín";
        unal.credit_rating = "A";
        unal.contact_name = "Luis Soto";
        unal.credit_limit = 1253;

        Order myOrder = new Order();
        myOrder.date_received = "04-03-2023";
        myOrder.is_prepaid = true;
        myOrder.price = 150;
        myOrder.addLine("EarBuds", 2, 150);
        System.out.println("Order lines: "+myOrder.order_lines);
        unal.addOrder(myOrder);

        manuela.name = "Maria Manuela";
        manuela.address = "carrera 25 medellín";
        manuela.credit_rating = "B";

        System.out.println(unal.name + " queda en " + unal.address + " y tiene un credit rating de " + unal.credit_rating);
        System.out.println(unal.name + " tiene las siguientes ordenes: " + unal.orders);

        System.out.println(manuela.name + " queda en " + manuela.address + " y tiene un credit rating de " + manuela.credit_rating);

    }

}
