package seminar01.shop;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    /*
1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
*/
    public static void main(String[] args) {
        testingShop();
        testGetMostExpensiveProduct();
        testSortProductsByPrice();
    }

    public static void testingShop() {
        Product product01 = new Product();
        product01.setCost(500);
        product01.setTitle("Vine");

        Product product02 = new Product();
        product02.setCost(100);
        product02.setTitle("Bread");

        Product product03 = new Product();
        product03.setCost(300);
        product03.setTitle("Cheese");

        Shop shop = new Shop();
        shop.setProducts(Arrays.asList(product01, product02, product03));
        assertThat(shop.getProducts())
                .isNotEmpty()
                .hasSize(3)
                .doesNotHaveDuplicates()
                .contains(product01, product02, product03);
    }

    private static void testGetMostExpensiveProduct() {
        Product product01 = new Product();
        product01.setCost(500);
        product01.setTitle("Vine");

        Product product02 = new Product();
        product02.setCost(100);
        product02.setTitle("Bread");

        Product product03 = new Product();
        product03.setCost(300);
        product03.setTitle("Cheese");

        Shop shop = new Shop();
        shop.setProducts(Arrays.asList(product01, product02, product03));

        assert product01 == shop.getMostExpensiveProduct() : "Найден не самый дорогой продукт";
    }

    private static void testSortProductsByPrice() {
        Product product01 = new Product();
        product01.setCost(500);
        product01.setTitle("Vine");

        Product product02 = new Product();
        product02.setCost(100);
        product02.setTitle("Bread");

        Product product03 = new Product();
        product03.setCost(300);
        product03.setTitle("Cheese");

        Shop shop = new Shop();
        shop.setProducts(Arrays.asList(product01, product02, product03));

        assertThat(shop.sortProductsByPrice())
                .isNotEmpty()
                .hasSize(3)
                .doesNotHaveDuplicates()
                .containsSequence(product02, product03, product01);
    }
}