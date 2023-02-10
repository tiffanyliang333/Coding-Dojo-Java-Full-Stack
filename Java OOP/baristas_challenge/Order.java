import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item>items = new ArrayList<Item>();

    // public Boolean getStatusMessage() {
    //     if (ready) = true;
    //         System.out.println("Your order is ready");
    //     else;
    //         System.out.println("Thank you for waiting. Your order will be ready soon.")
    // }

    public Order () {
        this.name = "guest";
        this.ready = false;
    }

    public Order (String name) {
        this.name = name;
        this.ready = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public boolean getReady(){
        return this.ready;
    }

    public void setReady(){
        this.ready = ready;
    }

    public ArrayList<Item>getItems(){
        return items;
    }

    public void setItems(ArrayList<Item>items){
        this.items = items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if (this.ready == true) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. YOur order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0.0;
        for (Item i: this.items){
            total += i.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.printf("Customer Name: %s", this.name);
        for(Item i: this.items){
            System.out.println(i.getName() + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

}