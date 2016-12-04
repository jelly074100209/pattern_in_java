package com.pattern.flyweight;

import java.util.Hashtable;

/**
 * Created by Cherish on 2016/12/4.
 */
public class FlyweightFactory {
    public Hashtable Flyweights = new Hashtable();
    public FlyweightFactory(){}
    public Flyweight getFlyweight(Object obj) {
        Flyweight flyweight = (Flyweight)Flyweights.get(obj);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(obj.toString());
            Flyweights.put(obj, flyweight);
        }
        return flyweight;
    }
    public int getSize() {
        return Flyweights.size();
    }
}
