package com.pattern.factory_method;

/**
 * Created by JSS on 2016/11/22.
 */
public class MongoDB extends Database {
    @Override
    public void display() {
        System.out.println("MongoDB has created");
    }
}
