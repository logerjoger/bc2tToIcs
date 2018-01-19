package de.logerbyte.bc2t2ics;

import de.logerbyte.bc2t2ics.bc2t.Bc2TaskReader;
import org.junit.Test;

import java.io.File;

public class MainControllerTest {

    public MainControllerTest() {
    }

    @Test
    public void testCreateJson() throws Exception {
        new Bc2TaskReader().createBc2tJsonFromFile("bc2t_test_file"+ File.separator+"bc2t_test.txt");
    }

}