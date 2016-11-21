package com.pattern.state;

/**
 * Created by jss on 16-11-21.
 */
public abstract class State {
    public State(){}
    public abstract void Handle(Request request);
}
