package com.pattern.responsibility_chain;

/**
 * Created by JSS on 2016/12/12.
 */
public class ConcreteHandlerA extends Handler{
    public ConcreteHandlerA(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle() {
        if (this.handler != null) {
            System.out.println("A handle finish, then B handle begin.");
            this.handler.handle();
        } else {
            System.out.println("A handle finish.");
        }

    }
}
