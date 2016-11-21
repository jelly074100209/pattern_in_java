package com.pattern.abstract_factory;

/**
 * Created by JSS on 2016/11/21.
 */
public abstract class AbstractFactory {
    public AbstractFactory(){}

    public abstract AbstractProductA CreateProductA();

    public abstract AbstractProductB CreateProductB();
}
