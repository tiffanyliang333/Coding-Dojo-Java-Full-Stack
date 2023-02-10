public class Item {
    private String name;
    private double price;

    public Item(){}

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(String name) {
        this.price = price;
    }
}