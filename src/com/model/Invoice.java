package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invoice {

    private int number;
    private Date date;
    private String name;

    private List<Item> item = new ArrayList<Item>();

    public Invoice() {
    }

    public Invoice(int number, Date date, String name) {
        this.number = number;
        this.date = date;
        this.name = name;
    }

    public void addItem(Item i){
        item.add(i);
    }
    
    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
