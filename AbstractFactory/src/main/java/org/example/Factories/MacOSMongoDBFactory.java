package org.example.Factories;

import org.example.DB.DB;
import org.example.DB.MongoDB;
import org.example.OS.MacOS;
import org.example.OS.OS;

public class MacOSMongoDBFactory implements Factory {
    @Override
    public DB chooseDB() {
        return new MongoDB();
    }

    @Override
    public OS chooseOS() {
        return new MacOS();
    }
}
