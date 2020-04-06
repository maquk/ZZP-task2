package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        OrderBooth orderBooth = new OrderBooth();
        Kitchen kitchen = new Kitchen();

        orderBooth.register(kitchen);
        Order order = new Order();
        FoodItem sevenUp = new FoodItem(new BigDecimal(1.5), "7Up", "drink");
        FoodItem hamburger = new FoodItem(new BigDecimal(1), "hamburger", "burger");
        FoodItem fries = new FoodItem(new BigDecimal(1), "fries", "extras");
        FoodItem cheeseburger = new FoodItem(new BigDecimal(1.5), "cheeseburger", "burger");
        FoodItem chickenBucket = new FoodItem(new BigDecimal(30), "chicken bucket", "chicken");

        order.addFoodItem(sevenUp);
        order.addFoodItem(hamburger);
        order.addFoodItem(fries);
        order.addFoodItem(cheeseburger);
        order.addFoodItem(cheeseburger);
        order.addFoodItem(chickenBucket);

        orderBooth.setSaleStrategy(new TwoSameItemsSaleStrategy());
        orderBooth.informAboutOrder(new OrderHandler(order));

        Order order2 = new Order(order);
        orderBooth.setSaleStrategy(new PriceOver30SaleStrategy());
        orderBooth.informAboutOrder(new OrderHandler(order2));
    }
}
