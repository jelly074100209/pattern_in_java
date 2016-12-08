package com.pattern.proxy;

/**
 * Created by JSS on 2016/12/8.
 */
public class RealSubject implements Subject {
    @Override
    public void display() {
        System.out.println(this.getClass().toString());
    }
}
