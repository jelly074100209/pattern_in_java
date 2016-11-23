package com.pattern.factory_method;

/**
 * Created by JSS on 2016/11/23.
 */
public class ConcretePenFactory extends PenFactory {
    @Override
    public <T extends Pen> T createPen(Class<T> c) {
        T pen = null;
        try {
            pen = (T)Class.forName(c.getName()).newInstance();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return pen;
    }
}
