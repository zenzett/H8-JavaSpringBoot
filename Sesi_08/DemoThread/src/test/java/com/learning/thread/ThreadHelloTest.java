<<<<<<< HEAD
package com.learning.thread;

import org.junit.Test;

public class ThreadHelloTest {

    public ThreadHelloTest() {

    }
    
    @Test
    public void testRun() {
        for (int i = 0; i < 5; i++) {
            ThreadHello instance = new ThreadHello(String.valueOf(i));
            Thread t = new Thread(instance);
            t.start();
        }
    }
}
=======
package com.learning.thread;

import org.junit.Test;

public class ThreadHelloTest {

    public ThreadHelloTest() {

    }
    
    @Test
    public void testRun() {
        for (int i = 0; i < 5; i++) {
            ThreadHello instance = new ThreadHello(String.valueOf(i));
            Thread t = new Thread(instance);
            t.start();
        }
    }
}
>>>>>>> f4057c49296405e8d39733d095f2ace084f59623
