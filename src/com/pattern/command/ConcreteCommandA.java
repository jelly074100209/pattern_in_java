package com.pattern.command;

/**
 * Created by jss on 16-12-19.
 */
public class ConcreteCommandA implements Command {
    private Receiver receiver;
    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.executeCommandA();
    }
}
