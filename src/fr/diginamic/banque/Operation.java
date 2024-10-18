package fr.diginamic.banque;

public abstract class Operation {
    private String dateOperation;
    private double montant;

    public Operation(String dateOperation, double montant) {
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    public abstract String getType();

    public String getDateOperation() {
        return dateOperation;
    }

    public double getMontant() {
        return montant;
    }
}
