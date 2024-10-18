package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int capaciteMax;
    private int nombreClientsInscrits;
    private double recetteTotale;

    public Theatre(String nom, int capaciteMax, int nombreClientsInscrits, double recetteTotale) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.nombreClientsInscrits = 0;
        this.recetteTotale = 0.0;
    }

    public void inscrire(int nombreClients, double prix) {
        if (nombreClientsInscrits + nombreClients <= capaciteMax) {
            nombreClientsInscrits += nombreClients;
            recetteTotale += nombreClients * prix;
        } else {
            System.out.println("Capacité max atteinte");
        }
    }

    public String getNom() {
        return nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public int getNombreClientsInscrits() {
        return nombreClientsInscrits;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }
}
