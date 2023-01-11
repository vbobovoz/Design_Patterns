package org.example;

import org.example.DB.DB;
import org.example.Factories.Factory;
import org.example.OS.OS;

public class UserChoose {
    private OS os;
    private DB db;

    public UserChoose(Factory factory) {
        os = factory.chooseOS();
        db = factory.chooseDB();
    }

    public void print() {
        os.getInfo();
        db.getInfo();
    }
}
