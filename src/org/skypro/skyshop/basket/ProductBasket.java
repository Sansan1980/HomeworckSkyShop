package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    private static int count = 0;
    // private ArrayList <Product> RepositoryProduct = new ArrayList<>(5);
    private static Product[] repositoryProduct = new Product[5];

    public void setRepositoryProduct(Product[] repositoryProduct) {
        this.repositoryProduct = repositoryProduct;
    }

    public static Product[] getRepositoryProduct() {
        return repositoryProduct;
    }


//    Метод добавления продукта в корзину: метод принимает в себя продукт и ничего не возвращает.

    public static void addProduct(Product product) {
        if (count >= 5) {
            System.out.println(" Невозможно добавить продукт");
        } else {
            repositoryProduct[count] = product;
            count++;
            System.out.println("Добавлен новый продукт - " + product);
        }
    }

    /**
     * Метод получения общей стоимости корзины: метод ничего не принимает .
     *
     * @return и возвращает целое число - сумму товаров всей корзины.
     */
    public static Integer summationTheTotalPraiceTheBasket() {
        Integer priceResult = 0;
        for (int i = 0; i < repositoryProduct.length; i++) {
            if (repositoryProduct[i] != null) {
                Product productResult = repositoryProduct[i];
                priceResult += productResult.getPrice();
            }
        }
        System.out.println("Итого: Общая стоимости корзины: " + priceResult);
        return priceResult;
    }

    /**
     * Метод, который печатает содержимое корзины: метод ничего не принимает и не возвращает, но печатает в консоль сообщение вида:
     * <имя продукта>: <стоимость>
     * <имя продукта>: <стоимость>
     * <имя продукта>: <стоимость>
     * Итого: <общая стоимость корзины>
     * Если в корзине ничего нет, нужно напечатать фразу «в корзине пусто».
     */

    public static void printPraiceBasket() {
        int indexСounter = 0;
        if (indexСounter <= repositoryProduct.length) {
            if (repositoryProduct[indexСounter] != null) {
                for (int i = 0; i < repositoryProduct.length; i++) {
                    indexСounter++;
                    if (repositoryProduct[i] != null) {
                        Product productnew = repositoryProduct[i];
                        System.out.print("Имя продукта =" + productnew.getName());
                        System.out.println(": Стоимость - " + productnew.getPrice());
                    }
                }
                summationTheTotalPraiceTheBasket();

            } else {
                System.out.println("в корзине пусто");
            }
        }
    }

    /**
     * Проверяет наличие товара с указанным именем в корзине
     *
     * @param name Имя товара для поиска
     * @return true если товар найден, false если не найден или корзина пуста
     */
    public static boolean checkingProductInBasketNamed(String name) {
        if (repositoryProduct == null) {
            System.out.println("Корзина пуста");
            return false;
        }
        for (Product product : repositoryProduct) {
            if (product == null) continue;
            String productName = product.getName();
            if (productName != null && productName.equals(name)) {
                System.out.println("Товар с именем - " + name + ", найден");
                return true;
            }
        }
        System.out.println("Товар с именем '" + name + "' не найден");
        return false;

    }


    /**
     * Очищает корзину продуктов, устанавливая всем элементам массива {@code null}.
     * Если корзина не была инициализирована (массив равен {@code null}), метод ничего не делает.
     */
    public static void cleaningTheBasket() {
        for (int i = 0; i < repositoryProduct.length; i++) {
            if (repositoryProduct == null) {
                return;
            }
            repositoryProduct[i] = null;
           // Arrays.fill(repositoryProduct, null);
        }
    }

}



