package com.pattern.state;

/**
 * Created by jss on 16-11-21.
 */
public class PostState extends State{
    public PostState() {}

    @Override
    public void Handle(Request request) {
        request.current_state = new GetState();
        System.out.println("post state, next is get state");
    }
}
