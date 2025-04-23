package org.skypro.skyshop.product;

import java.util.Objects;

public class AbstractProduct extends Product{
    private Double price;

    public AbstractProduct(String name, Double price) {
        super(name);
        this.price = price;
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
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AbstractProduct that = (AbstractProduct) o;
        return Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price);
    }

    @Override
    public String toString() {
        return "AbstractProduct{" +
                "name=" + getName() +
                ": price=" + price +
                '}';
    }

}
