import java.util.ArrayList;

public class CafeUtil {

    // # 1
    public int getStreakGoal() {
        int sum = 0;
        int numWeeks = 12;
        for(int w = 1; w <= numWeeks; w++) {
            sum += w;
        }
        return sum;
    }

    // #2
    public double getOrderTotal(double[] lineItems) {
        double sum = 0.0;
        for(double price: lineItems) {
            sum += price;
        }
        return sum;
    }

    // #3
    public void displayMenu(ArrayList<String>menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s \n", i, menuItems.get(i));
        }
    }

    // #4
    public void addCustomer(ArrayList<String>customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s. ", userName);
        System.out.printf("There are %s people in front of you.", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }
}
