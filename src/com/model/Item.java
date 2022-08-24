package com.model;

public class Item {

    private int itemNum;
    private String itemName;
    private double itemPrice;
    private int count;

    public Item() {
    }

    public Item(int itemNum, String itemName, double itemPrice, int count) {
        this.itemNum = itemNum;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
