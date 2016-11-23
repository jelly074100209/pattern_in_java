package com.pattern.prototype;

/**
 * Created by JSS on 2016/11/23.
 */
public abstract class Prototype implements Cloneable{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println(this.name);
        return this.name;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
