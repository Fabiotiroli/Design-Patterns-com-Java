package gof.singleton;

public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        // Private constructor to prevent instantiation
    }

    // Eager initialization
    public static SingletonEager getInstance() {
        return instance;
    }
}
