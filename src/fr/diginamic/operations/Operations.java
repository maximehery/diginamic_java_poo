package fr.diginamic.operations;

public class Operations {
    public void calcul(double a, double b, char operateur) {
        if (operateur == '+') {
            System.out.println("Le resultat de l'addition est : " + (a + b));
        } else if (operateur == '-') {
            System.out.println("Le resultat de la soustraction est : " + (a - b));
        } else if (operateur == '*') {
            System.out.println("Le resultat de la multiplication est : " + (a * b));
        } else if (operateur == '/') {
            System.out.println("Le resultat de la division est : " + (a / b));
        }
    }
}
