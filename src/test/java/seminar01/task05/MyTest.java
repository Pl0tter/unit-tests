package seminar01.task05;

public class MyTest {
    public static void main(String[] args) {
        assertConditionA();
        assertConditionB();
        sum(123456789, 444444444);
    }

    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 2;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

    public static void assertConditionB() {
        int x = 1;
        assert x >= 0;
    }

    public static int sum(int a, int b) {
//        long result = (long) a + b;
//        System.out.println(result);
        assert a+ b < Integer.MAX_VALUE : "Выход за границы integer";
        return a + b;
    }
}
