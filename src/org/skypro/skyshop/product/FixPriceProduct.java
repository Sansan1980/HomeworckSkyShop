package org.skypro.skyshop.product;

import java.util.Objects;

public class FixPriceProduct extends Product implements Searchable{
    private static final Double Fix_Price_Product = 100.0;
    public FixPriceProduct(String name) {
       super(name);
    }
@Override
    public Double getPrice() {
        return Fix_Price_Product;
    }

    public boolean isSpecial() {
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FixPriceProduct that)) return false;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "FixPriceProduct{" +
                "Название продукта c фиксированной ценой = '" + getName() +
                ": Фиксированная цена = " + Fix_Price_Product +
                '}';

    }
}
