import java.util.Random;
import java.util.ArrayList;


Random randMachine = new Random();

public class PuzzleJava {
    public ArrayList<Integer>getTenRolls() {
        ArrayList<Integer>randomTen = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 1; i <= 10; i++) {
            randomTen.add(rand.nextIn(20) + 1);
        }
        return random10;
    }

}