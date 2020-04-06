package com.company;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class TwoSameItemsSaleStrategy implements SaleStrategyInterface {
    @Override
    public void sell(Order order) {
        List<FoodItem> foodItemList = order.getFoodItemList();
        foodItemList.stream()
                .map(FoodItem::getType)
                .distinct()
                .forEach(firstItem -> {
                    Optional<BigDecimal> optionalPrice = foodItemList.stream()
                            .filter(foodItem -> foodItem.getType() == firstItem)
                            .map(FoodItem::getPrice)
                            .min(BigDecimal::compareTo);
                    BigDecimal lowestPrice = null;
                    if (optionalPrice.isPresent()) {
                        lowestPrice = optionalPrice.get();
                    }
                    if (foodItemList
                            .stream()
                            .filter(foodItem -> foodItem.getType() == firstItem)
                            .count() >= 2) {
                        BigDecimal priceToDiscount = lowestPrice;
                        foodItemList.stream()
                                .filter(foodItem -> foodItem.getType() == firstItem)
                                .filter(foodItem -> foodItem.getPrice().equals(priceToDiscount))
                                .forEach(foodItem -> foodItem.setPrice(foodItem.getPrice().multiply(new BigDecimal("0.9"))));
                    }
                });
    }
}
