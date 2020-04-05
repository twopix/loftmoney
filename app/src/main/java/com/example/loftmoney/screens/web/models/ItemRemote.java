package com.example.loftmoney.screens.web.models;
import com.google.gson.annotations.SerializedName;

public class ItemRemote {
    private String id;
    private String productId;
    private String name;
    private Integer price;
    private String type;
    private String date;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }
}
