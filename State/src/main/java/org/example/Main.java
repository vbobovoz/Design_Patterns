package org.example;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        System.out.println(dbConnection.info());

        dbConnection.setCurState(new OpenState());
        System.out.println(dbConnection.info());

        dbConnection.setCurState(new ProcessState());
        System.out.println(dbConnection.info());
    }
}