package seminar03.task01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.mockito.Mockito.*;

class CalculatorControllerTestMockito {
    private CalculatorController controller;
    @Mock
    private CalculatorModel model;
    @Mock
    private CalculatorView view;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        controller = new CalculatorController(model, view);
    }

    @Test
    public void testPerformOperationWithArithmeticException() {
        when(view.getInput()).thenReturn(4,5, 0); // Ввод пользователя: первое число = 5, второе число = 0
        when(model.divide()).thenThrow(new ArithmeticException("Деление на ноль"));

        controller.run();

        // Проверяем, что было вызвано сообщение об ошибке с правильным сообщением
        verify(view).printErrorMessage("Ошибка: Деление на ноль");
    }
}