package com.pattern.builder;

/**
 * Created by jss on 16-11-22.
 */
public class BuilderA extends Builder {
    private Food food;
    public BuilderA() {
        food = new Food();
    }
    @Override
    public void BuildRice() {
        food.add("Rice", 10);
    }

    @Override
    public void BuildDrink() {
        food.add("Drink", 20);
    }

    @Override
    public void BuildCoolDisk() {
        food.add("CoolDisk", 30);
    }

    @Override
    public Food GetFood() {
        return food;
    }
}
