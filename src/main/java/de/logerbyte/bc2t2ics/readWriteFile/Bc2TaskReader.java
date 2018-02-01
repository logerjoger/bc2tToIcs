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
        Bc2File bc2TaskBc2File = new Bc2File();
        bc2TaskBc2File.setPathName(arg);

        java.io.File file = new java.io.File(bc2TaskBc2File.getPathName());
        JsonReader jsonReader;

        jsonReader = new JsonReader(new FileReader(file));

        return gson.fromJson(jsonReader, Bc2TaskJson[].class);
    }
}
