package com.pattern.singleton;

/**
 * Created by jss on 16-11-20.
 */
public class Singleton {
    private static Singleton _instance;
    private Singleton() {}

    //Thread safety
    public static synchronized Singleton getInstance() {
        if (_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }
}
