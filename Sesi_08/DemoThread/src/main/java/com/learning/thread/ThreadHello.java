<<<<<<< HEAD
package com.learning.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadHello implements Runnable {

    private final String name;

    public ThreadHello(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + ": Hello");
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
=======
package com.learning.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadHello implements Runnable {

    private final String name;

    public ThreadHello(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + ": Hello");
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
>>>>>>> f4057c49296405e8d39733d095f2ace084f59623
