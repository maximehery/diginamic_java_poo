package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GenererFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\maxim\\Desktop\\recensement.csv");
        Path pathCible = Paths.get("C:\\Users\\maxim\\Desktop\\test\\recensement_25000.csv");

        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        int population = Integer.parseInt(lines.get(9));

        for (int i = 1; i < lines.size(); i++) {
            if (population >= 25000) {
                String line = lines.get(i);
                String[] elements = line.split(";");
                Integer codeDepartement = Integer.valueOf(elements[0]);
                String nomDeLaRegion = elements[1];
                String nom = elements[6];
                int populationTotale = Integer.parseInt(elements[9].replace(" ", ""));
                Files.write(pathCible, (codeDepartement + ";" + nomDeLaRegion + ";" + nom + ";" + populationTotale + "\n").getBytes(), (OpenOption) StandardCharsets.UTF_8);
            }
        }
    }
}
