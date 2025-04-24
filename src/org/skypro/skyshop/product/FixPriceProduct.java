package org.skypro.skyshop.product;

public class FixPriceProduct {
    private String name;
    private static final Double Fix_Price_Product = 100.0;

    public FixPriceProduct(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return Fix_Price_Product;
    }
}
