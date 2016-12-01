package com.pattern.decorator;

/**
 * Created by JSS on 2016/12/1.
 */
public class ConcreteComponent implements Component {

    @Override
    public void display() {
        System.out.println("ConcreteComponent");
    }
}
