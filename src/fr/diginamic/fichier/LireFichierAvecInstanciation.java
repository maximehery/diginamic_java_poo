package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LireFichierAvecInstanciation {
    public static void main(String[] args) throws IOException {
        ArrayList<Ville> listeVille = new ArrayList<>();
        Path path = Paths.get("C:\\Users\\maxim\\Desktop\\recensement.csv");

        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] elements = line.split(";");

            Integer codeDepartement = Integer.valueOf(elements[0]);
            String nomDeLaRegion = elements[1];
            String nom = elements[6];
            Integer populationTotale = Integer.valueOf(elements[9].replace(" ", ""));

            listeVille.add(new Ville(codeDepartement, nomDeLaRegion, nom, populationTotale));
        }

        for (Ville ville : listeVille) {
            System.out.println(ville);
        }
    }
}
