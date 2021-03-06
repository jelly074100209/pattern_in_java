package com.pattern.command;

/**
 * Created by jss on 16-12-19.
 */
public class ConcreteCommandB implements Command{
    private Receiver receiver;
    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.executeCommandB();
    }
}
