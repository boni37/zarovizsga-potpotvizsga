package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> uniqueChars(String text) {
        List<Character> result = new ArrayList<>();
        if (text == null) {
            throw new IllegalArgumentException("The string is empty.");
        } else {
            for (int i = 0; i < text.length(); i++) {
                if (result.contains(text.charAt(i))) {
                } else {
                    result.add(text.charAt(i));
                }
            }
        }
        return result;
    }

}
