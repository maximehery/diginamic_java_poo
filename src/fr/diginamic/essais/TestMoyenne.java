package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne calculMoyenne = new CalculMoyenne();

        calculMoyenne.add(1.0);
        calculMoyenne.add(2.0);
        calculMoyenne.add(3.0);
        calculMoyenne.add(4.0);
        calculMoyenne.add(5.0);

        calculMoyenne.calcul();
    }
}
