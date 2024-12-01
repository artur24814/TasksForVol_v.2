package task3;
import java.util.Random;

public class RandomIntGenerator {
    public static int getNext(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
