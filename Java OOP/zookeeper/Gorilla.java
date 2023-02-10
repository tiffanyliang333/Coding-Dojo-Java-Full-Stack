public class Gorilla extends Mammal {

    public void throwSomething() {
        System.out.println("Gorilla threw something!");
        energyLevel -= 5;
        displayEnergy();
    }

    public void eatBananas() {
        System.out.println("Eating bananas made the gorilla happy!");
        energyLevel += 10;
        displayEnergy();
    }

    public void climb() {
        System.out.println("Gorilla climbed a tree!");
        energyLevel -= 10;
        displayEnergy();
    }
}