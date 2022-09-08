import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        long seed = 0;
        Random random = new Random(seed);

        int bound = 100;
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(bound) + " ");
        }
    }
}
