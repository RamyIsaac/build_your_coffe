package com.builder;

import java.util.Map;


public interface CoffeeDrinkBuilder {
    void setBaseDrink(String baseDrink);
    void setSize(String size);
    void setMilkType(String milkType);
    void addSyrup(String syrup);
    void addTopping(String topping);
    void setQuantity(int quantity);
    void setCustomizationOptions(Map<String, String> options);
    CoffeeDrink build();
}

