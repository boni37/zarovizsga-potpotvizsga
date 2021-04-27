package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> uniqueChars(String characters) {
        List<Character> result = new ArrayList<>();
        if (characters == null) {
            throw new IllegalArgumentException("Invalid string");
        } else {
            for (int i = 0; i < characters.length(); i++) {
                if (!result.contains(characters.charAt(i))) {
                    result.add(characters.charAt(i));
                }
            }
        }
        return result;
    }
}
