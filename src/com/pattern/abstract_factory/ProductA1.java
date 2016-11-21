package com.pattern.abstract_factory;

/**
 * Created by JSS on 2016/11/21.
 */
public class ProductA1 extends AbstractProductA{

    public ProductA1() {
        System.out.println("ProductA1 Constructor");
    }

    @Override
    public void display() {
        System.out.println("ProductA1");
    }
}
