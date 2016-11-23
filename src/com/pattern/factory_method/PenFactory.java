package com.pattern.factory_method;

/**
 * Created by JSS on 2016/11/23.
 */
public abstract class PenFactory {
    public abstract <T extends Pen> T createPen(Class<T> c);
}
