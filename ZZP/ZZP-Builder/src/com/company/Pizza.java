package com.company;

import java.util.LinkedList;
import java.util.List;

public class Pizza {
    private final String size;
    private final List<String> ingredientList;
    private final String base;
    private final String saucePlacement;
    private final String style;

    public Pizza(Builder builder) {
        this.size = builder.size;
        this.ingredientList = builder.ingredientList;
        this.base = builder.base;
        this.saucePlacement = builder.saucePlacement;
        this.style = builder.style;
    }

    public static class Builder {
        private final String size;
        private final List<String> ingredientList = new LinkedList<>();
        private final String base;
        private String saucePlacement;
        private String style;

        public Builder(String size, String base) {
            this.size = size;
            this.base = base;
        }

        public Builder addIngredient(String ingredient) {
            this.ingredientList.add(ingredient);
            return this;
        }

        public Builder makeCalzone(String saucePlacement) {
            this.style = "Calzone";
            this.saucePlacement = saucePlacement;
            return this;
        }

        public Pizza build() {
            if(ingredientList.size() < 1) {
                throw new NoIngredientsException();
            }
            return new Pizza(this);
        }

        static class NoIngredientsException extends RuntimeException {
        }
    }

    @Override
    public String toString() {
        return "Size: " + size + ", style: " + style +
                (style == "Calzone" ? ", sauce placement: " +  saucePlacement : "") +
                ", base: " + base +
                ", ingredients: " + ingredientList;
    }
}
