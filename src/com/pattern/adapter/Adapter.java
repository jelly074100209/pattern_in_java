package com.pattern.adapter;

/**
 * Created by JSS on 2016/11/23.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void Request1() {
        System.out.println("Target Request1");
    }
}
