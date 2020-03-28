package com.example.loftmoney.screens.main.adapter;

import java.io.Serializable;

public class ChargeModel implements Serializable {

    public static String KEY_NAME = ChargeModel.class.getName();

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
