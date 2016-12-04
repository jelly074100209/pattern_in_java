package com.pattern.flyweight;

/**
 * Created by Cherish on 2016/12/4.
 */
public class ConcreteFlyweight implements Flyweight {
    private String name;
    public ConcreteFlyweight(String name) {
        this.name = name;
    }
    @Override
    public void Operation() {
        System.out.println(this.getClass().toString() + ": " + name);
    }
}
