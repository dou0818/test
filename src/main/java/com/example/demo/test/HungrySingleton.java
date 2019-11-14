package com.example.demo.test;

public class HungrySingleton {
    private static HungrySingleton singleton;

    public HungrySingleton(){
        singleton = new HungrySingleton();
    }

    public HungrySingleton getSingleton(){
        return singleton;
    }

}
