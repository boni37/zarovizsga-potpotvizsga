package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    public static final String searchedChar = "10x";

    public int encode(String filename, char character) {
        StringBuilder sb = new StringBuilder();
        Path file = Path.of(filename);
        if (!searchedChar.contains(String.valueOf(character))) {
            throw new IllegalArgumentException("The character is invalid");
        } else {
            String result = readFromFile(sb, file);
            int sum = 0;
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == character) {
                    sum += 1;
                }
            }
            return sum;
        }
    }

    private String readFromFile(StringBuilder sb, Path file) {
        try {
            BufferedReader reader = Files.newBufferedReader(file);
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
