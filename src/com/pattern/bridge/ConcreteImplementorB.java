package com.pattern.bridge;

/**
 * Created by JSS on 2016/11/24.
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void display() {
        System.out.println("ConcreteImplementorB display");
    }
}
