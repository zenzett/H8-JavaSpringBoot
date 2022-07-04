<<<<<<< HEAD
package com.learning.thread;

import java.util.Random;

public class NumberGenerator {
    private final int low;
    private final int high;

    public NumberGenerator(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public int randomNumber() {
        Random r = new Random();
        int result = r.nextInt(high-low) + low;
        return result;
    }
}
=======
package com.learning.thread;

import java.util.Random;

public class NumberGenerator {
    private final int low;
    private final int high;

    public NumberGenerator(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public int randomNumber() {
        Random r = new Random();
        int result = r.nextInt(high-low) + low;
        return result;
    }
}
>>>>>>> f4057c49296405e8d39733d095f2ace084f59623
