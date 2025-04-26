package org.skypro.skyshop;

import org.skypro.skyshop.service.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

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

        productBasket.addProduct(new SimpleProduct("robot", 10_000.0));
        productBasket.addProduct(new DiscountedProduct("Boock", 100.0,0.1));
        productBasket.addProduct(new FixPriceProduct("Комп"));
        productBasket.addProduct(new DiscountedProduct("Машина", 1_000_000.0,0.5));
        productBasket.addProduct(new SimpleProduct("Еда", 1_000_000.0));
        productBasket.addProduct(new SimpleProduct("Еда", 1_000_000.0));
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


