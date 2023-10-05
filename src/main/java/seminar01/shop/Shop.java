package seminar01.shop;

import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    private static class ProductComparator implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return Integer.compare(o1.getCost(), o2.getCost());
        }
    }


    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        List<Product> sortedProducts = products;
        sortedProducts.sort(new ProductComparator());
        return sortedProducts;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        List<Product> sortedProducts = products;
        sortedProducts.sort(new ProductComparator());
        return sortedProducts.get(sortedProducts.size() - 1);
    }

}