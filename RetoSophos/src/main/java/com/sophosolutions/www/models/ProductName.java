package com.sophosolutions.www.models;

public enum ProductName {

    LENOVO_COMPUTER("Notebook Lenovo IdeaPad L340 Gaming, 15.6, Intel Core i5-9300H 2.4GHz, 8GB DDR4, 1TB SATA");

    private String name;

    private ProductName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
