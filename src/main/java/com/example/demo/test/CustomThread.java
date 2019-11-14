package com.example.demo.test;

public class CustomThread implements Runnable {

    @Override
    public void run() {
        HungrySingleton singleton = new HungrySingleton();
        System.out.println(this.hashCode());
    }
}
