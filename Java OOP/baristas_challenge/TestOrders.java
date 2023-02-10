import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 2.0);
        Item item2 = new Item("latte", 5.0);
        Item item3 = new Item("drip coffee", 2.5);
        Item item4 = new Item("capuccino", 1.0);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("A");
        Order order4 = new Order("B");
        Order order5 = new Order("C");

        // Application Simulations

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item2);

        order4.addItem(item3);
        order4.addItem(item4);

        order5.addItem(item1);
        order5.addItem(item2);

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());
    }
}
