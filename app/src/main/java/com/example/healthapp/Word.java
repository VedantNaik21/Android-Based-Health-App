package com.example.healthapp;

public class Word {
    private String mItem;
    private String mQuantity;

    public Word(String Item, String Quantity){
        mItem = Item;
        mQuantity = Quantity;
    }
    public String getItem(){
        return mItem;
    }
    public String getQuantity(){
        return mQuantity;
    }
}
