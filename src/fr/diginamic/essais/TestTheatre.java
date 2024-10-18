package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("Théatre", 100, 0, 0.0);

        theatre.inscrire(10, 10.0);
        theatre.inscrire(15, 10.0);
        theatre.inscrire(20, 10.0);
        theatre.inscrire(25, 10.0);
        theatre.inscrire(30, 10.0);
        theatre.inscrire(35, 10.0);

        System.out.println("Total de clients inscrits : " + theatre.getNombreClientsInscrits());
        System.out.println("Recette totale : " + theatre.getRecetteTotale());
    }
}
