package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> listeEntiers = new ArrayList<>();
        Collections.addAll(listeEntiers, -1, 5, 7, 3, -2, 4, 8, 5);

        System.out.println(listeEntiers);
        System.out.println(listeEntiers.size());

        int max = Collections.max(listeEntiers);
        System.out.println(max);

        int min = Collections.min(listeEntiers);
        listeEntiers.remove(Integer.valueOf(min));
        System.out.println(listeEntiers);

        for (int entier : listeEntiers) {
            if (listeEntiers.get(entier) < 0) {
                listeEntiers.set(entier, -listeEntiers.get(entier));
            }
        }

        System.out.println(listeEntiers);
    }
}
