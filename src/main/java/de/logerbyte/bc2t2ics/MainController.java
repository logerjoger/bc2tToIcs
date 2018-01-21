package de.logerbyte.bc2t2ics;

import de.logerbyte.bc2t2ics.readWriteFile.Bc2TaskJson;
import de.logerbyte.bc2t2ics.readWriteFile.Bc2TaskReader;

import java.io.FileNotFoundException;

class MainController {
    MainController(String[] args) {
        try {
            Bc2TaskJson[] bc2tJsonFromFile = new Bc2TaskReader().createBc2tJsonFromFile(args[0]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
