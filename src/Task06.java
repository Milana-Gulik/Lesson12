import java.util.Random;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count;

        do {
            System.out.println("Input count of throwing: ");
            count = scanner.nextInt();
        } while (count <= 0);

        int tails = 0;
        int eagle = 0;

        for (int i = 0; i < count; i++) {
            if (random.nextBoolean()) {
                tails++;
            }
        }

        String msg = String.format("Tails = %d, eagle = %d,",
                tails, count - tails);
        System.out.println(msg);
    }
}
