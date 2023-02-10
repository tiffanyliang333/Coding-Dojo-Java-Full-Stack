public class Test {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java,";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 4.0;
        double lattePrice = 3.7;
        double cappucinoPrice = 3.2;

        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        //Order completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        System.out.println(generalGreeting + customer1);

        // #1
        if(isReadyOrder1) {
            System.out.println(customer1 + pendingMessage);
        }
        else {
            System.out.println(customer1 + readyMessage);
        }

        // #2
        if(isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

        // #3
        System.out.println(displayTotalMessage + lattePrice*2);
        if(isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        // #4
        System.out.println(displayTotalMessage + (dripCoffeePrice - lattePrice));
    }
}