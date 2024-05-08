package com.builder;

import java.util.Map;


public class CappuccinoBuilder implements CoffeeDrinkBuilder {
    private String baseDrink;
    private String size;
    private String milkType;
    private Map<String, String> customizationOptions;
    private int quantity;

    @Override
    public void setBaseDrink(String baseDrink) {
        this.baseDrink = baseDrink;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    @Override
    public void addSyrup(String syrup) {
        // Cappuccino can have syrups added
    }

    @Override
    public void addTopping(String topping) {
        // Cappuccino can have toppings added
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void setCustomizationOptions(Map<String, String> options) {
        this.customizationOptions = options;
    }

    @Override
    public CoffeeDrink build() {
        return new CoffeeDrink(baseDrink, size, milkType, null, null, quantity, customizationOptions);
    }
}
