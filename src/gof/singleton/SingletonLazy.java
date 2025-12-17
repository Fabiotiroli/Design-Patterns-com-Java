package gof.singleton;

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        // Private constructor to prevent instantiation
    }

    // Lazy initialization
    // Not thread-safe
    // Use with caution in multi-threaded environments
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
