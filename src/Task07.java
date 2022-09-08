//  :) - happy
// :( - bad
// :| - neutral
// :() - shouted
// :/ - nervous


import java.util.Random;

public class Task07 {
    public static final int MOOD_NUMBERS = 5;

    public static final String HAPPY_MOOD = ":)";
    public static final String BAD_MOOD = ":(";
    public static final String NEUTRAL_MOOD = ":|";
    public static final String NERVOUS_MOOD = ":/";
    public static final String SHOUTED_MOOD = ":()";


    public static void main(String[] args) {
        Random random = new Random();

        int mood = random.nextInt(MOOD_NUMBERS);

        String msg = HAPPY_MOOD;

        switch (mood) {
            case 1: msg = BAD_MOOD; break;
            case 2: msg = NEUTRAL_MOOD; break;
            case 3: msg = SHOUTED_MOOD; break;
            case 4: msg = NERVOUS_MOOD; break;
        }

        System.out.println(msg);

        }

    }

