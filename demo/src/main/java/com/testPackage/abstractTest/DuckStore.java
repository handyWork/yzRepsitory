package com.testPackage.abstractTest;

public abstract  class DuckStore {

    private String name;
    private String street;


    abstract void doing();
    abstract  void eat();
    public DuckStore(String name, String street) {
        this.name = name;
        this.street = street;
    }
    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }
}
