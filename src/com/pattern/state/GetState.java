package com.pattern.state;

/**
 * Created by jss on 16-11-21.
 */
public class GetState extends State {
    public GetState() {}

    @Override
    public void Handle(Request request) {
        request.current_state = new PostState();
        System.out.println("get state, next is post state");
    }
}
