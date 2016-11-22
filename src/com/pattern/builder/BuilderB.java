package com.pattern.builder;

/**
 * Created by jss on 16-11-22.
 */
public class BuilderB extends Builder{
    private Food food;
    public BuilderB() {
        food = new Food();
    }
    @Override
    public Food GetFood() {
        return food;
    }

    @Override
    public void BuildDrink() {
        food.add("Drink", 100);
    }

    @Override
    public void BuildRice() {
        food.add("Rice", 200);
    }

    @Override
    public void BuildCoolDisk() {
        food.add("CoolDisk", 300);
    }
}
