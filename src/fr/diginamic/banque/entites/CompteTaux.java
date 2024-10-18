package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double taux;

    public CompteTaux(int numero, double solde, double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + ", taux=" + taux;
    }
}
