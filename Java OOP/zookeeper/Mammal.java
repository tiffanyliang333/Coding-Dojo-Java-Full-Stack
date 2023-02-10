public class Mammal {
    public int energyLevel = 100;

    public void displayEnergy() {
        System.out.println("Energy level: " + energyLevel);
    }

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }
}