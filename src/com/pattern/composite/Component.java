package com.pattern.composite;

/**
 * Created by JSS on 2016/11/25.
 */
public abstract class Component {
    public String name;
    public Component(String s) {
        this.name = s;
    }
    public abstract void Operation();
    public abstract void Add(Component component);
    public abstract void Remove(Component component);
    public abstract void GetChild(int index);
}
