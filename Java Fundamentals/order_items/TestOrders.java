import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item itemOne = new Item();
        itemOne.name = "Mocha";
        itemOne.price = 2.0;

        Item itemTwo = new Item();
        itemTwo.name = "Latte";
        itemTwo.price = 5.0;

        Item itemThree = new Item();
        itemThree.name = "Drip Coffee";
        itemThree.price = 2.5;

        Item itemFour = new Item();
        itemFour.name = "Capuccino";
        itemFour.price = 1.0;

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        // order1.total = 
        // order1.ready = 
        // order1.items =

        Order order2 = new Order();
        order2.name = "Jimmy";
        // order2.total = 
        // order2.ready = 
        // order2.items =
    
        Order order3 = new Order();
        order3.name = "Noah";
        // order3.total = 
        // order3.ready = 
        // order3.items =
    
        Order order4 = new Order();
        order4.name = "Sam";
        // order4.total = 
        // order4.ready = 
        // order4.items =
    
    
        // Application Simulations

        order2.items.add(itemOne);
        order2.total += itemOne.price;

        order3.items.add(itemFour);
        order3.total += itemFour.price;

        order4.items.add(itemTwo);
        order4.total += itemTwo.price;

        order1.ready = true;

        order4.items.add(itemTwo);
        order4.items.add(itemTwo);
        order4.total += itemTwo.price * 2;

        order2.ready = true;


        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);

    }
}
