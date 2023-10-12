package seminar02.simpleShoppingCart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    private Shop shop;
    private Cart cart;
    private Product product1;
    private Product product2;
    private Product product3;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
        cart = new Cart();

        // Создаем несколько продуктов
        product1 = new Product(1, "Товар 1", 500.0, 1);
        product2 = new Product(2, "Товар 2", 300.0, 1);
        product3 = new Product(3, "Товар 3", 200.0, 1);
    }

    /**
     * Задание №1.
     * Разработайте модульный тест для проверки, что общая стоимость корзины с разными товарами корректно рассчитывается
     * Ожидаемый результат: Стоимость корзины посчиталась корректно
     */
    @Test
    public void testCalculateTotalWithMultipleProducts() {
        // Добавляем продукты в корзину
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Проверяем, что общая стоимость корзины рассчитывается корректно
        double expectedTotalPrice = 1000.0; // 500 + 300 + 200
        double actualTotalPrice = cart.calculateTotal();
        assertEquals(expectedTotalPrice, actualTotalPrice, 0.01); // Погрешность 0.01 для сравнения с плавающей точкой
    }

    @Test
    public void testCalculateTotalWithEmptyCart() {
        // Проверяем, что общая стоимость пустой корзины равна 0.0
        double expectedTotalPrice = 0.0;
        double actualTotalPrice = cart.calculateTotal();
        assertEquals(expectedTotalPrice, actualTotalPrice, 0.01);
    }

    @Test
    public void testCalculateTotalWithSingleProduct() {
        // Добавляем продукт в корзину
        cart.addProduct(product1);

        // Проверяем, что общая стоимость корзины с одним товаром равна цене этого товара
        double expectedTotalPrice = 500.0;
        double actualTotalPrice = cart.calculateTotal();
        assertEquals(expectedTotalPrice, actualTotalPrice, 0.01);
    }

    /**
     * Задание №2.
     * Создайте модульный тест для проверки, что общая стоимость корзины с множественными экземплярами
     * одного и того же продукта корректно рассчитывается.
     * Ожидаемый результат: Стоимость корзины посчиталась корректно
     */
    @Test
    public void testCalculateTotalWithMultipleSameProduct() {
        // Добавляем продукты в корзину
        cart.addProduct(product1);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Проверяем, что общая стоимость корзины рассчитывается корректно
        double expectedTotalPrice = 1000.0; // 500 + 300 + 200
        double actualTotalPrice = cart.calculateTotal();
        assertEquals(expectedTotalPrice, actualTotalPrice, 0.01); // Погрешность 0.01 для сравнения с плавающей точкой
    }

    /**
     * Задание №3.
     * Напишите модульный тест для проверки, что при удалении товара из корзины
     * происходит перерасчет общей стоимости корзины.
     * Ожидаемый результат: Вызывается метод пересчета стоимости корзины, стоимость корзины меняется.
     */
    @Test
    public void testRecalculateTotalAfterRemovingProduct() {
        // Добавляем продукты в корзину
        cart.addProduct(product1);
        cart.addProduct(product2);

        // Первоначальная стоимость корзины
        double initialTotalPrice = cart.calculateTotal();

        // Удаляем продукт из корзины
        cart.removeProduct(product1);

        // Получаем обновленную стоимость корзины после удаления товара
        double updatedTotalPrice = cart.calculateTotal();

        // Проверяем, что стоимость корзины изменилась после удаления товара
        assertNotEquals(initialTotalPrice, updatedTotalPrice, 0.01); // Погрешность 0.01 для сравнения с плавающей точкой
    }

    /**
     * Разработайте модульный тест для проверки, что при добавлении определенного количества товара в корзину,
     * общее количество этого товара в магазине соответствующим образом уменьшается.
     * Ожидаемый результат: Количество товара в магазине уменьшается на число продуктов в корзине пользователя.
     */
    @Test
    public void testShopAfterAddProductToCart() {
        // Добавляем продукты в магазин
        shop.addProduct(product1);
        shop.addProduct(product2);

        int initialProductsCount = shop.getProducts().size();

        // Добавляем продукты в корзину
        cart.addProduct(product1);

        int finalProductsCount = shop.getProducts().size();

        assertNotEquals(initialProductsCount, finalProductsCount);
    }
}
