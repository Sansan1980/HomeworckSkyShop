package org.skypro.skyshop.product;

import java.util.Objects;

public abstract class Product implements Searchable {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public abstract Double getPrice();

    public boolean isSpecial() {
        return true;
    }
//
//    public String searchTerm() {
//        return null;
//    }
//
//    public String extractionTheType() {
//        return null;
//    }
//
//    public String getStringRepresentation() {
//        return null;
//    }
//
//    public String extractionName() {
//        return null;
//    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
