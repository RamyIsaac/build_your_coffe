package com.builder;

import java.util.Map;

public class CoffeeDrink {
    private String baseDrink;
    private String size;
    private String milkType;
    private Map<String, String> customizationOptions;
    private int quantity;

    public CoffeeDrink(String baseDrink, String size, String milkType, Map<String, String> customizationOptions, int quantity) {
        this.baseDrink = baseDrink;
        this.size = size;
        this.milkType = milkType;
        this.customizationOptions = customizationOptions;
        this.quantity = quantity;
    }

    // Getters and setters

    public CoffeeDrink(String baseDrink2, String size2, String milkType2, Object object, Object object2, int quantity2,
			Map<String, String> customizationOptions2) {
		// TODO Auto-generated constructor stub
	}

	public String getBaseDrink() {
        return baseDrink;
    }

    public void setBaseDrink(String baseDrink) {
        this.baseDrink = baseDrink;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public Map<String, String> getCustomizationOptions() {
        return customizationOptions;
    }

    public void setCustomizationOptions(Map<String, String> customizationOptions) {
        this.customizationOptions = customizationOptions;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CoffeeDrink{" +
                "baseDrink='" + baseDrink + '\'' +
                ", size='" + size + '\'' +
                ", milkType='" + milkType + '\'' +
                ", customizationOptions=" + customizationOptions +
                ", quantity=" + quantity +
                '}';
    }

	public static CoffeeDrink getCoffeeDrinkById(String drinkId) {
		// TODO Auto-generated method stub
		return null;
	}
}
