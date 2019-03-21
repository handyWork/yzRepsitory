package com.testPackage.abstractTest;

public class mainTest {

    public static void dothing(test a){
        a.doing();
    }
    public void handle(test2 b){
        b.testDoing();
    }

    public static void main(String[] args) {
        mainTest mainTest = new mainTest();
        test duck = new test("a","b");
        duck.eat();
        mainTest.dothing(duck);
        String name = duck.getName();
        System.out.println(name);
    }
}
