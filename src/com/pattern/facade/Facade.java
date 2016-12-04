package com.pattern.facade;

/**
 * Created by Cherish on 2016/12/4.
 */
public class Facade {
    public static void method1() {
        SubClassA subA = new SubClassA();
        subA.display();
        SubClassB subB = new SubClassB();
        subB.display();
    }

    public static void method2() {
        SubClassC subC = new SubClassC();
        subC.display();
        SubClassD subD = new SubClassD();
        subD.display();
    }
}
