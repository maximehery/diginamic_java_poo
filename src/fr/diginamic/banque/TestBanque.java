package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[2];

        comptes[0] = new Compte(19736, 1000);
        comptes[1] = new CompteTaux(19737, 2000, 0.5);

        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
