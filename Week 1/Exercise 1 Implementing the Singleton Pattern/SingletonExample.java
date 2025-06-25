package com.singleton.demo;

public class SingletonExample {
private static SingletonExample singleInstance;

private SingletonExample() {
    System.out.println("Singleton instance created.");
}

public static SingletonExample getInstance() {
    if (singleInstance == null) {
        singleInstance = new SingletonExample();
    }
    return singleInstance;
}

public void showMessage() {
    System.out.println("Hello! This is a Singleton class example.");
}
}


