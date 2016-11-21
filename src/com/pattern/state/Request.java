package com.pattern.state;

/**
 * Created by jss on 16-11-21.
 */
public class Request {
    public State current_state;
    public Request(State state) {
        this.current_state = state;
    }

    public void Start() {
        this.current_state.Handle(this);
    }
}
