package org.example.Factories;

import org.example.DB.DB;
import org.example.DB.MySQL;
import org.example.OS.OS;
import org.example.OS.Windows;

public class WindowsMySQLFactory implements Factory {
    @Override
    public DB chooseDB() {
        return new MySQL();
    }

    @Override
    public OS chooseOS() {
        return new Windows();
    }
}
