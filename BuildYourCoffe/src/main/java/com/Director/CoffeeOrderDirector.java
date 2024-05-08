package com.Director;

import java.util.Map;

import com.builder.*;


public class CoffeeOrderDirector {
    private CoffeeDrinkBuilder coffeeDrinkBuilder;

    public CoffeeOrderDirector(CoffeeDrinkBuilder coffeeDrinkBuilder) {
        this.coffeeDrinkBuilder = coffeeDrinkBuilder;
    }

    public void constructCoffeeDrink(String baseDrink, String size, String milkType, Map<String, String> options, int quantity) {
        coffeeDrinkBuilder.setBaseDrink(baseDrink);
        coffeeDrinkBuilder.setSize(size);
        coffeeDrinkBuilder.setMilkType(milkType);
        coffeeDrinkBuilder.setCustomizationOptions(options);
        coffeeDrinkBuilder.setQuantity(quantity);
    }

    public CoffeeDrink getCoffeeDrink() {
        return coffeeDrinkBuilder.build();
    }
}

