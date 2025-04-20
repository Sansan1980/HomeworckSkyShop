package org.skypro.skyshop.product;

import java.util.Objects;

public class Product {
    private   String name;
    private   Integer price;
public  Product() {

}
    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public  String getName() {
        return name;
    }

    public  Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

}
