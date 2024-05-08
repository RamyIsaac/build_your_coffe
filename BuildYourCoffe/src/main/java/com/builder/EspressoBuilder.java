package com.builder;

import java.util.Map;


public class EspressoBuilder implements CoffeeDrinkBuilder {
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
        // Espresso does not contain milk
        this.milkType = "None";
    }

    @Override
    public void addSyrup(String syrup) {
        // Espresso does not contain syrup
    }

    @Override
    public void addTopping(String topping) {
        // Espresso does not contain toppings
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    public void setCustomizationOptions(Map<String, String> options) {
        // Espresso does not have customization options
    }

    @Override
    public CoffeeDrink build() {
        return new CoffeeDrink(baseDrink, size, milkType, null, null, quantity, customizationOptions);
    }
}
