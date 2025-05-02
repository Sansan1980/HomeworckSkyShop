package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.service.basket.ProductBasket;
import org.skypro.skyshop.service.basket.SearchEngine;

import java.util.Arrays;



public class App {
    private static ProductBasket productBasket = new ProductBasket();

    public static void main(String[] args) {
        DiscountedProduct discountedProduct1 = new DiscountedProduct("Boock", 12.0, 0.1);
        productBasket.addProduct(discountedProduct1);
        productBasket.addProduct(new DiscountedProduct("продукт", 100.0, 0.1));
        productBasket.addProduct(new FixPriceProduct("Молоток"));
        productBasket.addProduct(new DiscountedProduct("Boock", 1_000_000.0, 0.5));
        productBasket.addProduct(new SimpleProduct("комп", 1_000_000.0));
        productBasket.addProduct(new SimpleProduct("дом", 1_000_000.0));
        productBasket.addProduct(new SimpleProduct("вертолет", 1_000_000.0));

        productBasket.summationTheTotalPraiceTheBasket();
        productBasket.printPraiceBascet();
        System.out.println("-------------");
        productBasket.checkingProductInBasketNamed("Boock");
        System.out.println("//////////////////");

        // ложим null в массив по индексу 5;
        Product[] rProduct = productBasket.getRepositoryProduct();
       // rProduct[4] = null;

        System.out.println(Arrays.toString(productBasket.getRepositoryProduct()));
        productBasket.printPraiceBascet();
        System.out.println(")))))))))))))))))))");
       // productBasket.cleaningTheBasket();
       System.out.println(Arrays.toString(productBasket.getRepositoryProduct()));
        productBasket.summationTheTotalPraiceTheBasket();
        productBasket.checkingProductInBasketNamed("Boock");
        System.out.println("}}}}}}}}}}}}}}}}}}}}");

        Article article1 = new Article("Boock", "книга про джава");
        System.out.println(article1);
        Article article2 = new Article("Boock", "Книга про питон");
        System.out.println(article2);

        Searchable productBascet1 = productBasket.getRepositoryProduct()[0];
        System.out.println(productBascet1);
        Searchable productBascet2 = productBasket.getRepositoryProduct()[1];
        System.out.println(productBascet2);
        Searchable productBascet3 = productBasket.getRepositoryProduct()[2];
        System.out.println(productBascet3);
        Searchable productBascet4 = productBasket.getRepositoryProduct()[3];
        System.out.println(productBascet4);
        Searchable productBascet5 = productBasket.getRepositoryProduct()[4];
        System.out.println(productBascet5);


        Searchable[] item = {article1, article2, discountedProduct1, productBascet5, productBascet2, productBascet3, productBascet4};
        SearchEngine searchEngine = new SearchEngine(item);
        System.out.println(":::::::::::::::::::::::::::");
        System.out.println(Arrays.toString(SearchEngine.getArrayOfAllElements()));
        searchEngine.addNewItem(new SimpleProduct("Продукт",10.0) );
        System.out.println("111111111111111111111");
        System.out.println(Arrays.toString(SearchEngine.getArrayOfAllElements()));

        Searchable[] result1 = searchEngine.search("про");
        System.out.println("Результат:");
       // System.out.println(Arrays.toString(result1));
        for (Searchable s : result1) {
            if (s != null) {
                System.out.println(s.getStringRepresentation());
            }
        }

    }
}


