package com.example.luping.fragmentrecyclercardview;


public class Phone {

    private String name;
    private int price;
    private int imgID;


    public Phone(String name,int price,int imgID) {
        this.price = price;
        this.imgID = imgID;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
