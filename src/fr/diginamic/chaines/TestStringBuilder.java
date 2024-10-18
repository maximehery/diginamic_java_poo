package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long debut = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }

        long fin = System.currentTimeMillis();

        System.out.println("Temps d'exécution : " + (fin - debut) + " ms");

        long debut2 = System.currentTimeMillis();

        String chaine = "";
        for (int i = 0; i < 100000; i++) {
            chaine += i;
        }

        long fin2 = System.currentTimeMillis();

        System.out.println("Temps d'exécution : " + (fin2 - debut2) + " ms");
    }
}
