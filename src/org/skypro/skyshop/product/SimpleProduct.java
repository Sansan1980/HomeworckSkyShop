package org.skypro.skyshop.product;

import java.util.Objects;

public class SimpleProduct extends Product {
    private Double price;

    public SimpleProduct(String name, Double price) {
        super(name);
        this.price = price;
    }

    public Double getPricew() {
        return price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
                ": price=" + price +
                '}';
    }
}
