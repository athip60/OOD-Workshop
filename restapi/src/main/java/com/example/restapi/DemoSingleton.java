package com.example.restapi;

public class DemoSingleton {
    public static void main(String[] args) {
        DoSth doSth = DoSth.getInstance();
        System.out.println(doSth);
        System.out.println(DoSth.getInstance());
    }
}

class DoSth {
    private  static  DoSth instance;
    private DoSth() {}

    public static  DoSth getInstance() {
        if (instance == null) {
            instance = new DoSth();
        }
        return instance;
    }
}
