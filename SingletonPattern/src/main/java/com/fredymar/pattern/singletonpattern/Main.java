package com.fredymar.pattern.singletonpattern;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setDescription("SingletonPattern");
        System.out.println(singleton.getDescription());
    }
}
