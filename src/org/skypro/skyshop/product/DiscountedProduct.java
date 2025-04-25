package org.skypro.skyshop.product;

import java.util.Objects;

public class DiscountedProduct extends Product implements Searchable {
    private Double basicPrice;
    private Double percentageDiscount;

    public DiscountedProduct(String name, Double basicPrice, Double percentageDiscount) {
        super(name);
        this.basicPrice = basicPrice;
        this.percentageDiscount = percentageDiscount;
    }

    public Double getPrice() {
        return basicPrice-(basicPrice * percentageDiscount);
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    public Double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(Double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public Double getPercentageDiscount() {
        return (basicPrice * percentageDiscount);
    }

    public void setPercentageDiscount(Double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DiscountedProduct that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getBasicPrice(), that.getBasicPrice()) && Objects.equals(getPercentageDiscount(), that.getPercentageDiscount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBasicPrice(), getPercentageDiscount());
    }

    @Override
    public String toString() {
        return "DiscountedProduct{" +
                "Название =" + getName() +
                ": стоимость со скидкой =" + getPrice() +
                ": скидка =" + getPercentageDiscount() +
                '}';
    }
}
