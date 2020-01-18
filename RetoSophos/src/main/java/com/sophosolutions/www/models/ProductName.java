package com.sophosolutions.www.models;

public enum ProductName {

    LENOVO_COMPUTER("Nintendo Switch 2019 Neon Bateria Extendida + Super Smash Bro Ultimate");

    private String name;

    private ProductName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
