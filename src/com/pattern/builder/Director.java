package com.pattern.builder;

/**
 * Created by jss on 16-11-22.
 */
public class Director {
    public Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void BuildFood() {
        builder.BuildCoolDisk();
        builder.BuildDrink();
        builder.BuildRice();
        builder.GetFood().show();
    }
}
