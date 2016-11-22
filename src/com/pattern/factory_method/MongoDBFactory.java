package com.pattern.factory_method;

/**
 * Created by JSS on 2016/11/22.
 */
public class MongoDBFactory extends DBFactory {
    @Override
    public Database CreateDB() {
        this.database = new MongoDB();
        return this.database;
    }
}
