package test;

import java.util.*;

public class Dictionary {

    TreeMap<Character, Set<String>> map = new TreeMap<>();

    public Dictionary(String text) {
        Scanner s = new Scanner(text);
        while (s.hasNext()) {
            String word = s.next();
            char w = word.charAt(0);
            if (!map.containsKey(w))
                map.put(w, new HashSet<>());
            map.get(w).add(word);
        }
        s.close();
    }

    public Set<String> getSet(char c) {
        if (map.containsKey(c)) {
            return map.get(c);

        } else return new HashSet<>();
    }
}
