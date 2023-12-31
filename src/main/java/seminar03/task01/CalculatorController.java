package seminar03.task01;

import java.util.InputMismatchException;
import java.util.function.IntSupplier;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        boolean running = true;

        while (running) {
            view.printMenu();
            int choice = view.getInput();

            switch (choice) {
                case 1:
                    performOperation(model::add);
                    break;
                case 2:
                    performOperation(model::subtract);
                    break;
                case 3:
                    performOperation(model::multiply);
                    break;
                case 4:
                    performOperation(model::divide);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    view.printErrorMessage("Некорректный выбор. Попробуйте снова.");
            }
        }
    }

    private void performOperation(IntSupplier operation) {
        try {
            model.setFirstNumber(getNumberInput("Введите первое число: "));
            model.setSecondNumber(getNumberInput("Введите второе число: "));
            int result = operation.getAsInt();
            view.printResult(result);
        } catch (ArithmeticException | InputMismatchException e) {
            view.printErrorMessage("Ошибка: " + e.getMessage());
        }
    }

    private int getNumberInput(String prompt) {
        view.printMessage(prompt);
        return view.getInput();
    }
}
