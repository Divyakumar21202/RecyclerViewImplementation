package com.example.myrecyclerview;

import android.widget.ImageView;

public class ContactModel {
    String name ,about;
    int imageView;

    public ContactModel(String name, String about, int imageView) {
        this.name = name;
        this.about = about;
        this.imageView = imageView;
    }
}
