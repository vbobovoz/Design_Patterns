package org.example;

public class Main {
    public static void main(String[] args) {
        SingletonDBConnection singletonDbConnection = new SingletonDBConnection();
        singletonDbConnection.getConnection();
    }
}