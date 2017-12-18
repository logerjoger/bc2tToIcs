package de.logerbyte.bc2t2ics.bc2t;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.sun.istack.internal.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Bc2TaskReader {
    public Bc2TaskReader() {
    }

    public Bc2TaskJson[] createBc2tJsonFromFile(@NotNull String arg) throws FileNotFoundException {
        Gson gson = new Gson();
        Bc2TaskFile bc2TaskFile = new Bc2TaskFile();
        bc2TaskFile.setPathName(arg);

        File file = new File(bc2TaskFile.getPathName());
        JsonReader jsonReader;

        jsonReader = new JsonReader(new FileReader(file));

        return gson.fromJson(jsonReader, Bc2TaskJson[].class);
    }
}
