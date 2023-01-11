package org.example;

import org.example.Factories.Factory;
import org.example.Factories.LinuxSQLiteFactory;
import org.example.Factories.MacOSMongoDBFactory;
import org.example.Factories.WindowsMySQLFactory;

public class Main {
    public static UserChoose configuration(String osName) {
        UserChoose userChoose;
        Factory factory;
        osName = osName.toLowerCase();
        if(osName.contains("mac")) {
            factory = new MacOSMongoDBFactory();
        } else if (osName.contains("windows")) {
            factory = new WindowsMySQLFactory();
        } else {
            factory = new LinuxSQLiteFactory();
        }
        userChoose = new UserChoose(factory);
        return userChoose;
    }

    public static void main(String[] args) {
        UserChoose userChoose = configuration("WINDOWSOS");
        userChoose.print();
    }
}