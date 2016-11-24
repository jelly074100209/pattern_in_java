package com.pattern.bridge;

/**
 * Created by JSS on 2016/11/24.
 */
public abstract class Abstraction {
    public Implementor implementor;
    public void SetImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
}
