package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String[] args) {
        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> list3 = new ArrayList<>();

        for (String couleur : liste1) {
            if (!liste2.contains(couleur)) {
                list3.add(couleur);
            }
        }

        for (String couleur : liste2) {
            if (!liste1.contains(couleur)) {
                list3.add(couleur);
            }
        }

        System.out.println(list3);
    }
}
