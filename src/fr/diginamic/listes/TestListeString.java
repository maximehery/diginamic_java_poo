package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        Collections.addAll(liste, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

        String villePlusLongue = liste.getFirst();

        for (String ville : liste) {
            if (ville.length() > villePlusLongue.length()) {
                villePlusLongue = ville;
            }
        }

        System.out.println(villePlusLongue);

        for (String ville : liste) {
            liste.set(liste.indexOf(ville), ville.toUpperCase());
        }

        liste.removeIf(ville -> ville.startsWith("N"));

        System.out.println(liste);
    }
}
