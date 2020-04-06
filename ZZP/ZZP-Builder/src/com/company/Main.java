package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Pizza regularPizza = new Pizza.Builder("small", "tomato sauce").addIngredient("onion").addIngredient("cheese").addIngredient("ham").build();
            System.out.println(regularPizza.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Pizza calzonePizza = new Pizza.Builder("medium", "cream sauce").addIngredient("cheese").addIngredient("pepper").addIngredient("sausage").build();
            System.out.print(calzonePizza.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Pizza pizzaWithoutIngredients = new Pizza.Builder("large", "tomato sauce").build();
            System.out.println(pizzaWithoutIngredients.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
