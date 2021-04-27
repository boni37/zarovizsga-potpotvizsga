package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    private final String pattern = "01Xx";

    public int encode(String file, char code) {
        if (!pattern.contains(String.valueOf(code))) {
            throw new IllegalArgumentException("Invalid code");
        }
        int count = 0;
        try {
            String reader = Files.readString(Path.of(file));
            for (int i = 0; i < reader.length(); i++) {
                if (reader.charAt(i) == code) {
                    count++;
                }
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file", e);
        }

        return count;
    }
}
