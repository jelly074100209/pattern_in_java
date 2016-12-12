package com.pattern.responsibility_chain;

/**
 * Created by JSS on 2016/12/12.
 */
public class ConcreteHandlerB extends Handler{
    public ConcreteHandlerB(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle() {
        if (this.handler != null) {
            this.handler.handle();
        }
        System.out.println("B handler finish.");
    }
}
