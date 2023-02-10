public class Driver extends Car {

    public void driving() {
        System.out.println("You are driving!");
        gas--;
        tank();
    }

    public void boosters() {
        System.out.println("You are using boosters!");
        gas-=3;
        tank();
    }

    public void refuel() {
        System.out.println("You are refueling!");
        gas+=2;
        tank();
    }
}