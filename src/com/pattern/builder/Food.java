package com.pattern.builder;

import java.util.Vector;

/**
 * Created by jss on 16-11-22.
 */
public class Food {
    private Vector<String> mFoodName;
    private Vector<Integer> mPrice;
    public Food() {
        mFoodName = new Vector<String>();
        mPrice = new Vector<Integer>();
    }
    public void add(String foodName, int price) {
        mFoodName.add(foodName);
        mPrice.add(price);
    }
    public void show() {
        System.out.println("Food List:");
        for (int i=0; i<mFoodName.size(); i++) {
            System.out.println(mFoodName.elementAt(i) + " " + mPrice.elementAt(i));
        }
    }
}
