<<<<<<< HEAD
package com.learning.thread;

import org.junit.Test;

public class ThreadWorldTest {
    
    public ThreadWorldTest() {

    }

    @Test
    public void testRun() {
        for (int i=0; i<5; i++) {
            ThreadWorld instance = new ThreadWorld();
            instance.setName(""+i);
            instance.start();
        }
    }
}
=======
package com.learning.thread;

import org.junit.Test;

public class ThreadWorldTest {
    
    public ThreadWorldTest() {

    }

    @Test
    public void testRun() {
        for (int i=0; i<5; i++) {
            ThreadWorld instance = new ThreadWorld();
            instance.setName(""+i);
            instance.start();
        }
    }
}
>>>>>>> f4057c49296405e8d39733d095f2ace084f59623
