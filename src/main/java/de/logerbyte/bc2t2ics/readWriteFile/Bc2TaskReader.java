package de.logerbyte.bc2t2ics.readWriteFile;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.sun.istack.internal.NotNull;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Bc2TaskReader {
    public Bc2TaskReader() {
    }

    public Bc2TaskJson[] createBc2tJsonFromFile(@NotNull String arg) throws FileNotFoundException {
        Gson gson = new Gson();
        FileContent bc2TaskFileContent = new FileContent();
        bc2TaskFileContent.setPathName(arg);

        java.io.File file = new java.io.File(bc2TaskFileContent.getPathName());
        JsonReader jsonReader;

        jsonReader = new JsonReader(new FileReader(file));

        return gson.fromJson(jsonReader, Bc2TaskJson[].class);
    }
}
