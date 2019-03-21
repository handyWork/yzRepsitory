package com.testPackage.abstractTest;

public class DuckFactory extends  DuckStore {

    public DuckFactory(String name, String street) {
        super(name, street);
    }

    @Override
    void eat() {

    }

    @Override
   public void doing() {
        System.out.println("doing some thing");
    }
}
