package fr.diginamic.operations;

import java.util.ArrayList;

public class CalculMoyenne {
    private ArrayList<Double> list = new ArrayList<>();

    public void add(double value) {
        list.add(value);
    }

    public void calcul() {
        double somme = 0;
        for (double value : list) {
            somme += value;
        }

        System.out.println("La moyenne est de : " + (somme / list.size()));
    }
}
