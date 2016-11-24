package com.pattern.bridge;

/**
 * Created by JSS on 2016/11/24.
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction() {}
    public void display() {
        this.implementor.display();
    }
}
