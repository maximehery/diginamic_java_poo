package fr.diginamic.sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");
        String max = Collections.max(set);
        System.out.println("Élément le plus grand : " + max);
        set.removeIf(s -> s.length() == max.length());
        System.out.println("Liste des éléments : " + set);
    }
}
