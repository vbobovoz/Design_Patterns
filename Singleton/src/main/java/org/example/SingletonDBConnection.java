package org.example;

public class SingletonDBConnection {
    private static SingletonDBConnection instance = null;

    SingletonDBConnection() { }

    public static SingletonDBConnection getInstance() {
        if (instance == null) {
            instance = new SingletonDBConnection();
        }
        return instance;
    }

    public void getConnection() {
        System.out.println("DBConnection...");
    }
}