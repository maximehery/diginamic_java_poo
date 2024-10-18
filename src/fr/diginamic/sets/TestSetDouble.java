package fr.diginamic.sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>();
        Collections.addAll(set, 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01);
        System.out.println("Liste des éléments : " + set);
        double max = Collections.max(set);
        System.out.println("Élément le plus grand : " + max);
        double min = Collections.min(set);
        set.remove(min);
        System.out.println("Liste des éléments : " + set);
    }
}
