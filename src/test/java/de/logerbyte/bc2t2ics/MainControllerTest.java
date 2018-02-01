package de.logerbyte.bc2t2ics;

import de.logerbyte.bc2t2ics.readWriteFile.Bc2TaskJson;
import de.logerbyte.bc2t2ics.readWriteFile.Bc2TaskReader;
import org.junit.Test;

import java.io.File;

public class MainControllerTest {

    private Bc2TaskJson[] bc2tJsonFromFile;

    public MainControllerTest() {
    }

    @Test
    public void testCreateJson() throws Exception {
        bc2tJsonFromFile = new Bc2TaskReader().createBc2tJsonFromFile("bc2t_test_file" + File.separator + "bc2t_test.txt");
    }

    @Test
    public void testCreateIcalFile(){

    }

}