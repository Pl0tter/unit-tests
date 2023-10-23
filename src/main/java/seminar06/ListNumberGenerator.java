package seminar06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListNumberGenerator {
    private List<Integer> numbers;
    private Random rnd = new Random();

    public List<Integer> randomNumberGenerator(int count, int min, int max) {
        numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(rnd.nextInt(min, max + 1));
        }
        return numbers;
    }
}
