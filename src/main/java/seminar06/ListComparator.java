package seminar06;

import java.util.List;

public class ListComparator {
    private ListCalculation listCalculation;

    public ListComparator() {
        listCalculation = new ListCalculation();
    }

    public ListComparator(ListCalculation listCalculation) {
        this.listCalculation = listCalculation;
    }

    public String meanCompare(List<Integer> listFirst, List<Integer> listSecond) {
        double meanListFirst = listCalculation.meanFinder(listFirst);
        double meanListSecond = listCalculation.meanFinder(listSecond);
        if (meanListFirst > meanListSecond) {
            return "Первый список имеет большее среднее значение";
        } else if (meanListFirst < meanListSecond) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
