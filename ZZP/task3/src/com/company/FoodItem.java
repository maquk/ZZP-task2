package com.company;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class FoodItem {
    private BigDecimal price;
    private String name;
    private String type;

    public FoodItem(BigDecimal price, String name, String type) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public FoodItem(FoodItem foodItem) {
        this.name = foodItem.name;
        this.type = foodItem.type;
        this.price = foodItem.price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return String.format("%s - %sUSD", name, df.format(price));
    }
}
