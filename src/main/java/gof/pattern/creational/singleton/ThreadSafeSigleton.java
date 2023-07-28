package main.java.gof.pattern.creational.singleton;

public final class ThreadSafeSigleton {

    // The field must be declared as volatile for the double-checked locking to work correctly.
    private static volatile ThreadSafeSigleton instance;

    public String value;

    private ThreadSafeSigleton(String value) {
        this.value = value;
    }

    public static ThreadSafeSigleton getInstance(String value) {
        /*
         The technique we are using here is called 'Double-Checked Locking.'
         It is used to prevent the creation of multiple singleton objects if the method is called from multiple threads simultaneously.
         Although the variable 'result' may seem redundant here, it helps avoid implementation pitfalls of DCL in Java.
         You can read more about this issue here: https://en.wikipedia.org/wiki/Double-checked_locking
         */
        ThreadSafeSigleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (ThreadSafeSigleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSigleton(value);
            }
            return instance;
        }
    }

}
