import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextBoolean() + " ");
        }
    }
}
