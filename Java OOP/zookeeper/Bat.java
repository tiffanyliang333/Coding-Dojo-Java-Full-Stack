public class Bat extends Mammal{
    public Bat() {
        super(300);
    }

    public void fly() {
        System.out.println("Swooooooosh!");
        energyLevel -= 50;
        displayEnergy();
    }

    public void eatHumans() {
        System.out.println("Bat ate human.");
        energyLevel += 25;
        displayEnergy();
    }

    public void attackTown() {
        System.out.println("Buuurrrrrrrn....");
        energyLevel -= 100;
        displayEnergy();
    }
}