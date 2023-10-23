package seminar06;

import java.util.Collections;
import java.util.List;

public class ListCalculation {
    public int sumFinder(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public double meanFinder(List<Integer> numbers) {
        return sumFinder(numbers) / numbers.size();
    }
}
