package de.logerbyte.bc2t2ics.readWriteFile;

import com.sun.istack.internal.Nullable;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileContent {
    public static final String REGEX_DATE = "\\d\\d.\\d\\d.\\d\\d\\d\\d";

    private String pathName;

    String getPathName() {
        return pathName;
    }

    void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public @Nullable String readFileContent(String pathName) {
        try {
            return new String(Files. readAllBytes(Paths.get(pathName)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String[] splitContent(String content, String regex) {
        return content.split(regex);
    }
}
