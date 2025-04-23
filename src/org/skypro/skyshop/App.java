package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

import java.util.Arrays;


public class App {
    private static ProductBasket productBasket = new ProductBasket();

    public static ProductBasket getProductBasket() {
        return productBasket;
    }

    public static void setProductBasket(ProductBasket productBasket) {
        App.productBasket = productBasket;
    }

    public static void main(String[] args) {

        productBasket.addProduct(new Product("robot", 10_000));
        productBasket.addProduct(new Product("Boock", 22));
        productBasket.addProduct(new Product("Компьютер", 1_000));
        productBasket.addProduct(new Product("Машина", 1_000_000));
        productBasket.addProduct(new Product("Еда", 1_000_000));
        productBasket.addProduct(new Product("Еда", 1_000_000));
        productBasket.summationTheTotalPraiceTheBasket();
        productBasket.printPraiceBascet();
        productBasket.checkingProductInBasketNamed("serg");

        ProductBasket productBasket1 = getProductBasket();
        Product[] rProduct = productBasket1.getRepositoryProduct();
        rProduct[1] = null;

        System.out.println(Arrays.toString(productBasket1.getRepositoryProduct()));
        productBasket.printPraiceBascet();
        productBasket.cleaningTheBasket();
        System.out.println(Arrays.toString(productBasket1.getRepositoryProduct()));
        productBasket.summationTheTotalPraiceTheBasket();
        productBasket.checkingProductInBasketNamed("Boock");


    }
}


