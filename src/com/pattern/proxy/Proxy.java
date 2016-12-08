package com.pattern.proxy;

/**
 * Created by JSS on 2016/12/8.
 */
public class Proxy implements Subject {
    private RealSubject subject;

    public Proxy(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("This is proxy display beginning");
        subject.display();
        System.out.println("This is proxy display ending");
    }
}
