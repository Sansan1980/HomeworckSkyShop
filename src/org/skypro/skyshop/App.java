package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.AbstractProduct;
import org.skypro.skyshop.product.Product;

import java.util.Arrays;


public class App {
private static ProductBasket productBasket = new ProductBasket();
    public static void main(String[] args) {

        productBasket.addProduct(new AbstractProduct("robot", 10_000.0));
        productBasket.addProduct(new AbstractProduct("Boock", 22.0));
        productBasket.addProduct(new AbstractProduct("Компьютер", 1_000.0));
        productBasket.addProduct(new AbstractProduct("Машина", 1_000_000.0));
        productBasket.addProduct(new AbstractProduct("Еда", 1_000_000.0));
        productBasket.addProduct(new AbstractProduct("Еда", 1_000_000.0));
        productBasket.summationTheTotalPraiceTheBasket();
        productBasket.printPraiceBasket();

        Product [] arryProduct = productBasket.getRepositoryProduct();
        arryProduct[1] = null;

        System.out.println(Arrays.toString(productBasket.getRepositoryProduct()));
        productBasket.checkingProductInBasketNamed("Машина");
        productBasket.cleaningTheBasket();
        System.out.println(Arrays.toString(productBasket.getRepositoryProduct()));

    }
}


