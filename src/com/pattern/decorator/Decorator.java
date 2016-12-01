package com.pattern.decorator;

/**
 * Created by JSS on 2016/12/1.
 */
public abstract class Decorator {
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }
    public void display() {
        component.display();
    }
}
