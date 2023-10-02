package com.example.thuchanh2jstl;

public class Product {
    private String prName;
    private String prCost;
    private String prPicture;

    public Product(String prName, String prCost, String prPicture) {
        this.prName = prName;
        this.prCost = prCost;
        this.prPicture = prPicture;
    }

    public Product() {
    }

    public String getPrName() {
        return prName;
    }

    public void setPrName(String prName) {
        this.prName = prName;
    }

    public String getPrCost() {
        return prCost;
    }

    public void setPrCost(String prCost) {
        this.prCost = prCost;
    }

    public String getPrPicture() {
        return prPicture;
    }

    public void setPrPicture(String prPicture) {
        this.prPicture = prPicture;
    }
}
