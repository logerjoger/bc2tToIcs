package de.logerbyte.bc2t2ics.bc2t;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
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
        try (BufferedReader br = new BufferedReader(new FileReader("bc2t_test_file"+ File.separator+"test_lineSeparator"))) {
            String line;






            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            String newLine = line.replace("/n", " ");

        }
    }


@Test
public void test_delete_line() throws IOException {
    String string = new String(Files.readAllBytes(Paths.get("bc2t_test_file" + File.separator + "test_lineSeparator")), StandardCharsets.UTF_8);
    System.out.println(string);
    String newString = string.replace(System.lineSeparator(), " ");
    System.out.println(newString);

}
}