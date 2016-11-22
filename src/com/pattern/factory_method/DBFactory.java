package com.pattern.factory_method;

/**
 * Created by JSS on 2016/11/22.
 */
public abstract class DBFactory {
    public Database database;
    public abstract Database CreateDB();
}
