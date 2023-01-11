package org.example.Factories;

import org.example.DB.DB;
import org.example.DB.SQLite;
import org.example.OS.Linux;
import org.example.OS.OS;

public class LinuxSQLiteFactory implements Factory {
    @Override
    public DB chooseDB() {
        return new SQLite();
    }

    @Override
    public OS chooseOS() {
        return new Linux();
    }
}
