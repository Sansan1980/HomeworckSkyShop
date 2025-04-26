package org.skypro.skyshop.service.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;


public class ProductBasket {
    private int count = 0;
    private Product[] repositoryProduct = new Product[5];

    public void setRepositoryProduct(Product[] repositoryProduct) {
        this.repositoryProduct = repositoryProduct;
    }

    public Product[] getRepositoryProduct() {
        return repositoryProduct;
    }


//    Метод добавления продукта в корзину: метод принимает в себя продукт и ничего не возвращает.

    /**
     * Метод добавления продукта в корзину:
     * метод принимает  в себя продукт (параметр),проверяет по счетчику наличие свободных индексов
     * массива и по этому индексу ложит элемент и ничего не возвращает.
     *
     * @param product параметр приходящий в метод.
     */
    public void addProduct(Product product) {
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
    public Double summationTheTotalPraiceTheBasket() {
        int countSpec = 0;
        Double priceResult = 0.0;
        for (int i = 0; i < repositoryProduct.length; i++) {
            if (repositoryProduct[i] != null) {
                Product productResult = repositoryProduct[i];
                priceResult += productResult.getPrice();

                if (!productResult.isSpecial()) {
                    countSpec++;
                }
            }
        }
        System.out.println("Итого: Общая стоимости корзины: " + priceResult);
        System.out.println("Специальных товаров: <Количество специальных товаров>" + countSpec );
        return priceResult;
    }

    /**
     * Выводит список товаров, находящихся в корзине, на консоль.
     * <p>
     * Перебирает массив {@code repositoryProduct} и выводит название и цену каждого непустого продукта.
     * Если корзина пуста (все элементы равны {@code null}), выводит сообщение "Корзина пуста".
     * После отображения товаров, если есть товары, вызывает метод {@link #summationTheTotalPraiceTheBasket()} для подсчета общей стоимости.
     * </p>
     *
     * @author [Ваше имя или автор]
     */
    public void printPraiceBascet() {
        boolean isBasketEmpty = true;
        boolean hasProducts = false;
        for (int i = 0; i < repositoryProduct.length; i++) {
            if (repositoryProduct[i] != null) {
                hasProducts = true;
                Product product = repositoryProduct[i];
                // System.out.println("Имя продукта = " + product.getName() + ": Стоимость - " + product.getPrice());
                Arrays.toString(repositoryProduct);
            }
            isBasketEmpty = false;
        }
        if (hasProducts) {
            summationTheTotalPraiceTheBasket();
        } else {
            System.out.println("Корзина пуста");
        }
    }


    public boolean checkingProductInBasketNamed(String name) {
        if (repositoryProduct == null) {
            System.out.println("Корзина пуста");
            return false;
        }
        for (Product product : repositoryProduct) {
            if (product == null) continue;// continue служит для пропуска текущей итерации и перехода к следующей.
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
    public void cleaningTheBasket() {
        // Arrays.fill(repositoryProduct, null);
        for (int i = 0; i < repositoryProduct.length; i++) {
            if (repositoryProduct == null) break;
            repositoryProduct[i] = null;
        }
    }


}

