package com.company;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Optional;

public class PriceOver30SaleStrategy implements SaleStrategyInterface {
    @Override
    public void sell(Order order) {
        if(order.getTotalPrice().compareTo(new BigDecimal(30)) > 0) {
            Optional<FoodItem> drink = order.getFoodItemList().stream().filter(foodItem -> foodItem.getType() == "drink").min(Comparator.comparing(FoodItem::getPrice));
            drink.ifPresent(foodItem -> foodItem.setPrice(new BigDecimal("0.01")));
        }
    }
}
