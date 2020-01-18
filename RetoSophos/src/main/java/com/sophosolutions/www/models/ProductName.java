package com.sophosolutions.www.models;

public enum ProductName {

    NINTENDO_SWITCH("Nintendo Switch 2019 Neon Bateria Extendida + Super Smash Bro Ultimate");

    private String name;

    private ProductName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
