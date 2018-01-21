package de.logerbyte.bc2t2ics.readWriteFile;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileContentTest {

    @Test
    public void test_delete_lineSeparator() throws IOException {
        String string = new String(Files. readAllBytes(Paths.get("bc2t_test_file" + File.separator + "fake_bc2_file.txt")), StandardCharsets.UTF_8);

        Assert.assertTrue(string.contains(System.lineSeparator()));
        String newString = string.replace(System.lineSeparator(), " ");
        Assert.assertFalse(newString.contains(System.lineSeparator()));
        Assert.assertTrue(newString.contains("/n"));
    }

    @Test
    public void test_create_and_write_into_file() throws IOException {
        String writeContent = "That is a test file creation.";
        String pathName = "bc2t_test_file" + File.separator + "test_wrote_into files";
        Files.write(Paths.get(pathName), writeContent.getBytes());

        File file = new File(pathName);
        Assert.assertTrue(file.exists());
        String string = new String(Files. readAllBytes(Paths.get(pathName)), StandardCharsets.UTF_8);
        Assert.assertTrue(string.contains(writeContent));
        Assert.assertTrue(Files.deleteIfExists(Paths.get(pathName)));
    }


}