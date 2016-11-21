package com.pattern.abstract_factory;

/**
 * Created by JSS on 2016/11/21.
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA CreateProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB CreateProductB() {
        return new ProductB1();
    }
}
