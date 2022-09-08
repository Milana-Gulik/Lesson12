import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        Random random = new Random();

        // random floating point numbers in [0, 1)
//        for (int i = 0; i < 10; i++) {
//            System.out.print(random.nextDouble() + " ");
//        }

        // random floating point numbers in [0, 100)
        int bound = 100;
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextDouble() * 100);
        }
    }
}
