package com.pattern.decorator;

/**
 * Created by JSS on 2016/12/1.
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("ConcreteDecorator display()");
    }
}
