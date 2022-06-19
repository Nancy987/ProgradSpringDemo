package com.ProgradSpringApp.SpringDemoApp;

public class Menu {
    private String itemName;
    private float price;

    public Menu(String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
