package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        for (Saison saison : Saison.values()) {
            System.out.println(saison);
        }

        String nom = "ETE";
        System.out.println(Saison.valueOf(nom));

        String libelle = "Hiver";
        Saison saison = Saison.fromLibelle(libelle);
        if (saison == Saison.HIVER) {
            System.out.println("c'est ok!!!");
        }
    }
}
