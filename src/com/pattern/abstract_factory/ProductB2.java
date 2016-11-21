package com.pattern.abstract_factory;

/**
 * Created by JSS on 2016/11/21.
 */
public class ProductB2 extends AbstractProductB {
    public ProductB2() {
        System.out.println("ProductB2 Constructor");
    }

    @Override
    public void display() {
        System.out.println("ProductB2");
    }
}
