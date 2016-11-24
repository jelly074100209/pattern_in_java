package com.pattern.bridge;

/**
 * Created by JSS on 2016/11/24.
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void display() {
        System.out.println("ConcreteImplementorA display");
    }
}
