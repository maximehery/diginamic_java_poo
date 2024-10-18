package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        Operations operations = new Operations();

        operations.calcul(1, 2, '+');
        operations.calcul(4, 2, '-');
        operations.calcul(10, 2, '*');
        operations.calcul(50, 2, '/');
    }
}
