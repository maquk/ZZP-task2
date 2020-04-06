package com.company;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Order {
    private static final Logger LOGGER = Logger.getLogger(Order.class.getName());
    private List<FoodItem> foodItemList;

    public Order() {
        super();
        foodItemList = new LinkedList<>();
    }

    public Order(Order order) {
        foodItemList = new LinkedList<>();
        for (FoodItem foodItem : order.getFoodItemList()) {
            foodItemList.add(new FoodItem(foodItem));
        }
    }

    public List<FoodItem> getFoodItemList() {
        return foodItemList;
    }

    public void addFoodItem(FoodItem foodItem) {
        this.foodItemList.add(new FoodItem(foodItem));
    }

    public void setFoodItemList(List<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }

    public void orderItems() {
        LOGGER.info("CURRENT ORDER:\n");
        for (FoodItem foodItem : foodItemList) {
            LOGGER.info(foodItem.toString());
        }
    }

    public BigDecimal getTotalPrice() {
        return getFoodItemList().stream().map(FoodItem::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public String toString() {
        return "CURRENT ORDER:\n" + foodItemList.stream().map(FoodItem::toString).collect(Collectors.joining("\n"));
    }
}
