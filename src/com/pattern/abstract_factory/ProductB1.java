package com.pattern.abstract_factory;

/**
 * Created by JSS on 2016/11/21.
 */
public class ProductB1 extends AbstractProductB{
    public ProductB1() {
        System.out.println("ProductB1 Constructor");
    }

    @Override
    public void display() {
        System.out.println("ProductB1");
    }
}
