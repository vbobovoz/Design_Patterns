package org.example.Factories;

import org.example.DB.DB;
import org.example.OS.OS;

public interface Factory {
    OS chooseOS();
    DB chooseDB();
}
