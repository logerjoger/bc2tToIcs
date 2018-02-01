package de.logerbyte.bc2t2ics;

import de.logerbyte.bc2t2ics.readWriteFile.Bc2File;
import de.logerbyte.bc2t2ics.readWriteFile.Bc2TaskJson;
import de.logerbyte.bc2t2ics.readWriteFile.Bc2TaskReader;

import java.io.FileNotFoundException;

class MainController {

    MainController(String[] args) {
        Bc2TaskJson[] bcJson = createBCJson(args);
        Bc2File.createIcalFile(bcJson);
    }

    private Bc2TaskJson[] createBCJson(String[] args) {
        try {
            return new Bc2TaskReader().createBc2tJsonFromFile(args[0]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new Bc2TaskJson[0];
    }

}
