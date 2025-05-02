package org.skypro.skyshop.product;

import java.util.Objects;

public class SimpleProduct extends Product implements Searchable {
    private Double price;

    public SimpleProduct(String name, Double price) {
        super(name);
        this.price = price;
    }


    @Override
    public Double getPrice() {
        return price;
    }


    @Override
    public  boolean isSpecial() {
        return true;
    }
    public String searchTerm() {
        return getName();
    }

    public String extractionTheType() {
        return "PRODUCT" ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleProduct that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getPrice(), that.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPrice());
    }

    @Override
    public String toString() {
        return "SimpleProduct{" +
                "name="+ getName() +
                ": price=" + getPrice() +
                '}';
    }
}
