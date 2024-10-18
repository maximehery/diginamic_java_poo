package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\maxim\\Desktop\\recensement.csv");

        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        List<String> premieresLignes = lines.subList(0, 100);
        Files.write(Paths.get("C:\\Users\\maxim\\Desktop\\recensement_100.csv"), premieresLignes, StandardCharsets.UTF_8);
    }
}
