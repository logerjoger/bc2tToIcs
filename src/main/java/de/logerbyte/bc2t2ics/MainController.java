package de.logerbyte.bc2t2ics;

import de.logerbyte.bc2t2ics.readWriteFile.Bc2File;
import de.logerbyte.bc2t2ics.readWriteFile.Bc2TaskJson;
import de.logerbyte.bc2t2ics.readWriteFile.Bc2TaskReader;

import java.io.File;
import java.io.FileNotFoundException;

class MainController {

    MainController(String[] args) {
        Bc2TaskJson[] bcJson = createBCJson("bc2t_test_file" + File.separator + "bc2t_test_file.txt");
        Bc2File.createIcalFile(bcJson, "bc2t_test_file" + File.separator + "fake_bc2_file.txt");
    }

    private Bc2TaskJson[] createBCJson(String args) {
        try {
            return new Bc2TaskReader().createBc2tJsonFromFile(args);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new Bc2TaskJson[0];
    }

}
