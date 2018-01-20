package de.logerbyte.bc2t2ics.bc2t;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class Bc2TaskFileTest {

    @Test
    public void test_delete_lineSeparator() throws IOException {
        String string = new String(Files. readAllBytes(Paths.get("bc2t_test_file" + File.separator + "test_lineSeparator")), StandardCharsets.UTF_8);

        Assert.assertTrue(string.contains(System.lineSeparator()));
        String newString = string.replace(System.lineSeparator(), " ");
        Assert.assertFalse(newString.contains(System.lineSeparator()));
    }
}