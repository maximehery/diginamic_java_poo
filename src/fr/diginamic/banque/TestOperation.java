package fr.diginamic.banque;

import java.util.ArrayList;

public class TestOperation {
    public static void main(String[] args) {
        ArrayList<Operation> operations = new ArrayList<>();

        operations.add(new Credit("01/01/2020", 1000));
        operations.add(new Debit("02/01/2020", 2000));
        operations.add(new Credit("03/01/2020", 3000));
        operations.add(new Debit("04/01/2020", 4000));

        for (Operation operation : operations) {
            System.out.println("Date de l'operation : " + operation.getDateOperation());
            System.out.println("Montant de l'operation : " + operation.getMontant());
            System.out.println("Type de l'operation : " + operation.getType());
        }

        double total = 0;
        for (Operation operation : operations) {
            if (operation.getType().equals("CREDIT")) {
                total += operation.getMontant();
            } else {
                total -= operation.getMontant();
            }
        }

        System.out.println("Total : " + total);
    }
}
