package com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JSS on 2016/11/25.
 */
public class Composite extends Component {
    private List<Component> child = new ArrayList<Component>();

    public Composite(String s) {
        super(s);
    }
    @Override
    public void Add(Component component) {
        child.add(component);
    }

    @Override
    public void Remove(Component component) {
        child.remove(component);
    }

    @Override
    public void GetChild(int index) {
        System.out.println(child.get(index).name);
    }

    @Override
    public void Operation() {
        for(Component element: child) {
            System.out.print(element.name + " ");
            System.out.println();
        }
    }
}
