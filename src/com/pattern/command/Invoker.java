package com.pattern.command;

import java.util.Vector;

/**
 * Created by jss on 16-12-19.
 */
public class Invoker {
    private Vector<Command> cmd_list;
    public Invoker() {
        cmd_list = new Vector<>();
    }
    public void setCommand(Command cmd) {
        cmd_list.add(cmd);
    }
    public void notifyEach() {
        for (Command command : cmd_list) {
            command.execute();
        }
    }
}
