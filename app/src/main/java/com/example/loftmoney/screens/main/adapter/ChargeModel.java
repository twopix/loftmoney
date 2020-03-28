package com.example.loftmoney.screens.main.adapter;

public class ChargeModel {
    private String name;
    private String value;

    public ChargeModel(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
