package test;

import java.lang.reflect.Array;
import java.util.*;

public class Dictionary {

    String text;
    String[] words;
    TreeMap<String, Set<String>> map = new TreeMap<String, Set<String>>();

    public Dictionary(String text) {
        this.text = text;
        words = text.split(" ");

    }

    public Set<String> getSet(char c) {
        if (map.containsKey(c)) {
            Set<String> mapMatch = map.get(c);
            return mapMatch;
        } else return null;
    }
}
