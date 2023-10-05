package seminar01.task01;

public class MyTest {
    public static void main(String[] args) {
//        int x = 10;
        int x = -1;
        // Проверяем, что x неотрицательно с использованием оператора assert
        assert x >= 0 : "x должно быть неотрицательным";
        System.out.println("Программа продолжает выполнение");
    }
}
