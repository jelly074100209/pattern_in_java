package com.pattern.reactor;

import java.io.IOException;
import java.nio.channels.SocketChannel;

/**
 * Created by Cherish on 2017/4/23.
 */
public class Acceptor implements Runnable {
    private Reactor reactor;
    public Acceptor(Reactor reactor) {
        this.reactor = reactor;
    }

    public void run() {
        try {
            SocketChannel socketChannel = reactor.serverSocketChannel.accept();
            if (socketChannel != null) {
                new SocketReadHandler(reactor.selector, socketChannel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
