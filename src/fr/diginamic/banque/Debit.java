package fr.diginamic.banque;

public class Debit extends Operation {
    public Debit(String dateOperation, double montant) {
        super(dateOperation, montant);
    }

    @Override
    public String getType() {
        return "DEBIT";
    }
}
