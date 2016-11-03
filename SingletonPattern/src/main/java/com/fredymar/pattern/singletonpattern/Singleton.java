package com.fredymar.pattern.singletonpattern;

import java.util.Optional;

public class Singleton {

    private static Singleton instance;
    private String description;

    private Singleton() {
    }

    public synchronized static Singleton getInstance() {
        return Optional.ofNullable(instance).orElse(new Singleton());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
