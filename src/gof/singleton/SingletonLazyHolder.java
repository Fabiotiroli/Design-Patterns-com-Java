package gof.singleton;

public class SingletonLazyHolder {

    private static  class InstanceHolder {
        public static  SingletonLazyHolder instance = new SingletonLazyHolder();
    }



    private SingletonLazyHolder() {
        // Private constructor to prevent instantiation
    }

    // Eager initialization
    public static SingletonLazyHolder getInstance() {

        return InstanceHolder.instance;
    }
}
