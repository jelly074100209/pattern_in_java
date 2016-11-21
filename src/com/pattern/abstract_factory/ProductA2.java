package com.pattern.abstract_factory;

/**
 * Created by JSS on 2016/11/21.
 */
public class ProductA2 extends AbstractProductA {
    public ProductA2() {
        System.out.println("ProductA2 Constructor");
    }

    @Override
    public void display() {
        System.out.println("ProductA2");
    }
}
