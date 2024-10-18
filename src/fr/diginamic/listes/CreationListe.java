package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        // Création d'une liste d'entiers
        ArrayList<Integer> listeEntiers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            listeEntiers.add(i);
        }
        // Affichage de la taille de la liste
        System.out.println(listeEntiers.size());
    }
}
