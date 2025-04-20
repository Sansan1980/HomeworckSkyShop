package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

import java.util.Arrays;

import static org.skypro.skyshop.basket.ProductBasket.getRepositoryProduct;

public class App {

    public static void main(String[] args) {

        ProductBasket.addProduct(new Product("robot", 10_000));
        ProductBasket.addProduct(new Product("Boock", 22));
        ProductBasket.addProduct(new Product("Компьютер", 1_000));
        ProductBasket.addProduct(new Product("Машина", 1_000_000));
        ProductBasket.addProduct(new Product("Еда", 1_000_000));
        ProductBasket.addProduct(new Product("Еда", 1_000_000));
        ProductBasket.summationTheTotalPraiceTheBasket();
        ProductBasket.printPraiceBasket();
        System.out.println(Arrays.toString(getRepositoryProduct()));
        ProductBasket.checkingProductInBasketNamed("Boock");
        ProductBasket.cleaningTheBasket();
        System.out.println(Arrays.toString(getRepositoryProduct()));

    }
}


